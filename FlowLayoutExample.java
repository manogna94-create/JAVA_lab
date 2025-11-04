import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setLayout(new FlowLayout());

        frame.add(new JButton("One"));
        frame.add(new JButton("Two"));
        frame.add(new JButton("Three"));
        frame.add(new JButton("Four"));

        frame.setSize(300, 150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
