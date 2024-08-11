import javax.swing.JFrame;
import javax.swing.JLabel;


public class myWindow {
   public static void main(String [] args){
       JFrame frame = new JFrame("My First Swing Application");
       JLabel label = new JLabel("Hello and Welcome to IT211, Object Oriented Programming!");
       frame.add(label);
       frame.setSize(400, 300);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
   }
}
