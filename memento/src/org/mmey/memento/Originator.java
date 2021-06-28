package org.mmey.memento;

import java.util.ArrayList;
import java.util.List;

public class Originator {	
	private List<String> inventory = new ArrayList<>();

	public List<String> getInventory() {
		return inventory;
	}

	public void setInventory(List<String> inventory) {
		System.out.println("Originator: Inventory set: " + inventory.toString());
		this.inventory = inventory;
	}
	
	public Memento saveStateToMemento() {
		System.out.println("Originator: Saving inventory to Memento");
		return new Memento(inventory);
	}
	
	public List<String> getStateFromMemento(Memento memento) {		
		inventory = memento.getInventory();
		System.out.println("Originator: Previously saved inventory of user :" + inventory.toString());
		
		return inventory;
	}
}
