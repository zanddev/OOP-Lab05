package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {

	private final String name;
	private double quantity;

	public ProductImpl(String name, double quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public String getName() {
		return this.name;
	}

	public double getQuantity() {
		return this.quantity;
	}
}
