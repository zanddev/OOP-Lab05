package it.unibo.oop.lab05.ex3;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Implementation of a warehouse.
 *
 */
public class WarehouseImpl implements Warehouse {

	//private final Set<String> list = new LinkedHashSet<>();
	//private final Set<Product> stock = new LinkedHashSet<>();
	private final Set<String> list = newSet();
	private final Set<Product> stock = newSet();

	public WarehouseImpl() { }

	/*
	 * {@inheritDoc}
	 */
	public void addProduct(Product p) {
		this.stock.add(p);
		this.list.add(p.getName());
	}

	//@SuppressWarnings("unchecked")
	public Set<String> allNames() {
		//return (Set<String>) this.list.clone();
		
		Set<String> copySet = newSetFrom(this.list);
		return copySet;
	}

	//@SuppressWarnings("unchecked")
	public Set<Product> allProducts() {
		//return (Set<Product>) this.stock.clone();

		return newSetFrom(this.stock);
	}

	public boolean containsProduct(final Product p) {
		return stock.contains(p);
	}

	public double getQuantity(final String name) {
		for (final Product p : this.stock) {
			if (p.getName().equals(name)) {
				return p.getQuantity();
			}
		}
		return -1;
	}

	private static <E> Set<E> newSet() {
		return new LinkedHashSet<>();
	}
	
	private static <E> Set<E> newSetFrom(final Collection<E> orig) {
		return new LinkedHashSet<>(orig);
	}
}
