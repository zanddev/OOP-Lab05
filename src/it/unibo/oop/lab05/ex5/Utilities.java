package it.unibo.oop.lab05.ex5;

import java.util.Collection;
import java.util.Iterator;
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
		for (X elem : setA) {
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
		System.out.println(setC);
		setC.removeAll(Utilities.setIntersection(setA, setB));
		System.out.println(setC);
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
		final Random rand = new Random();
		final Double index = Math.floor(rand.nextDouble() * coll.size());
		//System.out.println(index.toString());
		Iterator<X> it = coll.iterator();
		for (long i = 0; i < index.longValue() ; i++) {
			if (it.hasNext()) {
				it.next();
			}
		}
		
		return it.next();
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
