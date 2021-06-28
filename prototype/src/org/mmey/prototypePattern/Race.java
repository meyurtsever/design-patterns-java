package org.mmey.prototypePattern;

public abstract class Race {
    
    private String subspecies;
    private String language;
    private String location;
    private int lifeSpan;
    
    Character charDetail;
    
    public abstract void initCharacter();
    
    public void displayRace() {
        System.out.println("");
        System.out.println("Subspecies: " + getSubspecies());
        System.out.println("Language(s): " + getLanguage());
        System.out.println("Location(s): " + getLocation());
        System.out.println("Average Life Span: " + getLifeSpan());
        System.out.println("-----CHAR------");
        System.out.println("Character Name: " + getCharDetail().getName());
        System.out.println("---------------");
    }

    public String getSubspecies() {
        return subspecies;
    }

    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

	public Character getCharDetail() {
		return charDetail;
	}

	public void setCharDetail(Character charDetail) {
		this.charDetail = charDetail;
	}
    
    
    
}
