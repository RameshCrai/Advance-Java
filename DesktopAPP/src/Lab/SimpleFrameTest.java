package Lab;

import javax.swing.JFrame;

public class SimpleFrameTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Frame Test");

        frame.setSize(400, 300);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
