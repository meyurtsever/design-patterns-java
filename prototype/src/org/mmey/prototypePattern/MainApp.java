package org.mmey.prototypePattern;

public class MainApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Elves elf = new Elves();
		elf.initCharacter();
		
		Elves clonedElf = (Elves) elf.clone();
		
		// DEEP COPY (also copies objects)
		clonedElf.setLanguage("New Elven Language");
		elf.getCharDetail().setName("Aen Elle");
		clonedElf.getCharDetail().setName("New Elves");
		
		System.out.println("Checking primitive data types: ");
		System.out.println("Original Elf Language: " + elf.getLanguage());
		System.out.println("Cloned Elf Language: " + clonedElf.getLanguage() + "\n");
		
		System.out.println("Checking objects: ");
		System.out.println("Original Elf Name: " + elf.getCharDetail().getName());
		System.out.println("Cloned Elf Name: " + clonedElf.getCharDetail().getName() + "\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// DEEP COPY (also copies objects)
		//elf.getCharDetail().setName("Original Elf");
		//copyElf.getCharDetail().setName("Copy Elf");
		
		// display results
		//elf.displayRace();
		//copyElf.displayRace();
	}

}
