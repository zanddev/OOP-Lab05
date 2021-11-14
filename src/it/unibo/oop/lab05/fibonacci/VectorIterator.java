package it.unibo.oop.lab05.fibonacci;

import java.util.Iterator;
import java.util.Vector;

/* Iterate all elements of a Vector */
public class VectorIterator<E> implements Iterator<E> {
	
	private final Vector<E> vector;	// Vector to iterate
	private int current;			// Position in the Vector
	
	public VectorIterator(final Vector<E> vector) {
		this.vector = vector;
		this.current = 0;
	}
	
	@Override
	public boolean hasNext() {
		return this.vector.size() > this.current;
	}
	
	@Override
	public E next() {
		return this.vector.elementAt(this.current ++);
	}
}
