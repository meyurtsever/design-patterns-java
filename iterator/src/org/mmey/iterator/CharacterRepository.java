package org.mmey.iterator;



public class CharacterRepository implements Repository {
	
	private String[] Characters = {"Aen Elle", "Dwarf Uri", "Human Deus", "Half-elf Simon"};
	
	public Iterator createIterator() {
		CharacterIterator result = new CharacterIterator();
		return result;
	}
	
	private class CharacterIterator implements Iterator {
		private int position;
		
		@Override
		public boolean hasNext() {
			if (position < Characters.length)
				return true;
			else
				return false;
		}
		
		@Override
		public Object next() {
			if (this.hasNext())
				return Characters[position++];
			return null;
		}		
	}
}
