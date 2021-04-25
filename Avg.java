import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        int i = 0;
        int sum = 0;

        System.out.println("Enter integer value(>0)");

        while (i < 5) {
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println(n + " is invalid");
                continue;
            }
            arr[i] = n;
            sum = sum + n;
            i++;
        }

        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println(" --> Average is " + sum / 5);

        scanner.close();
    }
}