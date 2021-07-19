import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TimerRunnable3 implements Runnable {
    private JLabel timerLabel;

    public TimerRunnable3(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    @Override
    public void run() {
        int n = 0;
        while (true) {
            timerLabel.setText(Integer.toString(n));
            n++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class Q7_ThreadInterruptEx extends JFrame {
    private Thread th;

    public Q7_ThreadInterruptEx() {
        setTitle("ThreadInterruptEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));

        TimerRunnable3 runnable = new TimerRunnable3(timerLabel);
        th = new Thread(runnable);
        c.add(timerLabel);
        JButton btn = new JButton("Kill Timer");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                th.interrupt();
                JButton btn = (JButton) e.getSource();
                btn.setEnabled(false);
            }
        });
        c.add(btn);
        setSize(300, 170);
        setVisible(true);
        th.start();
    }

    public static void main(String[] args) {
        new Q7_ThreadInterruptEx();
    }
}
