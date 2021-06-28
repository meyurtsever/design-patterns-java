package org.mmey.builderpattern;

public class TestCharacterBuilder {

	public static void main(String[] args) {
		
		CharacterBuilder elvenCharacter = new ElfCharacterBuilder();		
		
		CharacterMaker characterMaker = new CharacterMaker(elvenCharacter);	
		characterMaker.makeCharacter();
		
		Character firstElf = characterMaker.getCharacter();
		
		System.out.println("Character Created!");		
		System.out.println(firstElf);
		
		// resetting maker type...
		characterMaker = null;
		
		CharacterBuilder menCharacter = new MenCharacterBuilder();
		
		characterMaker = new CharacterMaker(menCharacter);
		characterMaker.makeCharacter();
		
		Character firstMen = characterMaker.getCharacter();
		
		System.out.println("Character Created!");
		System.out.println(firstMen);
		
	}

}
