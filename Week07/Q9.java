import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input month (1~12) >> ");
        int num = scanner.nextInt();
        scanner.close();

        if (num == 3 || num == 4 || num == 5) {
            System.out.println("Spring");
        } else if (num == 6 || num == 7 || num == 8) {
            System.out.println("Summer");
        } else if (num == 9 || num == 10 || num == 11) {
            System.out.println("Autumn");
        } else if (num == 12 || num == 1 || num == 2) {
            System.out.println("Winter");
        }
    }
}
