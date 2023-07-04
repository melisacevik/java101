import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        double weight,height, bodyMass;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your height (in meters): ");
        height = input.nextDouble();
        System.out.print("Please enter your weight: ");
        weight = input.nextDouble();

        bodyMass = weight / ( height * height )  ;

        System.out.print( "your index: " + bodyMass);

    }
}
