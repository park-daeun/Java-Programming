import java.awt.*;
import javax.swing.*;

public class Q3_FlowLayoutEx extends JFrame {
    public Q3_FlowLayoutEx(String title) {
        super(title);
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        Container c = getContentPane();
        c.add(new JButton("add"));
        c.add(new JButton("sub"));
        c.add(new JButton("mult"));
        c.add(new JButton("div"));
        c.add(new JButton("calculate"));
        setVisible(true);
    }

    public static void main(String[] argc) {
        new Q3_FlowLayoutEx("FlowLayout");
    }
}