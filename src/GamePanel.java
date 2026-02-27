import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;

public class GamePanel extends JPanel implements Runnable {
    private Thread gameThread;
    final int originalTileSize = 16; // 16 x 16 tile
    final int scale = 3;

    final int tileSize = originalTileSize * scale;// 48 x 48
    final int maxScreenCo1 = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCo1; //768 pixels
    final int screenHeight = tileSize * maxScreenRow; // 576 pixels

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.blue);
        this.setDoubleBuffered(true);
    }
    public void startGameThread(){
        Thread gameThread  = new Thread(this); // gameThread cannot be declared locally or else the thread itself will be unable to terminate
        gameThread.start();
    }

    public void run(){
        while (gameThread != null){
            System.out.println("the game loop is running");
        }

    }

}