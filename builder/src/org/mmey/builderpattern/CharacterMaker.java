package org.mmey.builderpattern;

public class CharacterMaker {
	
	private CharacterBuilder characterBuilder;
	
	public CharacterMaker(CharacterBuilder characterBuilder) {
		this.characterBuilder = characterBuilder;
	}
	
	public Character getCharacter() {
		return this.characterBuilder.getCharacter();
	}
	
	public void makeCharacter() {	
		this.characterBuilder.buildCharacterRace();
		this.characterBuilder.buildCharacterSubspecies();
		this.characterBuilder.buildCharacterArmorType();
		this.characterBuilder.buildCharacterWeapon();
	}

}
