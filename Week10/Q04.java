import java.util.Scanner;
import java.util.Vector;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();

        int sum = 0;
        while (true) {
            System.out.print("Enter amount of rainfall (0 to quit)>> ");
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
            v.add(num);

            for (int i = 0; i < v.size(); i++) {
                System.out.print(v.get(i) + " ");
            }
            System.out.println();

            System.out.println("Current Average : " + sum / v.size());
        }

        sc.close();
    }
}
