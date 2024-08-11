import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonClickExample {
   public static void main(String [] args){
       JFrame frame = new JFrame("Button Click Example");
       JButton button = new JButton("Click me");


       button.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               System.out.println("Button was clicked!");
       }
   });
       frame.add(button);
       frame.setSize(400,300);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
   }
}
