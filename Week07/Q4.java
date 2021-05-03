import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 3 Integers >> ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int max = 0;
        int sum = 0;
        if (a >= b && a >= c) {
            max = a;
            sum = b + c;
        } else if (b >= a && b >= c) {
            max = b;
            sum = a + c;
        } else {
            max = c;
            sum = a + b;
        }

        if (max < sum) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
    }
}
