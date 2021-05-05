import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input (x,y) >> ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        if (x >= 100 && x <= 200 && y >= 100 && y <= 200) {
            System.out.println("Point (" + x + "," + y + ") is in the rectangle.");
        } else {
            System.out.println("Point (" + x + "," + y + ") is not in the rectangle.");
        }
    }
}