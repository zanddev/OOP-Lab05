package it.unibo.oop.lab05.fibonacci;

import java.util.Iterator;
import java.util.Vector;

public class UseIterator {

	public static void main(String[] args) {
		
		// initialise first iterator
		final Vector<Integer> vector = new Vector<>();
		for(int i = 1; i <= 3; i++) {
			vector.addElement(i);
		}
		
		// create the iterators ..
		final Iterator<Integer> int_iterator = new VectorIterator<>(vector);
		final Iterator<Integer> fib_iterator = new FibonacciLimitedIterator(10);
		
		final Iterator<Integer> fib_inf_iterator = new FibonacciIterator();
		final Iterator<Integer> fib_max_iterator = new FibonacciMaxNumIterator(100);
		
		// prints their content ..
		UseIterator.print(int_iterator);// prints 1 2 3
		System.out.println("");
		UseIterator.print(fib_iterator);// print first <n> fibonacci numbers
		System.out.println("");
		UseIterator.print(fib_inf_iterator);// prints all fibonacci numbers
		System.out.println("");
		UseIterator.print(fib_max_iterator);// prints all fibonacci numbers below <n>
	}
	
	static void print(Iterator<Integer> iterator) {
		if(iterator instanceof FibonacciIterator) {
			for(int i = 0; i < 15; i++) {
				if(iterator.hasNext()) {
					System.out.println("Elemento: " + iterator.next());
				}
			}
		} else {
			while (iterator.hasNext()) {
				System.out.println("Elemento: " + iterator.next());
			}
		}
	}
}
