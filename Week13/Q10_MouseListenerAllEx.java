import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q10_MouseListenerAllEx extends JFrame {
    private JLabel la = new JLabel("No Mouse Event");

    public Q10_MouseListenerAllEx() {
        setTitle("MouseListener & MouseMotionListener Ex");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        MyMouseListener listener = new MyMouseListener();

        c.addMouseListener(listener);
        c.addMouseMotionListener(listener);

        c.add(la);

        setSize(300, 200);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener, MouseMotionListener {
        public void mousePressed(MouseEvent e) {
            la.setText("mousePressed (" + e.getX() + ", " + e.getY() + ")");
        }

        public void mouseReleased(MouseEvent e) {
            la.setText("mouseReleased (" + e.getX() + ", " + e.getY() + ")");
        }

        public void mouseClicked(MouseEvent e) {
        }

        public void mouseEntered(MouseEvent e) {
            Component c = (Component) e.getSource();
            c.setBackground(Color.CYAN);
        }

        public void mouseExited(MouseEvent e) {
            Component c = (Component) e.getSource();
            c.setBackground(Color.YELLOW);
        }

        public void mouseDragged(MouseEvent e) {
            la.setText("mouseDragged (" + e.getX() + ", " + e.getY() + ")");
        }

        public void mouseMoved(MouseEvent e) {
            la.setText("mouseMoved (" + e.getX() + ", " + e.getY() + ")");
        }
    }

    public static void main(String[] args) {
        new Q10_MouseListenerAllEx();
    }
}
