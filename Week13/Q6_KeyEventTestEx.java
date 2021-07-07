import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q6_KeyEventTestEx extends JFrame {
    public Q6_KeyEventTestEx() {
        setTitle("Key Event Listener");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addKeyListener(new MyKeyListener());
        setSize(250, 250);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            System.out.println("Key pressed");
        }

        public void keyReleased(KeyEvent e) {
            System.out.println("Key released");
        }

        public void keyTyped(KeyEvent e) {
            System.out.println("Key typed");
        }
    }

    public static void main(String[] args) {
        new Q6_KeyEventTestEx();
    }
}
