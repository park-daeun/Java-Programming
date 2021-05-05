import java.util.Scanner;
import java.lang.Math;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input center and radius of 1st circle >> ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r1 = scanner.nextDouble();

        System.out.print("Input center and radius of 2nd circle >> ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double r2 = scanner.nextDouble();
        scanner.close();

        double dis = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (r1 + r2 < dis || dis < r1 - r2 || (dis == 0 && r1 != r2)) {
            System.out.println("Two Circles are not overlapped");
        } else {
            System.out.println("Two Circles are overlapped");
        }
    }
}
