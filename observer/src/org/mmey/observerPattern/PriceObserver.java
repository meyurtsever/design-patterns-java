package org.mmey.observerPattern;

public class PriceObserver implements Observer {
	
	private double premiumPrice;
	private double excPackagePrice;
	
	private static int observerIDTracker = 0;
	private  int observerID;
	
	private Subject specialTopic;
	
	public PriceObserver(Subject specialTopic) {
		// attach observer to subject
		this.specialTopic = specialTopic;
		this.observerID = ++observerIDTracker;
		System.out.println("\nNew Observer added. ID: " + this.observerID);
	}

	@Override
	public void update(double premiumPrice, double excPackagePrice) {
		this.premiumPrice = premiumPrice;
		this.excPackagePrice = excPackagePrice;
		
		showPrices();
	}

	private void showPrices() {
		System.out.println("Observer ID: " + observerID + "\nPremium Package: " + premiumPrice 
							+ "\nExclusive Package: " + excPackagePrice + "\n");
	}

}
