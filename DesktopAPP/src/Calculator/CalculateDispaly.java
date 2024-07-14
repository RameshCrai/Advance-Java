package Calculator;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class CalculateDispaly {
	public static final int Height = 600;
	public static final int Width = 400;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			JFrame frame = new JFrame();
			frame.setSize(new Dimension(Height, Width));
			frame.add(new CalculatorPanel());
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("CE_Cal");
			frame.setVisible(true);
		});
	}

	public Dimension getPreferredSize() {
		return new Dimension(Height, Width);
	}

}
