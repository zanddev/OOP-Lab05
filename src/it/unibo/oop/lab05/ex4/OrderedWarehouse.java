package it.unibo.oop.lab05.ex4;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import it.unibo.oop.lab05.ex3.WarehouseImpl;
import it.unibo.oop.lab05.ex3.Warehouse;

public class OrderedWarehouse extends WarehouseImpl implements Warehouse {

	public OrderedWarehouse() {
		super();
	}

	@Override
	public Set<String> allNames() {
		Set<String> copySet = super.allNames();
		List<String> copyList = new LinkedList<>(copySet);
		Collections.sort(copyList);
		//return Set.copyOf(copyList);
		return new LinkedHashSet<String>(copyList);
	}
}
