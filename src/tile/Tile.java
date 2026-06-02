package tile;
import java.awt.image.BufferedImage;

public class Tile {
    public BufferedImage image;
    public boolean collision = false;
    public String[] season = {"spring", "summer", "fall", "winter"};
    public String currentSeason = season[0];


    public Tile(BufferedImage image, boolean collision){
        this.image = image;
        this.collision = collision;
    }
    public Tile(BufferedImage image){
    this.image = image;
    }
}