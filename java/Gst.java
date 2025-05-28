import java.util.Scanner;

public class Gst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        System.out.println(total);

        float gst = total + (0.18f * total);
        System.out.println(gst);

        sc.close();
    }
}
