package it.unibo.oop.lab05.ex1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

	static final boolean SET_RANDOMGEN = false;

	private UseSet() {
	}

	/**
	 * @param args
	 *            ignored
	 */
	public static void main(final String[] args) {
	
		// 1 - Builds a TreeSet containing Strings
		final Set<String> tree = new TreeSet<>();
	
		/*
		 * 2 - Populates such Collection with all the Strings ranging from
		 *   "1" to "20"
		 */
		for (int i = 1; i <= 20; i++) {
			if (UseSet.SET_RANDOMGEN) {
				tree.add(Integer.toString((int) (i * 100 * Math.random())));
			} else {
				tree.add(Integer.toString(i));
			}
		}
	
		// 3 - Prints its content
		System.out.println(tree.toString());

		/*
		 * 4 - Removes all those strings whose represented number is divisible by
		 * three
		 */
		{
			final Iterator<String> iterator = tree.iterator();
			
			while (iterator.hasNext()) {
				String chk = iterator.next();
				if (Integer.parseInt(chk) % 3 == 0) {
					//tree.remove(chk);
					iterator.remove();
				}
			}
		} 
		/*
		 * 4 - Removes all those strings whose represented number is divisible by
		 * three
		 */
		/*
		{
			Iterator<String> iterator = tree.iterator();
			while(iterator.hasNext()) {
				String chk = iterator.next();
					
				int sumValue = 0;
				for (int index = 0; index < chk.length(); index++) {
					sumValue += Integer.parseInt(Character.toString(chk.charAt(index)));
				}
				//System.out.print(sumValue);
				if(sumValue % 3 == 0) iterator.remove();
			}
		}
		*/
	
		// 5 - Prints the content of the Set
		System.out.println(tree.toString());
	
		// 5 - Prints the content of the Set using a for-each construct
		Iterator<String> iterator = tree.iterator();
		System.out.print("[");
		for(final String chk : tree) {
			System.out.print(chk + ", ");
		}
		System.out.println("]");
	
		// 6 - Verifies if all the numbers left in the set are even
		boolean areAllEven = true;
		while (iterator.hasNext()) {
			String chk = iterator.next();
			areAllEven = areAllEven && (Integer.parseInt(chk) % 2 == 0);
			if(Integer.parseInt(chk) % 3 == 0);
		}
		if (areAllEven) {
			System.out.println("Element in the set are all even.");
		} else {
			System.out.println("Some element in the set are odd!");
		}
	}
}
