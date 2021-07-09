import java.awt.*;
import javax.swing.*;

class TimerThread2 extends Thread {
    private JLabel timerLabel;

    public TimerThread2(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    @Override
    public void run() {
        int n = 0;
        while (true) {
            timerLabel.setText(Integer.toString(n));
            n++;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class Q2_ThreadTimerEx extends JFrame {
    public Q2_ThreadTimerEx() {
        setTitle("Timer Thread Ex");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        c.add(timerLabel);
        TimerThread2 th = new TimerThread2(timerLabel);
        setSize(300, 170);
        setVisible(true);
        th.start();
    }

    public static void main(String[] args) {
        new Q2_ThreadTimerEx();
    }
}
