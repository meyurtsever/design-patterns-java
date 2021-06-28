package org.mmey.iterator;



import java.util.ArrayList;
import java.util.List;

public class ServerRepository implements Repository {

	private List<String> serverList;
	
	public ServerRepository() {
		serverList = new ArrayList<String>();
		
		serverList.add("Tibet");
		serverList.add("Xian");
		serverList.add("Osiris");
	}
	
	@Override
	public Iterator createIterator() {
		ServerIterator result = new ServerIterator();
		return result;
	}
	
	// Her repoya ozel iterator implement edilir.
	private class ServerIterator implements Iterator {

		@Override
		public boolean hasNext() {
			if (serverList.size() > 0)
				return true;
			else
				return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				String flower = serverList.get(0);
				serverList.remove(0);
				return flower;
			}
			else
				return null;
		}
		
	}

}
