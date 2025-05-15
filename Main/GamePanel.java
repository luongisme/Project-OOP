package Main;

import javax.swing.JFrame;

public class GamePanel extends JFrame{

    public GameScreen gameWindow;

    public GamePanel(){
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }
    public static void main(String[] args) {
        GamePanel game=new GamePanel();
    }
}