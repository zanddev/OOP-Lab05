package it.unibo.oop.lab05.ex2;

import java.util.TreeSet;

/**
 * 
 */
public final class UseSetWithOrder {

	private UseSetWithOrder() {
	}

	/**
	 * @param args
	 *            ignored
	 */
	public static void main(final String[] args) {
		
		/* Creates a new ORDERED TreeSet of Strings. To order the set, define
		 * a new Comparator in a separate class.
		 */
		TreeSet<String> tree = new TreeSet<String>(new OrderedStringDoubleComparator());
		
		/* Inserts in the set a hundred strings containing randomly generated
		 * numbers (use Math.random())
		 */
		for(int i = 0; i < 100; i++) {
			Double rand = Math.random();
			tree.add(rand.toString());
		}
		
		// Prints the set, which must be ordered
		for(String str : tree) {
			System.out.print(str + ", ");
		}
	}
}