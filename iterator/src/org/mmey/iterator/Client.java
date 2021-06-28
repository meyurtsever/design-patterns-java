package org.mmey.iterator;



public class Client {

	public static void main(String[] args) {
		
		// Clientin, concreate repolarin veri yapisini bilmesine gerek yoktur.
		// Iterator ile listenin icerisinde dolasabilir.
		
		System.out.println("Getting server list...");
		Repository serverContainer = new ServerRepository();
		Iterator serverIterator = serverContainer.createIterator();
		
		while (serverIterator.hasNext()) {
			Object object = serverIterator.next();
			System.out.println(object);
		}
		
		System.out.println("Getting character list...");
		Repository characterContainer = new CharacterRepository();
		Iterator characterIterator = characterContainer.createIterator();
		
		while (characterIterator.hasNext()) {
			Object object = characterIterator.next();
			System.out.println(object);
		}
	}

}
