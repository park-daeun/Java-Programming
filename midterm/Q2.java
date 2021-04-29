public class Q2 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }

        System.out.print("Random numbers : ");
        for (int j = 0; j < 10; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        for (int k = 1; k <= 10; k++) {
            for (int l = 0; l < 10; l++) {
                if (arr[l] == k) {
                    System.out.printf("%d is exist at a[%d]\n", k, l);
                }
            }
        }

    }
}
