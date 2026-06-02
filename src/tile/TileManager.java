package tile;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;

import main.GamePanel;

public class TileManager{
    GamePanel gp;
    Tile[] tile;
    public static final int FRAME_COL = 16;
    public static final int FRAME_ROW = 10;
    
    public static final int FRAME_SIZE  = 16;

    public String[] season = {"spring", "summer", "fall", "winter"};
    public String currentSeason = season[0];
    public String path;

    public TileManager(GamePanel gp){
        this.gp = gp;
        tile = new Tile[FRAME_COL * FRAME_ROW];
        getTileImage();
    }
    public void getTileImage(){
        switch(currentSeason){
            case "spring": path = "/tiles/Grass_Tiles_1.png"; break;
            case "summer": path = "/tiles/Grass_Tiles_2.png"; break;
            case "fall": path = "/tiles/Grass_Tiles_3.png"; break;
            case "winter": path = "/tiles/Grass_Tiles_4.png"; break;
        }
        BufferedImage[] images = sliceSheet(path);
        for(int i = 0; i < tile.length; i++){
            tile[i] = new Tile(images[i]);
        }
    
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
     // Loads one sprite sheet and cuts it into FRAME_COUNT cells, left to right.
    // getSubimage(x, y, w, h) grabs the cell starting at x = frame * FRAME_SIZE.
    private BufferedImage[] sliceSheet(String path){
        BufferedImage[] frames = new BufferedImage[FRAME_COL * FRAME_ROW];
        BufferedImage sheet = loadImage(path);
        if (sheet == null) return frames; // stays all-null instead of crashing
            for(int r = 0; r < FRAME_ROW; r++){
                for(int c = 0; c < FRAME_COL; c++){
                frames[r * FRAME_COL + c] = sheet.getSubimage(c * FRAME_SIZE, r * FRAME_SIZE, FRAME_SIZE, FRAME_SIZE);
            }
        }
        return frames;
    }
    public void draw(Graphics2D g2){
        int col = 0;
        int row = 0;
        int x = 0;
        int y = 0;

        while(col < gp.maxScreenCo1 && row < gp.maxScreenRow){
            g2.drawImage(tile[0].image, x, y, gp.tileSize, gp.tileSize, null);
            col++;
            x += gp.tileSize;

            if(col == gp.maxScreenCo1){
                col = 0;
                x = 0;
                row++;
                y += gp.tileSize;
            }
        }
    }
}
