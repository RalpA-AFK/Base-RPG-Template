package entity;

import main.GamePanel;
import main.KeyHandler;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;

import javax.imageio.ImageIO;



public class Player extends entity {
    GamePanel gp;
    KeyHandler keyH;

    public Player(GamePanel gp, KeyHandler keyH) {
        this.gp = gp;
        this.keyH = keyH;
        setDefaultValue();
        getPlayerImage();
    }
    public void setDefaultValue(){
        x = 100;
        y = 100;
        speed = 4;
        direction = "down";
    }
    public void getPlayerImage(){
        try {
                idleUp1 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightIdle/KnightUpIdle/KnightUpIdle01.png"));
                idleUp2 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightIdle/KnightUpIdle/KnightUpIdle02.png"));
                idleUp3 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightIdle/KnightUpIdle/KnightUpIdle03.png"));
                idleUp4 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightIdle/KnightUpIdle/KnightUpIdle04.png"));
                idleUp5 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightIdle/KnightUpIdle/KnightUpIdle05.png"));
                idleUp6 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightIdle/KnightUpIdle/KnightUpIdle06.png"));

                idleDown1 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightIdle/KnightDownIdle/KnightDownIdle01.png"));
                idleDown2 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightIdle/KnightDownIdle/KnightDownIdle02.png"));
                idleDown3 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightIdle/KnightDownIdle/KnightDownIdle03.png"));
                idleDown4 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightIdle/KnightDownIdle/KnightDownIdle04.png"));
                idleDown5 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightIdle/KnightDownIdle/KnightDownIdle05.png"));
                idleDown6 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightIdle/KnightDownIdle/KnightDownIdle06.png"));

                idleRight1 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightIdle/KnightRightIdle/KnightRightIdle01.png"));
                idleRight2 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightIdle/KnightRightIdle/KnightRightIdle02.png"));
                idleRight3 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightIdle/KnightRightIdle/KnightRightIdle03.png"));
                idleRight4 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightIdle/KnightRightIdle/KnightRightIdle04.png"));
                idleRight5 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightIdle/KnightRightIdle/KnightRightIdle05.png"));
                idleRight6 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightIdle/KnightRightIdle/KnightRightIdle06.png"));

                idleLeft1 = flipHorizontally(idleRight1);
                idleLeft2 = flipHorizontally(idleRight2);
                idleLeft3 = flipHorizontally(idleRight3);
                idleLeft4 = flipHorizontally(idleRight4);
                idleLeft5 = flipHorizontally(idleRight5);
                idleLeft6 = flipHorizontally(idleRight6);

                runningUp1 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightUpRunning/KnightUpRunning01.png"));
                runningUp2 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightUpRunning/KnightUpRunning02.png"));
                runningUp3 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightUpRunning/KnightUpRunning03.png"));
                runningUp4 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightUpRunning/KnightUpRunning04.png"));
                runningUp5 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightUpRunning/KnightUpRunning05.png"));
                runningUp6 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightUpRunning/KnightUpRunning06.png"));

                runningDown1 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightDownRunning/KnightDownRunning01.png"));
                runningDown2 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightDownRunning/KnightDownRunning02.png"));
                runningDown3 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightDownRunning/KnightDownRunning03.png"));
                runningDown4 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightDownRunning/KnightDownRunning04.png"));
                runningDown5 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightDownRunning/KnightDownRunning05.png"));
                runningDown6 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightDownRunning/KnightDownRunning06.png"));

                runningRight1 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightRightRunning/KnightRightRunning01.png"));
                runningRight2 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightRightRunning/KnightRightRunning02.png"));
                runningRight3 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightRightRunning/KnightRightRunning03.png"));
                runningRight4 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightRightRunning/KnightRightRunning04.png"));
                runningRight5 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightRightRunning/KnightRightRunning05.png"));
                runningRight6 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightRightRunning/KnightRightRunning06.png"));

                runningLeft1 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightRightRunning/KnightRightRunning01.png"));
                runningLeft2 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightRightRunning/KnightRightRunning02.png"));
                runningLeft3 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightRightRunning/KnightRightRunning03.png"));
                runningLeft4 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightRightRunning/KnightRightRunning04.png"));
                runningLeft5 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightRightRunning/KnightRightRunning05.png"));
                runningLeft6 = ImageIO.read(getClass().getResourceAsStream("/player/knight/KnightRunning/KnightRightRunning/KnightRightRunning06.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
public void update(){
        if(keyH.upPressed == true){
            direction = "up";
            y -= speed;
            spriteCounter++;
        }else if(keyH.downPressed == true){
            direction = "down";
            y += speed;
            spriteCounter++;
        }else if(keyH.leftPressed == true){
            direction = "left";
            x -= speed  ;
            spriteCounter++;
        }else if(keyH.rightPressed == true){
            direction = "right";
            x += speed;
            spriteCounter++;
        }
        if(spriteCounter > 10){
            if(spriteNum == 1){
                spriteNum = 2;
            } else if(spriteNum == 2){
                spriteNum = 3;
            }else if(spriteNum == 3){
                spriteNum = 4;
            }else if(spriteNum == 4){
                spriteNum = 5;
            }else if(spriteNum == 5){
                spriteNum = 6;
            }else if(spriteNum == 6){
                spriteNum = 1;
            }
            spriteCounter = 0;
        }
    }
public void draw(Graphics2D g2){
        BufferedImage image = null;
        switch(direction){
            case "up":
                if (spriteNum == 1){image = runningUp1;}
                if (spriteNum == 2){image = runningUp2;}
                if (spriteNum == 3){image = runningUp3;}
                if (spriteNum == 4){image = runningUp4;}
                if (spriteNum == 5){image = runningUp5;}
                if(spriteNum == 6){image = runningUp6;}
                break;
            case "down":
                if (spriteNum == 1){image = runningDown1;}
                if(spriteNum == 2){image = runningDown2;}
                if(spriteNum == 3){image = runningDown3;}
                if(spriteNum == 4) {image = runningDown4;}
                if(spriteNum == 5) {image = runningDown5;}
                if(spriteNum ==6){image = runningDown6;}
                break;
            case "left":
                if (spriteNum == 1){image = runningLeft1;}
                if (spriteNum == 2){image = runningLeft2;}
                if(spriteNum == 3){image = runningLeft3;}
                if(spriteNum == 4) {image = runningLeft4;}
                if(spriteNum == 5){image = runningLeft5;}
                if(spriteNum == 6){image = runningLeft6;}
                break;
            case "right":
                if(spriteNum == 1){image = runningRight1;}
                if (spriteNum == 2){image = runningRight2;}
                if(spriteNum == 3) {image = runningRight3;}
                if(spriteNum == 4) {image = runningRight4;}
                if(spriteNum == 5) {image = runningRight5;}
                if(spriteNum == 6) {image = runningRight6;}
                break;
            default:
                if(direction == "up"){
                    if (spriteNum == 1){image = idleUp1;}
                    if (spriteNum == 2){image = idleUp2;}
                    if (spriteNum == 3){image = idleUp3;}
                    if (spriteNum == 4){image = idleUp4;}
                    if (spriteNum == 5){image = idleUp5;}
                    if(spriteNum == 6){image = idleUp6;}
                } else if(direction == "down"){
                    if (spriteNum == 1){image = idleDown1;}
                    if(spriteNum == 2){image = idleDown2;}
                    if(spriteNum == 3){image = idleDown3;}
                    if(spriteNum == 4) {image = idleDown4;}
                    if(spriteNum == 5) {image = idleDown5;}
                    if(spriteNum == 6) {image = idleDown6;}
                } else if(direction == "left"){
                    if (spriteNum == 1){image = idleLeft1;}
                    if (spriteNum == 2){image = idleLeft2;}
                    if (spriteNum == 3){image = idleLeft3;}
                    if(spriteNum == 4) {image = idleLeft4;}
                    if(spriteNum == 5) {image = idleLeft5;}
                    if(spriteNum == 6) {image = idleLeft6;} 
                } else if(direction == "right"){
                    if(spriteNum == 1){image = idleRight1;}
                    if (spriteNum == 2){image = idleRight2;}
                    if(spriteNum == 3) {image = idleRight3;}
                    if(spriteNum == 4) {image = idleRight4;}
                    if(spriteNum == 5) {image = idleRight5;}
                    if(spriteNum == 6) {image = idleRight6;}
                }
        }
        g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);
}
}
