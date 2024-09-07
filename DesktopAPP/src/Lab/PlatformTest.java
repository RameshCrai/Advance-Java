package Lab;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;

public class PlatformTest {
    public static void main(String[] args) {
        try {
            // Set the look and feel to the system's default
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // Create a new JFrame (window)
        JFrame frame = new JFrame("Platform Test");

        // Create a button
        JButton button = new JButton("Test Button");

        // Create a panel and add the button to it
        JPanel panel = new JPanel();
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set the default close operation to exit the application when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}

