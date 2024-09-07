package Lab;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Terminator {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Adapter Test");

        // Create a label
        JLabel label = new JLabel("Click anywhere on the panel");

        // Create a panel and add the label to it
        JPanel panel = new JPanel();
        panel.add(label);

        // Add a mouse listener using MouseAdapter
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        // Add the panel to the frame
        frame.add(panel);

        // Set the size of the frame
        frame.setSize(400, 300);

        // Set the default close operation to exit the application when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
