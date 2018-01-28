import java.awt.*; 
import javax.swing.*; 

class Game extends JFrame {
  JLabel statusbar;
  Game() {
    statusbar = new JLabel("Total: 0");
    add(statusbar, BorderLayout.SOUTH);

    World world = new World(statusbar); 
    this.add(world); 
    world.start(); 
    this.addKeyListener(world); 
    this.setSize(200, 400);
    this.setVisible(true); 
    this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
  }
  public static void main(String[] args) {
    Game game = new Game();  
  }
}

