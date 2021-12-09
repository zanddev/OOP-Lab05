package it.unibo.oop.lab05.ex4;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.ProductImpl;

public class ComparableProduct extends ProductImpl implements Product, Comparable<Product> {

	public ComparableProduct(String name, double quantity) {
		super(name, quantity);
	}
	
	@Override
	public int compareTo(Product next) {
		return (super.getName().compareTo(next.getName()));
	}
}
