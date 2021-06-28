package org.mmey.observerPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class SpecialTopic implements Subject{

	private ArrayList<Observer> observers;
	private double premiumPrice;
	private double excPackagePrice;
	
	public SpecialTopic() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void subscribe(Observer observer) {
		observers.add(observer);		
	}

	@Override
	public void unsubscribe(Observer observer) {
		int observerIdx = observers.indexOf(observer);		
		System.out.println("Observer: " + (observerIdx) + " unsubscribed from the channel.");		
		
		observers.remove(observerIdx);
	}

	@Override
	public void notifyObserver() {
		System.out.println("\nPrices changed! Sending message to all observers");
		
		//for (Observer observer : observers) {
		//	observer.update(premiumPrice, excPackagePrice);
		//}
		
		Iterator<Observer> it = observers.iterator();
		while (it.hasNext()) {
			Observer observerUser = it.next();
			observerUser.update(premiumPrice, excPackagePrice);
		}
		
		System.out.println("New price notification sent to all observers");
	}
	
	public void setPremiumPrice (double newPremiumPrice) {
		this.premiumPrice = newPremiumPrice;
		notifyObserver();
	}
	
	public void setExcPackagePrice (double newExclusivePackagePrice) {
		this.excPackagePrice = newExclusivePackagePrice;
		notifyObserver();
	}

}
