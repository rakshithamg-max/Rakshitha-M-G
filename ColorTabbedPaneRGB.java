package prog5;
import javax.swing.*;
import java.awt.*;

public class ColorTabbedPaneRGB {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JTabbedPane tab = new JTabbedPane();

        JPanel red = new JPanel();
        red.setBackground(Color.RED);

        JPanel blue = new JPanel();
        blue.setBackground(Color.BLUE);

        JPanel green = new JPanel();
        green.setBackground(Color.GREEN);

        tab.add("RED", red);
        tab.add("BLUE", blue);
        tab.add("GREEN", green);

        frame.add(tab);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
