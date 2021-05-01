import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 2-digit integer(10-99) >> ");
        int num = scanner.nextInt();

        if (num / 10 == num % 10) {
            System.out.println("Yes! The digits of 10 and the digits of 1 are the same.");
        } else {
            System.out.println("No! The digits of 10 and the digits of 1 are different.");
        }

        scanner.close();
    }
}
