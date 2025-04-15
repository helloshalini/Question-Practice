import java.util.*;
public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            if(n%2==0) {
                evenSum+=n;
            }else{
                oddSum+=n;
            }
            
            i =sc.nextInt();
        } while(i==0);
        System.out.println("Sum of even numbers: "+evenSum);
        System.out.println("Sum of odd numbers: "+oddSum);

        sc.close();
    }
}
