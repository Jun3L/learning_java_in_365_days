package Sample;
import javax.swing.*;
public class sample {
    public static void main(String[] args){
       JFrame frame = new JFrame("Event Example");
        JButton button = new JButton("Click Me");

        button.addActionListener(e -> {
            System.out.println("Button clicked!");
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setVisible(true);
       
    }
}
