package it.unibo.oop.lab05.ex5;

import java.util.Collection;
//import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 */
public final class Utilities {

	private Utilities() { }

	/**
	 * @param setA
	 *            a set
	 * @param setB
	 *            another set
	 * @param <X>
	 *            Returned collection type
	 * @return a new set that is the union of the input sets.
	 */
	public static <X> Set<X> setUnion(final Set<? extends X> setA, final Set<? extends X> setB) {
		final Set<X> setC = new LinkedHashSet<>(setA.size() + setB.size());
		
		setC.addAll(setA);
		setC.addAll(setB);
		return setC;
	}

	/**
	 * @param setA
	 *            a set
	 * @param setB
	 *            another set
	 * @param <X>
	 *            Returned collection type
	 * @return a new set that is the intersection of the input sets.
	 */
	public static <X> Set<X> setIntersection(final Set<? extends X> setA, final Set<? extends X> setB) {
		final Set<X> setC = new LinkedHashSet<>(Math.min(setA.size(), setB.size()));
		for (final X elem : setA) {
			if (setB.contains(elem)) {
				setC.add(elem);
			}
		}
		return setC;
	}

	/**
	 * @param setA
	 *            a set
	 * @param setB
	 *            another set
	 * @param <X>
	 *            Returned collection type
	 * @return a new set that is the symmetric difference of the input sets.
	 */
	public static <X> Set<X> setSymmetricDifference(final Set<? extends X> setA, final Set<? extends X> setB) {
		final Set<X> setC = Utilities.setUnion(setA, setB);
		//System.out.println(setC);
		setC.removeAll(Utilities.setIntersection(setA, setB));
		//System.out.println(setC);
		return setC;
	}

	/**
	 * @param coll
	 *            the collection
	 * @param <X>
	 *            collection type
	 * @return a random element from the collection
	 *
	 */
	public static <X> X getRandomElement(final Collection<X> coll) {
		/*
		final Random rand = new Random();
		final int index = Math.floor(rand.nextDouble() * coll.size()).intValue();
		//System.out.println(index.toString());
		final Iterator<X> it = coll.iterator();
		for (long i = 0; i < index ; i++) {
			if (it.hasNext()) {
				it.next();
			}
		}
		return it.next();
		*/
		int n = new Random().nextInt(coll.size());
		for (final X x : coll) {
			if (n == 0) {
				return x;
			}
			n--;
		}
		return null;
	}

	/**
	 * @param first
	 *            first collection
	 * @param second
	 *            second collection
	 * @param <X>
	 *            First collection type
	 * @param <Y>
	 *            Second collection type
	 * @return a pair with two random elements
	 */
	public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> first, final Collection<Y> second) {
		return new Pair<X, Y>(Utilities.getRandomElement(first), Utilities.getRandomElement(second));
	}
}
