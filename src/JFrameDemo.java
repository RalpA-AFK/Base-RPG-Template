import javax.swing.*;

public class JFrameDemo extends JFrame {

    public JFrameDemo(){
        initialize();
    }
    public void initialize(){
        setTitle("RPGATTEMPT");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500,400);
        setVisible(true);
    }
}