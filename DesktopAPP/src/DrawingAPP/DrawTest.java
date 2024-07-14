package DrawingAPP;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class DrawTest {
	public static void main(String[] args) {
	EventQueue.invokeLater(()->{
		JFrame frame = new DrawFrame();
		frame.setTitle("Ramesh Drawing ");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	});
		
	}
}

class DrawFrame extends JFrame{
	public DrawFrame() {
		add(new DrawComponent());
		pack();
	}
}

class DrawComponent extends JComponent{
	public static final int DEFAULT_WIDTH=400;
	private static final int DEFAULT_HEIGHT = 400;
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		
//		Draw Rectangle 
		double leftx = 100;
		double topy = 100;
		double width =200;
		double height = 150;
		
		Rectangle2D rect = new Rectangle2D.Double(leftx, topy, width, height);
		g2.draw(rect);
		
		
		
//		Draw Eclipse 
		Ellipse2D ellipse = new Ellipse2D.Double();
		ellipse.setFrame(rect);
		g2.draw(ellipse);
		
		
//		draw a diagonal line 
		g2.draw(new Line2D.Double(leftx, topy, width, height));
		
		
//		draw a circle with the same center 
		
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
	}
}
