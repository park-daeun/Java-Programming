import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input center point & radius >> ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double r = scanner.nextDouble();

        System.out.printf("Input point >> ");
        double px = scanner.nextDouble();
        double py = scanner.nextDouble();
        scanner.close();

        double dis = Math.sqrt(Math.pow(px - x, 2) + Math.pow(py - y, 2));

        if (dis <= r) {
            System.out.println("Point (" + px + "," + py + ") is in the circle.");
        }
    }
}
