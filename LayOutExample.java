import javax.swing.*;
import java.awt.*;


public class LayOutExample {
   public static void main(String [] args){
       JFrame frame = new JFrame("Layout Example");
       frame.setLayout(new BorderLayout());


       JButton northButton = new JButton("North");
       JButton southButton = new JButton("South");
       JButton eastButton = new JButton("East");
       JButton westButton = new JButton("West");
       JButton centerButton = new JButton("Center");


       frame.add(northButton, BorderLayout.NORTH);
       frame.add(southButton, BorderLayout.SOUTH);
       frame.add(eastButton, BorderLayout.EAST);
       frame.add(westButton, BorderLayout.WEST);
       frame.add(centerButton, BorderLayout.CENTER);


       frame.setSize(400,300);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
   }
}
