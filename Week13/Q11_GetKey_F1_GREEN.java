import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q11_GetKey_F1_GREEN extends JFrame {
    public Q11_GetKey_F1_GREEN() {
        setTitle("Q11");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.addKeyListener(new MyKeyListener());

        setSize(250, 250);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            Component c = (Component) e.getSource();
            int code = e.getKeyCode();
            if (code == 112) {
                c.setBackground(Color.GREEN);
            } else if (code == 53) {
                c.setBackground(Color.YELLOW);
            }
        }
    }

    public static void main(String[] args) {
        new Q11_GetKey_F1_GREEN();
    }
}
