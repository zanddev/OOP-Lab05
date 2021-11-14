package it.unibo.oop.lab05.fibonacci;

public class FibonacciMaxNumIterator extends FibonacciGenericIterator {
	
	private final int maxFib;
	
	public FibonacciMaxNumIterator(final int maxFib) {
		super();
		this.maxFib = maxFib;
	}
	
	private int computeNext() {
		int next;
		if(super.getCounter() < 2) {
			next = 1;
		} else {
			next = super.vector.get(super.getCounter()-1) + super.vector.get(super.getCounter()-2);
		}
		return next;
	}
	
	@Override
	public boolean hasNext() {
		if(super.vector.size() == 0) {
			return true;
		} else {
			//return (super.vector.get(super.getCounter()-1) < this.maxFib);
			return (this.computeNext() < this.maxFib);
		}
	}
}
