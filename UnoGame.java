import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UnoGame extends JFrame{
   public UnoGame(){
       // Set up the main frame
       setTitle("UNO GAME");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(800,600);
       setLayout(new BorderLayout());


       //Create the game board panel
       JPanel gameBoard = new JPanel();
       gameBoard.setLayout(new GridLayout(4,4)); //Example of Layout
       add(gameBoard, BorderLayout.CENTER);


       //Add example game components
       for (int i =0; i < 16; i++){
         JButton cardButton = new JButton("Card " + (i +1));
         gameBoard.add(cardButton);
       }
       //add a status bar
       JLabel statusBar = new JLabel("Game in progress...");
       add(statusBar,BorderLayout.SOUTH);


       //Add event handling
       //Add action listener to the buttons or other components


       //Display the window
       setVisible(true);
   }
   public static void main(String[] args){
       SwingUtilities.invokeLater(()-> new UnoGame());
   }
}
