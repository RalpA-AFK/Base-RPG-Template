public class Archer extends Character {
    private Weapon Weapon2;
    public Archer(String name, Weapon weapon, Weapon Weapon2) {

        super(name, 100, weapon);
        this.Weapon2 = Weapon2;
    }

    public void attack() {
        System.out.println(name + " Shoots their bow: (" + weapon.getName() + ") dealing " + weapon.getDmg() + " damage.\n" );
    }

    public void defend() {
        System.out.println(name + " parries the incoming attack with their dagger.");
    }
}