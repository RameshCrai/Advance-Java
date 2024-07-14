package DrawingAPP;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class NotHelloworld {
	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			JFrame frame = new NotHellowWorldFrame();
			frame.setTitle("RameshRAI");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
	
	
}
 class NotHellowWorldFrame extends JFrame{
	public NotHellowWorldFrame() {
		add(new NotHelloWorldComponent());
		pack();
	}
}

 class NotHelloWorldComponent extends JComponent{
	public static final int MESSAGE_X=75;
	public static final int MESSAGE_y=100;
	public static final int DEFAULT_WIDTH=300;
	private static final int DEFAULT_HEIGHT = 200;
	
	public void paintComponent(Graphics g) {
		g.drawString("Hello world", MESSAGE_X, MESSAGE_y);
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
	}
}


