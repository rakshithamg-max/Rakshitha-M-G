package prog4;

import javax.swing.*;
import java.awt.*;

public class ImageButtonHandler {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Image Buttons");

        ImageIcon digitalIcon = new ImageIcon(
                ImageButtonHandler.class.getResource("digital.jpg"));
        ImageIcon hourglassIcon = new ImageIcon(
                ImageButtonHandler.class.getResource("hourglass.jpg"));

        Image dImg = digitalIcon.getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH);
        Image hImg = hourglassIcon.getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH);

        JButton digital = new JButton(new ImageIcon(dImg));
        JButton hourglass = new JButton(new ImageIcon(hImg));

        digital.setBounds(50, 50, 120, 100);
        hourglass.setBounds(200, 50, 120, 100);

        // Single line output (no dialog)
        digital.addActionListener(e -> System.out.println("Digital Clock pressed"));
        hourglass.addActionListener(e -> System.out.println("Hour Glass pressed"));

        frame.add(digital);
        frame.add(hourglass);

        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}