public class Q14 {
    public static void main(String[] args) {
        System.out.print("Random numbers : ");
        int[] arr = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }

        System.out.println("\nAverage : " + (double) sum / 10);
    }
}
