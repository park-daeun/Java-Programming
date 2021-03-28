public class NonSqArr {
    public static void main(String[] args) {
        int arr[][] = new int[4][];

        for (int i = 0; i < 4; i++) {
            arr[i] = new int[3];
            for (int j = 0; j < 3; j++) {
                if ((i == 1 || i == 3) && j == 2) {
                    break;
                }
                arr[i][j] = (i + 1) * 10 + j;
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
