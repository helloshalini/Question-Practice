import java.util.*;
public class bit2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a);
        System.out.println(b);
        sc.close();
    }
}
