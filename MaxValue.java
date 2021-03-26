import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        int i = 0;
        int max = 0;

        System.out.println("Enter integer value(>0)");

        while (i < 5) {
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println(n + " is invalid");
                continue;
            }
            arr[i] = n;
            i++;

            if (max < n) {
                max = n;
            }
        }

        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println(" --> Maximum value is " + max);

        scanner.close();
    }
}