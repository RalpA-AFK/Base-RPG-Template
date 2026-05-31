package entity;

import java.awt.image.BufferedImage;

public class entity {
    public int x , y;
    public int speed; 
    public BufferedImage idleUp1, idleUp2, idleUp3, idleUp4, idleUp5, idleUp6;
    public BufferedImage idleDown1, idleDown2,idleDown3, idleDown4, idleDown5, idleDown6; 
    public BufferedImage idleLeft1, idleLeft2, idleLeft3, idleLeft4, idleLeft5, idleLeft6;
    public BufferedImage idleRight1, idleRight2, idleRight3, idleRight4, idleRight5, idleRight6;

    public BufferedImage runningUp1, runningUp2, runningUp3, runningUp4, runningUp5, runningUp6;
    public BufferedImage runningDown1, runningDown2, runningDown3, runningDown4, runningDown5, runningDown6;
    public BufferedImage runningLeft1, runningLeft2, runningLeft3, runningLeft4, runningLeft5, runningLeft6;
    public BufferedImage runningRight1, runningRight2, runningRight3, runningRight4, runningRight5, runningRight6;

    

    public String direction;

    public int spriteCounter = 0;
    public int spriteNum = 1;
}
