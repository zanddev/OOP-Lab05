package it.unibo.oop.lab05.fibonacci;

public class FibonacciLimitedIterator extends FibonacciGenericIterator {
	
	private final int counterLimit;
	
	public FibonacciLimitedIterator(final int maxNumOfFibNums) {
		super();
		this.counterLimit = maxNumOfFibNums;
	}
	
	@Override
	public boolean hasNext() {
		return (super.getCounter() < this.counterLimit);
	}
}
