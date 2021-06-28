package org.mmey.prototypePattern;

public class Elves extends Race implements Cloneable{

	@Override
	public void initCharacter() {		
		System.out.println("Now inside Elves::initCharacter()");     
		
        // Set some predefined specs for Elves.
        setSubspecies("Quarter-elves");
        setLanguage("Common Speech");
        setLocation("Blue Mountains, Nilfgaardian Empire");
        setLifeSpan(350);
        
        // setChar default
        charDetail = new Character();
        charDetail.setName("Aen Elle");
	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
		Elves cloned = (Elves) super.clone();
		cloned.setCharDetail((Character)cloned.getCharDetail().clone());
        return cloned;
    }
	
	/*
	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	*/
}
