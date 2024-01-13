package Game;
import javax.swing.JFrame;

public class Chess {
    public static void main(String[] args) {

        // Creates the game window
        JFrame window = new JFrame("Simple Chess");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        
        // Adds the board to the game window
        Board board = new Board();
        window.add(board);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

    }
}
