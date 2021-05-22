import java.util.Scanner;
import java.util.Vector;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();

        System.out.print("Enter integer(-1 to quit)>> ");
        while (true) {
            int num = sc.nextInt();

            if (num == -1) {
                break;
            }

            v.add(num);
        }

        int max = 0;
        for (int i = 0; i < v.size(); i++) {
            int num = v.get(i);
            if (num > max) {
                max = num;
            }
        }

        System.out.print("Maximum number is " + max);
        sc.close();
    }
}