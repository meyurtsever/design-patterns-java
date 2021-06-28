package org.mmey.decorator;

public abstract class DataSourceDecorator implements DataSource {	
	protected DataSource decoratedDataSource;
	
	public DataSourceDecorator(DataSource decoratedDataSource) {
		super();
		this.decoratedDataSource = decoratedDataSource;
	}
}
