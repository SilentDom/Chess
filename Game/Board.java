package Game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Board extends JPanel implements Runnable {
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 800;
    final int FPS = 60;
    Thread gameThread;

    public Board() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
    }

    public void launchGame() {
        gameThread = new Thread();
        gameThread.start();
    }

    @Override
    public void run() {
        double drawInterval = 1000000000/FPS;
    }
    
    private void update() {

    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }


}
