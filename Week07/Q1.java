import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input KRW >> ");
        int KRW = scanner.nextInt();
        float USD = (float) KRW / 1100;

        System.out.printf(KRW + " KRW is " + USD + "USD");

        scanner.close();
    }
}