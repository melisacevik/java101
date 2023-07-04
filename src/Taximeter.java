import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        double gidilenKm, acilisUcreti = 10, minTutar = 20;
        double kmBasi = 2.20,toplamUcret, odenecekTutar;
        Scanner input = new Scanner(System.in);

        System.out.print("km giriniz: ");
        gidilenKm = input.nextDouble();

        toplamUcret = acilisUcreti + ( gidilenKm * kmBasi );
        odenecekTutar = toplamUcret >= 0 && toplamUcret < 20 ? 20 : toplamUcret;
        System.out.println(odenecekTutar);
    }
}
