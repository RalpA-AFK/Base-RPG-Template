public abstract class Character {
	protected String name;
	protected int health; 
	protected Weapon weapon;
	
	public Character(String name, int health, Weapon weapon) {
		this.name = name;
		this.health = health; 
		this.weapon = weapon;
	}
	
	public abstract void attack();
	public abstract void defend();
}
