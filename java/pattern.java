public class pattern {
    public static void pattern_inverted(int n) {
        int count = 1;
        for(int i = 1 ; i <= n ;i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(count+"  ");
                count ++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern_inverted(7);
    }
}
