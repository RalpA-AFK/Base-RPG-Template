package entity;

import main.GamePanel;
import main.KeyHandler;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;

import javax.imageio.ImageIO;



public class Player extends entity {
    GamePanel gp;
    KeyHandler keyH;

    // Index into the running/idle sprite arrays
    public static final int UP = 0, DOWN = 1, LEFT = 2, RIGHT = 3;

    // Sprite-sheet layout: each sheet is a horizontal strip of FRAME_COUNT cells,
    // every cell FRAME_SIZE x FRAME_SIZE pixels (so a sheet is 384 x 64 here).
    public static final int FRAME_COUNT = 6;
    public static final int FRAME_SIZE  = 64;

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
        // We slice the Up, Down and Right sheets. Left is built by mirroring Right.
        String[] dirNames   = {"Up", "Down", "Right"};
        int[]    dirIndexes = {UP,   DOWN,   RIGHT};

        for (int i = 0; i < dirNames.length; i++){
            String dir = dirNames[i];
            int d = dirIndexes[i];
            running[d] = sliceSheet("/player/knight/KnightRunning/Knight" + dir + "Running/Knight" + dir + "RunningSheet.png");
            idle[d]    = sliceSheet("/player/knight/KnightIdle/Knight" + dir + "Idle/Knight" + dir + "IdleSheet.png");
        }

        // Left = Right mirrored, so we never store duplicate art on disk.
        for (int f = 0; f < FRAME_COUNT; f++){
            if (running[RIGHT][f] != null) running[LEFT][f] = flipHorizontally(running[RIGHT][f]);
            if (idle[RIGHT][f]    != null) idle[LEFT][f]    = flipHorizontally(idle[RIGHT][f]);
        }
    }

    // Loads one sprite sheet and cuts it into FRAME_COUNT cells, left to right.
    // getSubimage(x, y, w, h) grabs the cell starting at x = frame * FRAME_SIZE.
    private BufferedImage[] sliceSheet(String path){
        BufferedImage[] frames = new BufferedImage[FRAME_COUNT];
        BufferedImage sheet = loadImage(path);
        if (sheet == null) return frames; // stays all-null instead of crashing
        for (int f = 0; f < FRAME_COUNT; f++){
            frames[f] = sheet.getSubimage(f * FRAME_SIZE, 0, FRAME_SIZE, FRAME_SIZE);
        }
        return frames;
    }

    // Loads one image, returning null (and logging) instead of crashing if the file is missing.
    private BufferedImage loadImage(String path){
        try {
            InputStream is = getClass().getResourceAsStream(path);
            if (is == null){
                System.out.println("Missing image: " + path);
                return null;
            }
            return ImageIO.read(is);
        } catch (IOException e){
            System.out.println("Failed to read: " + path);
            return null;
        }
    }

    private BufferedImage flipHorizontally(BufferedImage src){
        AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
        tx.translate(-src.getWidth(), 0);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        return op.filter(src, null);
    }
    public void update(){
        moving = false;
        if(keyH.upPressed == true){
            direction = "up";
            y -= speed;
            moving = true;
        }else if(keyH.downPressed == true){
            direction = "down";
            y += speed;
            moving = true;
        }else if(keyH.leftPressed == true){
            direction = "left";
            x -= speed  ;
            moving = true;
        }else if(keyH.rightPressed == true){
            direction = "right";
            x += speed;
            moving = true;
        }
        spriteCounter++;
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
// Maps the direction string to its array index.
    private int dirIndex(String dir){
        switch(dir){
            case "up":    return UP;
            case "down":  return DOWN;
            case "left":  return LEFT;
            case "right": return RIGHT;
            default:      return DOWN;
        }
    }

    public void draw(Graphics2D g2){
        int d = dirIndex(direction);
        BufferedImage[][] frames = moving ? running : idle; // idle when standing still
        BufferedImage image = frames[d][spriteNum - 1];     // spriteNum is 1-6, arrays are 0-5
        g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);
    }
}
