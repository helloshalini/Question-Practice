import java.util.*;
public class binaryOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n & 1) == 0 ) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        sc.close();
    }
}
