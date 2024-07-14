package Assignments;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawLineByMouse extends JFrame {
	private DrawPanel drawPanel;

    public DrawLineByMouse() {
        drawPanel = new DrawPanel();
        this.add(drawPanel, BorderLayout.CENTER);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new DrawLineByMouse();
    }

    class DrawPanel extends JPanel {
        private BufferedImage canvas;
        private Graphics2D g2d;
        private int prevX, prevY;

        public DrawPanel() {
            this.setPreferredSize(new Dimension(800, 600));
            this.canvas = new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB);
            this.g2d = canvas.createGraphics();
            this.g2d.setColor(Color.BLACK);
            this.g2d.setStroke(new BasicStroke(2));

            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    prevX = e.getX();
                    prevY = e.getY();
                }
            });

            this.addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    int x = e.getX();
                    int y = e.getY();
                    g2d.drawLine(prevX, prevY, x, y);
                    prevX = x;
                    prevY = y;
                    repaint();
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(canvas, 0, 0, null);
        }
    }
}
