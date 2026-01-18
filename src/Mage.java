public class Mage extends Character {

    public Mage(String name, Weapon weapon) {
        super(name, 80, weapon);
    }



    public void attack() {
        System.out.println(name + " Summons a fireball with their wand, (" + weapon.getName() + ") dealing " + weapon.getDmg() + " damage it cauterizes the wound.\n" );
    }

    public void defend() {
        System.out.println(name + " summons a magic barrier to block the incoming attack.\n");

    }
}