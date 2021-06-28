package org.mmey.decorator;

public class CompressDecorator extends DataSourceDecorator {

	public CompressDecorator(DataSource decoratedDataSource) {
		super(decoratedDataSource);
	}

	@Override
	public void writeData() {
		decoratedDataSource.writeData();
		compressFile();

	}

	private void compressFile() {
		System.out.println("File successfully compressed!");
	}

	@Override
	public void readData() {
		decoratedDataSource.readData();

	}

}
