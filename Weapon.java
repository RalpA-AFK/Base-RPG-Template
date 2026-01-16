import java.util.Random;
import java.util.BigDecimal;

public class Weapon {
	private String name; 
	private int dmg;
    private int critChance;
    private boolean critBoolean;
	
	public Weapon(String name, int dmg, int critChance) {
		this.name = name;
		this.dmg = dmg;
        this.critChance = critChance;
	}
	
	public String getName() {return name;}

	public int getDmg() {return dmg;}

    public int getCritChance(){return critChance;}

    public boolean getCritBoolean(){return critBoolean;}

    public boolean setCritBoolean(boolean critBoolean){this.critBoolean = critBoolean;}

    public String setName(int name){this.name = name;}

    public int setDmg(int dmg){this.dmg = dmg;}

    public int setCritChance(int critChance){this.critChance = critChance;}

    public int dmgCalc(){

        Random dice = new Random();
        int critChance1 = getCritChance();
        int dmg1 = getDmg();
        int modifier = dice.nextInt(100);
        if(modifier <= critChance1){
            critBoolean = true;
            setCritBoolean(critBoolean);
            BigDecimal dmg1 = BigDecimal.valueOf(dmg1);
            dmg1 = dmg1.divide(100);
            critRange = dice.nextInt(15)
        } else {
            critBoolean = false;
            setCritBoolean(critBoolean);
        }
    }
}
