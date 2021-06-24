import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q12_GetKey_JLabel extends JFrame {
    private JLabel la = new JLabel("Hello");

    public Q12_GetKey_JLabel() {
        setTitle("Q12");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        c.addKeyListener(new MyKeyListener());

        la.setSize(100, 20);
        la.setLocation(50, 50);
        c.add(la);

        setSize(250, 250);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int code = e.getKeyCode();
            int x = la.getX();
            int y = la.getY();
            if (code == 37) { // 왼
                la.setLocation(x - 10, y);
            } else if (code == 38) { // 위
                la.setLocation(x, y - 10);
            } else if (code == 39) { // 오
                la.setLocation(x + 10, y);
            } else if (code == 40) { // 밑
                la.setLocation(x, y + 10);
            }
        }
    }

    public static void main(String[] args) {
        new Q12_GetKey_JLabel();
    }
}
