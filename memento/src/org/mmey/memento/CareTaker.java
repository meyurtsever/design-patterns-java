package org.mmey.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {	
	private List<Memento> mementoList = new ArrayList<Memento>();
	
	public void addMemento(Memento inventory) {
		mementoList.add(inventory);
	}
	
	public Memento getMemento(int idx) {
		return mementoList.get(idx);
	}

	public List<Memento> getMementoList() {
		return mementoList;
	}
	
}
