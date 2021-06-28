package org.mmey.memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {	
	private List<String> inventory = new ArrayList<>();
	
	public Memento(List<String> inventory) {
		this.inventory = inventory;
	}

	public List<String> getInventory() {
		return inventory;
	}
	
}
