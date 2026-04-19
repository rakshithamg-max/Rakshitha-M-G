package prog4;
import javax.swing.*;
import java.awt.*;

public class SwingHelloMessage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");

        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming");
        label.setForeground(Color.BLUE);
        label.setFont(new Font("Arial", Font.PLAIN, 32));

        frame.add(label);
        frame.setSize(600, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}