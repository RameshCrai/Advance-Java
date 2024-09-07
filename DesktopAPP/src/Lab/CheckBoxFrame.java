package Lab;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;

public class CheckBoxFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Check Box Example");

        // Create a panel and set layout
        JPanel panel = new JPanel(new FlowLayout());

        // Create check boxes
        JCheckBox checkBox1 = new JCheckBox("Option 1");
        JCheckBox checkBox2 = new JCheckBox("Option 2");
        JCheckBox checkBox3 = new JCheckBox("Option 3");

        // Add check boxes to panel
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);

        // Add panel to frame
        frame.add(panel);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

