package Assignments;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class DrawingApp extends JFrame {
	private DrawPanel drawPanel;
	private String currentShape = "Line";

	public DrawingApp() {
		// Set up the frame
		setTitle("Simple Drawing Application");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create the draw panel
		drawPanel = new DrawPanel();
		add(drawPanel, BorderLayout.CENTER);

		// Create the button panel
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());

		// Create shape buttons
		JButton lineButton = new JButton("Line");
		JButton rectangleButton = new JButton("Rectangle");
		JButton circleButton = new JButton("Circle");

		// Add action listeners to the buttons
		lineButton.addActionListener(e -> currentShape = "Line");
		rectangleButton.addActionListener(e -> currentShape = "Rectangle");
		circleButton.addActionListener(e -> currentShape = "Circle");

		// Add buttons to the panel
		buttonPanel.add(lineButton);
		buttonPanel.add(rectangleButton);
		buttonPanel.add(circleButton);

		// Add button panel to the frame
		add(buttonPanel, BorderLayout.NORTH);

		// Make the frame visible
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(DrawingApp::new);
	}

	private class DrawPanel extends JPanel {
		private int startX, startY, endX, endY;

		public DrawPanel() {
			setBackground(Color.WHITE);

			// Add mouse listeners for drawing
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					startX = e.getX();
					startY = e.getY();
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					endX = e.getX();
					endY = e.getY();
					repaint();
				}
			});

			addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseDragged(MouseEvent e) {
					endX = e.getX();
					endY = e.getY();
					repaint();
				}
			});
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;

			switch (currentShape) {
			case "Line":
				g2d.drawLine(startX, startY, endX, endY);
				break;
			case "Rectangle":
				int rectX = Math.min(startX, endX);
				int rectY = Math.min(startY, endY);
				int rectWidth = Math.abs(endX - startX);
				int rectHeight = Math.abs(endY - startY);
				g2d.drawRect(rectX, rectY, rectWidth, rectHeight);
				break;
			case "Circle":
				int radius = (int) Math.hypot(endX - startX, endY - startY);
				g2d.draw(new Ellipse2D.Double(startX - radius, startY - radius, radius * 2, radius * 2));
				break;
			}
		}
	}
}
