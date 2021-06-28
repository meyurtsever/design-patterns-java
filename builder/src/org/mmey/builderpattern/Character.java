package org.mmey.builderpattern;

public class Character implements CharacterPlan {

	private String race;
	private String subSpecies;
	private String armorType;
	private String weapon;
	
	@Override
	public void setRace(String race) {
		this.race = race;

	}

	@Override
	public void setSubspecies(String subSpecies) {
		this.subSpecies = subSpecies;
	}

	@Override
	public void setArmorType(String armorType) {
		this.armorType = armorType;
	}

	@Override
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getSubSpecies() {
		return subSpecies;
	}

	public String getRace() {
		return race;
	}

	public String getArmorType() {
		return armorType;
	}

	public String getWeapon() {
		return weapon;
	}

	@Override
	public String toString() {
		return "Character [race=" + race + ", subSpecies=" + subSpecies + ", armorType=" + armorType + ", weapon="
				+ weapon + "]";
	}
	
}
