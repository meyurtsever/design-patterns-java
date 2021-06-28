package org.mmey.decorator;

public class XMLData implements DataSource {

	@Override
	public void writeData() {
		System.out.println("Writing XML Data source.");
	}

	@Override
	public void readData() {
		System.out.println("Reading XML Data source.");
	}

}
