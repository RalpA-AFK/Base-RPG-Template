package src;

public class Archer extends Character {
	private Weapon weapon2;
	public Archer(String name, Weapon weapon, Weapon weapon2) {

        super(name, 100, weapon);
        this.weapon = weapon2;
	}

	public void attack() {
		System.out.println(name + " Shoots their bow: (" + weapon.getName() + ") dealing " + weapon.getDmg() + " damage.\n" );
	}
	
	public void defend() {
		System.out.println(name + " parries the incoming attack with their dagger.");
	}
}
