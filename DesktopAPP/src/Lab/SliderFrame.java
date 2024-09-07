package Lab;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import java.awt.FlowLayout;

public class SliderFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Slider Example");

        // Create a panel and set layout
        JPanel panel = new JPanel(new FlowLayout());

        // Create slider
        JSlider slider = new JSlider(0, 100, 50); // min, max, initial value

        // Add slider to panel
        panel.add(slider);

        // Add panel to frame
        frame.add(panel);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
