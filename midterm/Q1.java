import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input integer >> ");
        int num = sc.nextInt();
        for (int i = num; i > 0; i--) {
            int j;
            for (j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = j; k < num; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}