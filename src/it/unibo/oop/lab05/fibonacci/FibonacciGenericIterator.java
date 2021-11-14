package it.unibo.oop.lab05.fibonacci;

import java.util.Iterator;
import java.util.Vector;

public abstract class FibonacciGenericIterator implements Iterator<Integer> {
	
	protected final Vector<Integer> vector = new Vector<>();
	private int counter;
	
	public FibonacciGenericIterator() {
		this.counter = 0;
	}
	
	public abstract boolean hasNext();
	
	@Override
	public Integer next() {
		if(this.counter < 2) {
			vector.addElement(1);
		} else {
			vector.addElement(vector.get(this.counter-1) + vector.get(this.counter-2));
		}
		return vector.get(this.counter ++);
	}
	
	public int getCounter() {
		return this.counter;
	}
}
