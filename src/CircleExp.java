
import java.util.Scanner;
public class CircleExp {
    public static void main(String[] args) {
        double r, pi = 3.14, area;
        int alpha;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the r: ");
        r = input.nextDouble();

        System.out.print("Please enter the alpha: ");
        alpha = input.nextInt();

        area = ( pi *  r * r * alpha ) / 360;

        System.out.print("Area: " + area);

    }
}
