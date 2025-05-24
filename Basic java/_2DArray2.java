public class _2DArray2 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int sum = 0;

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (i == 1) {
                    sum = sum + arr[1][j];
                }
            }
        }
        System.out.println(sum);
    }
}
