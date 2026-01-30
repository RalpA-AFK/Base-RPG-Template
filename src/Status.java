public class Status {

    private String statusName;
    private int tickDamage,turnCount;
    private boolean statusBoolean;

    public Status(String statusName, int tickDamage, int turnCount){
        this.statusName = statusName;
        this.tickDamage = tickDamage;
        this.turnCount = turnCount;
    }
    public Status(String statusName, boolean statusBoolean, int turnCount){
        this.statusName = statusName;
        this.statusBoolean = statusBoolean;
        this.turnCount = turnCount;
    }

   /* public static StatusCalc(){
        switch(){
            case 1:
                break;

            case 2:
                break;
    } */


    public void setTickDamage(int tickDamage){this.tickDamage = tickDamage;}

    public void setTurnCount(int turnCount){this.turnCount = turnCount;}

    public void setStatusName(String statusName){this.statusName = statusName;}

    public int getTickDamage() {return tickDamage;}

    public int getTurnCount(){return turnCount;}

    public String getStatusName(){return statusName;}


}
