package Lab;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageTest {
	public static void main(String[] args) {
		// Create a new JFrame (window)
		JFrame frame = new JFrame("Image Test");

		// Set the size of the frame
		frame.setSize(600, 400);

		// Add a custom panel to the frame
		frame.add(new ImagePanel("C:\\Users\\Dell\\Downloads\\bau1.jfif")); // Replace with the path to your image file

		// Set the default close operation to exit the application when the frame is
		// closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Make the frame visible
		frame.setVisible(true);
	}
}

// Custom JPanel to display an image
class ImagePanel extends JPanel {
	private Image image;

	public ImagePanel(String imagePath) {
		// Load the image
		this.image = new ImageIcon(imagePath).getImage();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Draw the image
		g.drawImage(image, 0, 0, this); // Draw the image at (0, 0) of the panel
	}
}
