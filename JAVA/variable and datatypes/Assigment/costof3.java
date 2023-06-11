import java.util.Scanner;

public class costof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float gst = (pen+pencil+eraser)*18/100;
        float bill = pen+pencil+eraser+gst;
        System.out.println(bill);

        // int $ = 24;
        // System.out.println($);
    }
}
