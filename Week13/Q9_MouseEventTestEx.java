import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q9_MouseEventTestEx extends JFrame {
    public Q9_MouseEventTestEx() {
        setTitle("Mouse Event Listener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        c.addMouseListener(new MyMouseListener());
        setSize(250, 250);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }

    class MyMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            System.out.println("Mouse pressed : " + e.getButton() + " at (" + e.getX() + ", " + e.getY() + ")");
        }

        public void mouseReleased(MouseEvent e) {
            System.out.println("Mouse released : " + e.getButton() + " at (" + e.getX() + ", " + e.getY() + ")");
        }

        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse clicked : " + e.getButton() + " at (" + e.getX() + ", " + e.getY() + ")");
        }
    }

    public static void main(String[] args) {
        new Q9_MouseEventTestEx();
    }
}
