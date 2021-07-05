import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q5_MouseListenerEx extends JFrame {
    private JLabel la = new JLabel("hello");

    public Q5_MouseListenerEx() {
        setTitle("Mouse event listener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        c.addMouseListener(new MyMouseListener());
        la.setSize(50, 20);
        la.setLocation(30, 30);
        c.add(la);
        setSize(250, 250);
        setVisible(true);
    }

    class MyMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x, y);
        }
    }

    public static void main(String[] args) {
        new Q5_MouseListenerEx();
    }
}