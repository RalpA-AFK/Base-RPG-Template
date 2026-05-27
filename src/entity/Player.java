package entity;

import main.GamePanel;
import main.KeyHandler;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.awt.Color;


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
                up1 = ImageIO.read(getClass().getResourceAsStream("/player/Piskel1,png"));
                up2 = ImageIO.read(getClass().getResourceAsStream("/player/Piskel2,png"));
                down1 = ImageIO.read(getClass().getResourceAsStream("/player/Piskel3,png"));
                down2 = ImageIO.read(getClass().getResourceAsStream("/player/Piskel4,png"));
                left1 = ImageIO.read(getClass().getResourceAsStream("/player/Piskel5,png"));
                left2 = ImageIO.read(getClass().getResourceAsStream("/player/Piskel6,png"));
                right1 = ImageIO.read(getClass().getResourceAsStream("/player/Piskel7,png"));
                right2 = ImageIO.read(getClass().getResourceAsStream("/player/Piskel8,png"));

        } catch (IOException e) {
            // TODO: handle exception
        }
    }
public void update(){
        if(keyH.upPressed == true){
            direction = "up";
            y -= speed;
        }else if(keyH.downPressed == true){
            direction = "down";
            y += speed;
        }
        if(keyH.leftPressed == true){
            direction = "left";
            x -= speed  ;
        }else if(keyH.rightPressed == true){
            direction = "right";
            x += speed;
        }
        spriteCounter++;
        if(spriteCounter > 10){
            if(spriteNum == 1){
                spriteNum = 2;
            } else if(spriteNum == 2){
                spriteNum = 1;
            }
            spriteCounter = 0;
        }
    }
public void draw(Graphics2D g2){
        BufferedImage image = null;
        switch(direction){
            case "up":
                if (spriteNum == 1){
                    image = up1;
                }
                if (spriteNum == 2){
                    image = up2;
                }
                
                break;
            case "down":
                if (spriteNum == 1){
                    image = down1;
                }
                if(spriteNum == 2){
                    image = down2;
                }
                break;
            case "left":
                if (spriteNum == 1){
                    image = left1;
                }
                if (spriteNum == 2){
                    image = left2;
                }
                break;
            case "right":
                if(spriteNum == 1){
                    image = right1;
                }
                if (spriteNum == 2){
                    image = right2;
                }
                break;
        }
        g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);
}
}
