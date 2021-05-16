import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a lowercase alphabet >> ");
        char c = scanner.next().charAt(0);
        scanner.close();

        for (int i = (int) c; i >= 97; i--) {
            for (int j = 97; j <= i; j++) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
}
