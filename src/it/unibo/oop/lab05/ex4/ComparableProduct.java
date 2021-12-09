package it.unibo.oop.lab05.ex4;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.ProductImpl;

/**
 * Product implementation, with comparability function.
 */
public class ComparableProduct extends ProductImpl implements Product, Comparable<Product> {

	/**
	 * @param name
	 *            the product name
	 * @param quantity
	 *            the product quantity
	 */
	public ComparableProduct(final String name, final double quantity) {
		super(name, quantity);
	}
	
	@Override
	/**
	 * {@inheritDoc}
	 */
	public int compareTo(final Product next) {
		return (super.getName().compareTo(next.getName()));
	}
}
