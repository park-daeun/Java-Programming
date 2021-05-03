import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input integer(1~99) >> ");
        int num = scanner.nextInt();
        scanner.close();

        if (num < 10) {
            if (num % 3 == 0) {
                System.out.println("Clap");
            }
        } else {
            if ((num / 10) % 3 == 0 && ((num % 10) % 3 == 0 && (num % 10 != 0))) {
                System.out.println("Clap, Clap");
            } else if ((num / 10) % 3 == 0 || ((num % 10) % 3 == 0 && (num % 10 != 0))) {
                System.out.println("Clap");
            }
        }
    }
}
