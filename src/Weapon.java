import java.util.Random;
import java.math.BigDecimal;

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

    public void setCritBoolean(boolean critBoolean){this.critBoolean = critBoolean;}

    public void setName(String name){this.name = name;}

    public void setDmg(int dmg){this.dmg = dmg;}

    public void setCritChance(int critChance){this.critChance = critChance;}

    public int dmgCalc(){

        Random dice = new Random();
        int critChance1 = getCritChance();
        int dmg1 = getDmg();
        int modifier = dice.nextInt(100);
        if(modifier < critChance1){
            critBoolean = true;
            BigDecimal dmg2 = BigDecimal.valueOf(dmg1);
            BigDecimal finalDmg = dmg2.multiply(BigDecimal.valueOf(1.0 + dice.nextDouble()));
            return finalDmg.intValue();
        } else {
            critBoolean = false;
            return dmg1;
        }
    }
}