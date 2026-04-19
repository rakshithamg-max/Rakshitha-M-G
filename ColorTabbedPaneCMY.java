package prog5;
import javax.swing.*;
import java.awt.*;

public class ColorTabbedPaneCMY {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JTabbedPane tab = new JTabbedPane();

        JPanel c = new JPanel();
        c.setBackground(Color.CYAN);

        JPanel m = new JPanel();
        m.setBackground(Color.MAGENTA);

        JPanel y = new JPanel();
        y.setBackground(Color.YELLOW);

        tab.add("CYAN", c);
        tab.add("MAGENTA", m);
        tab.add("YELLOW", y);

        frame.add(tab);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
