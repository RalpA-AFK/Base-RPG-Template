public class Warrior extends Character {
    private Weapon Weapon2;
    public Warrior(String name, Weapon weapon, Weapon Weapon2) {

        super(name, 150, weapon);
        this.Weapon2 = Weapon2;
    }

    public void attack() {
        System.out.println(name + " slashes at the enemy with (" + weapon.getName() + "), dealing " + weapon.dmgCalc() + " damage and applying bleed to the opponent.\n" );
    }

    public void defend() {
        System.out.println(name + " blocks with his shield.");
    }
}
