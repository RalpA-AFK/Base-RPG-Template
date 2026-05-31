package entity;

import java.awt.image.BufferedImage;

public class entity {
    public int x , y;
    public int speed;

    // Animation frames stored as [direction][frame]. Direction index: UP=0, DOWN=1, LEFT=2, RIGHT=3
    public BufferedImage[][] running = new BufferedImage[4][6];
    public BufferedImage[][] idle = new BufferedImage[4][6];

    public String direction;
    public boolean moving = false; // true while a movement key is held

    public int spriteCounter = 0;
    public int spriteNum = 1;
}
