import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 3 integers >> ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        int mid = 0;

        if (a >= b && a <= c) {
            mid = a;
        } else if (b >= a && b <= c) {
            mid = b;
        } else {
            mid = c;
        }

        System.out.println("Middle number is " + mid);
    }
}
