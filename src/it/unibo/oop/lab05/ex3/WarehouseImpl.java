package it.unibo.oop.lab05.ex3;

import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse {

	private final LinkedHashSet<String> list = new LinkedHashSet<>();
	private final LinkedHashSet<Product> stock = new LinkedHashSet<>();
	
	public void addProduct(Product p) {
		stock.add(p);
		list.add(p.getName());
	}

	@SuppressWarnings("unchecked")
	public Set<String> allNames() {
		return (Set<String>) list.clone();
	}

	@SuppressWarnings("unchecked")
	public Set<Product> allProducts() {
		return (Set<Product>) stock.clone();
	}

	public boolean containsProduct(Product p) {
		return stock.contains(p);
	}

	public double getQuantity(String name) {
		for (Product p : stock) {
			if (p.getName().equals(name)) {
				return p.getQuantity();
			}
		}
		return -1;
	}
}
