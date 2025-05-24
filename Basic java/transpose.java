public class transpose {
    public static void main(String[] args) {
        int arr[][] = { {1, 2, 3},
                        {4, 5 ,6}};
        
        int row = 2;
        int col = 3;

        // transpose
        int transpose_mat[][] = new int[col][row];
        for(int i = 0 ; i<2; i++)  {
            for(int j = 0; j< 3; j++) {
                transpose_mat[j][i] = arr[i][j];
            }
        }

        // Display
            for(int j = 0; j< arr[0].length; j++) {
                for(int i = 0 ; i< arr.length; i++)  {
                System.out.print(transpose_mat[j][i]+ " ");
            }
            System.out.println();
        }
    }
}
