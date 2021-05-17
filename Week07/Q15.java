import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of elements : ");
        int num = scanner.nextInt();
        scanner.close();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }

        for (int j = 0; j < num; j++) {
            if (j % 10 == 0 && j != 0) {
                System.out.println();
            }
            System.out.printf("%-3d", arr[j]);
        }
    }
}
