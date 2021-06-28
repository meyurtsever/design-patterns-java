package org.mmey.builderpattern;

public interface CharacterBuilder {

	public void buildCharacterRace();
	
	public void buildCharacterSubspecies();
	
	public void buildCharacterArmorType();
	
	public void buildCharacterWeapon();
	
	public Character getCharacter();
	
	
}
