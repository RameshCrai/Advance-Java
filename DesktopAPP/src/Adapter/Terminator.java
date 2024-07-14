package Adapter;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Terminator extends WindowAdapter {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new Display();
            frame.setTitle("RameshCR");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.addWindowListener(new Terminator());
            frame.setVisible(true);
        });
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window is closing");
        System.exit(0);
    }
}

class Display extends JFrame {
    public Display() {
        add(new ShowComponent());
        pack();
    }
}

class ShowComponent extends JComponent {
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
