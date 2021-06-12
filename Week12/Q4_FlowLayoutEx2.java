import java.awt.*;
import javax.swing.*;

public class Q4_FlowLayoutEx2 extends JFrame {
    public Q4_FlowLayoutEx2(String title) {
        super(title);
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));

        Container c = getContentPane();
        c.add(new JButton("add"));
        c.add(new JButton("sub"));
        c.add(new JButton("mult"));
        c.add(new JButton("div"));
        c.add(new JButton("calculate"));
        setVisible(true);
    }

    public static void main(String[] argc) {
        new Q4_FlowLayoutEx2("FlowLayout");
    }
}