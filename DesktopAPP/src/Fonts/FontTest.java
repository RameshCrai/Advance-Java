package Fonts;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;


public class FontTest {
	public static void main(String[] args) {
	 
		EventQueue.invokeLater(()->{
			JFrame frame = new FontFrame();
			frame.setTitle("Ramesh Drawing ");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
		
	}
}

class FontFrame extends JFrame {
	public FontFrame() {
		add(new FontComponent());
		pack();
	}
}

class FontComponent extends JComponent{
	public static final int DEFAULT_WIDTH =300;
	public static final int DEFAULT_HEIGHT = 200;
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		
		String message = "hello World";
		
		Font f =  new Font("Serif",Font.BOLD,36);		
		g2.setFont(f);
		g2.setColor(getBackground().BLUE);
		
		FontRenderContext context = g2.getFontRenderContext();
		Rectangle2D bounds = f.getStringBounds(message, context);
		
		
//		set (x,y)
	    double x = (getWidth()-bounds.getWidth())/2;
	    double y = (getHeight()-bounds.getHeight())/2;
	    
	    
	    double ascent = -bounds.getY();
	    double basey = y+ascent;
	    
//	    draw 
	    g2.drawString(message, (int)x, (int)basey);
	    g2.setPaint(Color.RED);
	    
	    
//	    draw baseline 
	    g2.draw(new Line2D.Double(x,basey, x+bounds.getWidth(),basey));
		
	    
//	    draw the eclosing rectangle 
	    Rectangle2D rect = new Rectangle2D.Double(x,y,bounds.getWidth(),bounds.getHeight());
	    g2.draw(rect);
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
	}
	
}
