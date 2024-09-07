package Lab;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FontInRectangle {
	public static void main(String[] args) {
		// Create a new JFrame (window)
		JFrame frame = new JFrame("Font Inside Rectangle");

		// Set the size of the frame
		frame.setSize(400, 300);

		// Add a custom panel to the frame
		frame.add(new FontPanel());

		// Set the default close operation to exit the application when the frame is
		// closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Make the frame visible
		frame.setVisible(true);
	}
}

// Custom JPanel to draw text inside a rectangle
class FontPanel extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Set the font and color for drawing text
		Font font = new Font("Arial", Font.BOLD, 24);
		g.setFont(font);
		g.setColor(Color.BLACK);

		// Create a bounding rectangle
		Rectangle rectangle = new Rectangle(50, 50, 300, 100);

		// Draw the rectangle
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
		g.setColor(Color.BLACK);
		g.drawRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);

		// Get the FontMetrics to center the text inside the rectangle
		FontMetrics metrics = g.getFontMetrics(font);
		int x = rectangle.x + (rectangle.width - metrics.stringWidth("Hello, World!")) / 2;
		int y = rectangle.y + ((rectangle.height - metrics.getHeight()) / 2) + metrics.getAscent();

		// Draw the text inside the rectangle
		g.drawString("Hello, World!", x, y);
	}
}
