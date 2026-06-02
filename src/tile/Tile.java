package tile;
import java.awt.image.BufferedImage;

public class Tile {
    public BufferedImage image;
    public BufferedImage images;
    public boolean collision = false;


    public Tile(BufferedImage image, boolean collision){
        this.image = image;
        this.collision = collision;
    }
    public Tile(BufferedImage image){
    this.image = image;
    }
}