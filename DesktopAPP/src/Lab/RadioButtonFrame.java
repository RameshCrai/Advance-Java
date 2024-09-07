package Lab;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;

public class RadioButtonFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio Button Example");

        // Create a panel and set layout
        JPanel panel = new JPanel(new FlowLayout());

        // Create radio buttons and group them
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        JRadioButton radioButton3 = new JRadioButton("Option 3");

        // Group radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        // Add radio buttons to panel
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);

        // Add panel to frame
        frame.add(panel);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

