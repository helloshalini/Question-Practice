public class _2DArray {
    
    public static void main(String[] args) {
        int[][] array = { {4,7,8},{9,14,7} };
        int count = 0;
        for(int i = 0; i<array.length-1; i++) {
            for(int j = 0; j<array[0].length-1; j++) {
                if(array[i][j] == 8) {
                    count ++;
                }
            }
        }

        System.out.println(count);
    }
}
