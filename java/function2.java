import java.util.*;

public class function2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isEven(n)) {
            System.out.println("It is even number");
        }
        else {
            System.out.println("Not even number");
        }
        sc.close();
    }

    public static boolean isEven(int n) {
        if(n %2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

}
