package org.mmey.decorator;

public class EncDecorator extends DataSourceDecorator {

	public EncDecorator(DataSource decoratedDataSource) {
		super(decoratedDataSource);
	}
	
	@Override
	public void writeData() {
		decoratedDataSource.writeData();
		applyEncryption(decoratedDataSource);
	}
	
	private void applyEncryption(DataSource decoratedDataSource) {
		System.out.println("Data encrypted!");
	}

	@Override
	public void readData() {
		decoratedDataSource.readData();
	}

}
