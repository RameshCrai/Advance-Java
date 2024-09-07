package Lab;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawShape {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Draw Shapes");

		frame.setSize(400, 300);

		ShapePanel panel = new ShapePanel();

		frame.add(panel);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

// Custom JPanel to draw shapes
class ShapePanel extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawRect(50, 50, 100, 50);

		g.drawOval(50, 50, 100, 50);

		g.drawLine(50, 200, 200, 200);

		g.fillRect(200, 100, 80, 40);
	}
}
