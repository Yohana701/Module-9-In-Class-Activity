import javax.swing.*;


public class MultipleButton {
   MultipleButton() {
       JFrame frame = new JFrame("Button Example");


       JButton b1 = new JButton("OK");
       b1.setBounds(100, 50, 80, 30);
       frame.add(b1);
       JButton b2 = new JButton("SUBMIT");
       b2.setBounds(100, 100, 80, 30);
       frame.add(b2);
       JButton b3 = new JButton("CANCEL");
       b3.setBounds(100, 150, 80, 30);
       frame.add(b3);


       frame.setSize(400, 300);
       frame.setLayout(null);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
   }
   public static void main(String[] args){
       new MultipleButton();


   }
}
