package Lab;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Button Test");

        // Create a button
        JButton button = new JButton("Click Me!");

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText("Clicked!");
            }
        });

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
