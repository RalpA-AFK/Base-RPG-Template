public class Archer extends Character {
	
	public Archer(String name, Weapon weapon) {
		super(name, 100, weapon);
	}

	public void attack() {
		System.out.println(name + " Shoots their bow: (" + weapon.getName() + ") dealing " + weapon.getDmg() + " damage.\n" );
	}
	
	public void defend() {
		System.out.println(name + " parries the incoming attack with their dagger.");
	}
}
