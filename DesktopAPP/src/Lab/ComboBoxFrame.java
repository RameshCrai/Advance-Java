package Lab;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class ComboBoxFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Combo Box Example");

        // Create a panel and set layout
        JPanel panel = new JPanel(new FlowLayout());

        // Create combo box
        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);

        // Add combo box to panel
        panel.add(comboBox);

        // Add panel to frame
        frame.add(panel);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

