import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q1_IndepClassListener extends JFrame {
    public Q1_IndepClassListener() {
        setTitle("Action Event Listener Ex");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener());
        c.add(btn);
        setSize(350, 150);
        setVisible(true);
    }

    public static void main(String[] argc) {
        new Q1_IndepClassListener();
    }
}

class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        if (b.getText().equals("Action")) {
            b.setText("Bction");
        } else {
            b.setText("Action");
        }
    }
}