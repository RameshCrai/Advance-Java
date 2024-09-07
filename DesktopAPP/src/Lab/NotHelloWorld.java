package Lab;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class NotHelloWorld {
	public static void main(String[] args) {
		JFrame frame = new JFrame("NotHelloWorld");
		frame.setSize(300, 100);

		JLabel label = new JLabel("NotHelloWorld", SwingConstants.CENTER);

		frame.add(label, BorderLayout.CENTER);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}
}
