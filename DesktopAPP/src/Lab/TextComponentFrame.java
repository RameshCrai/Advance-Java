package Lab;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class TextComponentFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Components");

        // Create a panel and set layout
        JPanel panel = new JPanel(new BorderLayout());

        // Create text field and area
        JTextField textField = new JTextField("Text Field");
        JTextArea textArea = new JTextArea("Text Area\nMultiline\nText", 5, 20);

        // Add text field and text area to panel
        panel.add(textField, BorderLayout.NORTH);
        panel.add(textArea, BorderLayout.CENTER);

        // Add panel to frame
        frame.add(panel);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

