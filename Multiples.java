import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 10 positive integers >> ");
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.print("Multiples of 3 : ");
        for (int j : arr) {
            if (j % 3 == 0) {
                System.out.print(j + " ");
            }
        }
    }
}
