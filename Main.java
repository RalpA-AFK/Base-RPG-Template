import Weapon.java;

public class Main {

	public static void main(String[] args) {
		Weapon Sword = new Weapon("Iron Sword", 20, 7);
		Weapon Shield = new Weapon("Iron shield", 0, 2);
		Weapon Bow = new Weapon("Daedalus", 40, 23);
		Weapon Dagger = new Weapon("Black Steel Dagger", 10, 25);
		Weapon Rosary = new Weapon("Unyielding Cross", 10, 8);
		Weapon Staff = new Weapon("Inferno staff", 30, 12);
				
		Character Warrior = new Warrior("John", Sword );
		Character Mage = new Mage("Margret", Staff);
		Character Archer = new Archer("Sheila", Bow);
		Character Priest = new Priest("Constantine", Rosary);
		
		Character[] characters = {Warrior, Mage, Archer, Priest};
		
		for(Character c : characters ) {
			c.attack();
			c.defend();
			System.out.println();
		}

	}

}
