import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter >> ");
        double a = scanner.nextDouble();
        char op = scanner.next().charAt(0);
        double b = scanner.nextDouble();
        scanner.close();

        if (op == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (op == '-') {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (op == '*') {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (op == '/') {
            if (b == 0) {
                System.out.println("Divide by 0 error");
                return;
            }
            System.out.println(a + " / " + b + " = " + (a / b));
        }
    }
}
