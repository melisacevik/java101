import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        yil = input.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println(yil + " artık yıldır.");
                } else {
                    System.out.println(yil + " artık yıl değildir.");
                }
            } else {
                System.out.println(yil + " artık yıldır.");
            }
        } else {
            System.out.println(yil + " artık yıl değildir.");
        }
    }
}
