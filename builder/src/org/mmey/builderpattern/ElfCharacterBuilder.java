package org.mmey.builderpattern;

public class ElfCharacterBuilder implements CharacterBuilder {
	
	private Character character;
	
	public ElfCharacterBuilder() {
		this.character = new Character();
	}

	@Override
	public void buildCharacterRace() {
		character.setRace("Elves");
	}

	@Override
	public void buildCharacterSubspecies() {
		character.setSubspecies("Aen Elle");
	}

	@Override
	public void buildCharacterArmorType() {
		character.setArmorType("Light Armor");
	}

	@Override
	public void buildCharacterWeapon() {
		character.setWeapon("Staff");
	}

	@Override
	public Character getCharacter() {
		return this.character;
	}

}
