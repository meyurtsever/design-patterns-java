package org.mmey.observerPattern;

public class ObserverMain implements Runnable {
	
	private String priceToUpdate;
	private double newPrice;
	
	private Subject specialTopic;
	
	public ObserverMain(Subject specialSubject, String priceToUpdate, double newPrice) {
		this.specialTopic = specialSubject;
		this.priceToUpdate = priceToUpdate;
		this.newPrice = newPrice;
	}

	public static void main(String[] args) {
		SpecialTopic specialTopic = new SpecialTopic();
		
		PriceObserver observerUser1 = new PriceObserver(specialTopic);
		specialTopic.subscribe(observerUser1);
		
		specialTopic.setPremiumPrice(99.99);
		specialTopic.setExcPackagePrice(44.99);
		
		PriceObserver observerUser2 = new PriceObserver(specialTopic);
		specialTopic.subscribe(observerUser2);
		
		specialTopic.setPremiumPrice(139.99);
		specialTopic.setExcPackagePrice(74.99);
		
		//specialTopic.unsubscribe(observerUser2);
		
		//specialTopic.setPremiumPrice(22.22);
		
		// THREAD
		Runnable getPremium = new ObserverMain(specialTopic, "Premium", 91.11);
		Runnable getExclusive = new ObserverMain(specialTopic, "ExclusivePack", 83.33);
		
		new Thread(getPremium).start();
		new Thread(getExclusive).start();
	}

	@Override
	public void run() {

		if(priceToUpdate == "Premium") {
			System.out.println(Thread.currentThread().getName() + " is updating "
					+ priceToUpdate + " price: " + newPrice);
			
			((SpecialTopic)specialTopic).setPremiumPrice(newPrice);
		}	
		if(priceToUpdate == "ExclusivePack") {
			System.out.println(Thread.currentThread().getName() + " is updating "
					+ priceToUpdate + " price: " + newPrice);
			
			((SpecialTopic)specialTopic).setExcPackagePrice(newPrice);			
		}
	}

}
