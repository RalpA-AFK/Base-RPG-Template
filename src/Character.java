public abstract class Character {
    protected String name;
    protected int health;
    protected Weapon weapon;

    public Character(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth(){
        return health;
    }

    public abstract void attack();
    public abstract void defend();
}
