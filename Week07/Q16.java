public class Q16 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (int) (Math.random() * 10 + 1);
            }
        }

        for (int[] n : arr) {
            for (int k : n) {
                System.out.printf("%-6d", k);
            }
            System.out.println();
        }
    }
}
