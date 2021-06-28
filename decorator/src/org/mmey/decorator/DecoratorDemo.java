package org.mmey.decorator;

public class DecoratorDemo {

	public static void main(String[] args) {

		//System.out.println("Creating data source objects.");
		//DataSource csv = new CSVData();
		
		//System.out.println("Reading from sources...");
		//csv.readData();
		
		System.out.println("Creating decorated (encrypt and compress) source CSV file...");
		DataSource decCsv = new EncDecorator(new CompressDecorator(new CSVData()));
		
		decCsv.writeData();

	}

}
