package org.mmey.decorator;

public class CSVData implements DataSource {

	@Override
	public void writeData() {
		System.out.println("Writing used CSV data source.");
	}

	@Override
	public void readData() {
		System.out.println("Read from CSV data source.");
	}

}
