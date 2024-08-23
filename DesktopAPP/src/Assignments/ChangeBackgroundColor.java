package Assignments;


import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ChangeBackgroundColor extends JFrame {
	public ChangeBackgroundColor() {
		// Set up the frame
		setTitle("Change Background Color");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create the panel
		JPanel panel = new JPanel();

		// Add a MouseAdapter to the panel
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setBackground(Color.YELLOW); // Change to desired color
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(Color.WHITE); // Change back to original color
			}
		});

		// Set initial background color
		panel.setBackground(Color.WHITE);

		// Add the panel to the frame
		add(panel);

		// Make the frame visible
		setVisible(true);
	}

	public static void main(String[] args) {
		// Run the program
		SwingUtilities.invokeLater(ChangeBackgroundColor::new);
	}
}
