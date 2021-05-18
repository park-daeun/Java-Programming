public class Q17 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        for (int i = 0; i < 10; i++) {
            int j = (int) (Math.random() * 4);
            int k = (int) (Math.random() * 4);
            if (arr[j][k] == 0) {
                arr[j][k] = (int) (Math.random() * 10 + 1);
            } else {
                i -= 1;
            }
        }

        for (int l[] : arr) {
            for (int m : l) {
                System.out.printf("%-6d", m);
            }
            System.out.println();
        }
    }
}
