// some weapons are unimplemented to add more however time does not allow it as I have work in a few minutes and I will be coming home after the deadline

public class Main {

	public static void main(String[] args) {
		Weapon Sword = new Weapon("Iron Sword", 20);
		Weapon Shield = new Weapon("Iron shield", 0);
		Weapon Bow = new Weapon("Daedalus", 40);
		Weapon Dagger = new Weapon("Black Steel Dagger", 15);
		Weapon Rosary = new Weapon("Unyielding Cross", 10 );
		Weapon Staff = new Weapon("Inferno staff", 30);
				
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
