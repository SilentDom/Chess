package Game;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Board extends JPanel {
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 800;

    public Board() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
    }
}
