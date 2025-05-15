package Main;

import javax.swing.JFrame;

public class Game extends JFrame{

    public GameScreen gameWindow;

    public Game(){
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }
    public static void main(String[] args) {
        Game game=new Game();
    }
}