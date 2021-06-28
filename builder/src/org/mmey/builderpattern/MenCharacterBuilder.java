package org.mmey.builderpattern;

public class MenCharacterBuilder implements CharacterBuilder {
	
	private Character character;
	
	public MenCharacterBuilder() {
		this.character = new Character();
	}

	@Override
	public void buildCharacterRace() {
		character.setRace("Humans");
	}

	@Override
	public void buildCharacterSubspecies() {
		character.setSubspecies("Northern People");
	}

	@Override
	public void buildCharacterArmorType() {
		character.setArmorType("Heavy Armor");
	}

	@Override
	public void buildCharacterWeapon() {
		character.setWeapon("Sword & Shield");
	}

	@Override
	public Character getCharacter() {
		return this.character;
	}
	
}
