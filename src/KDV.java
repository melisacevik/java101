import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        double kdvsizTutar, toplamTutar, kdvTutar, kdvOrani;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        kdvsizTutar = input.nextDouble();

        kdvOrani = ( kdvsizTutar >= 0 && kdvsizTutar < 1000 ) ? 0.18 : (( kdvsizTutar >= 1000) ? 0.8 : 0 );

        kdvTutar = kdvsizTutar * kdvOrani;

        toplamTutar = kdvTutar + kdvsizTutar;

        System.out.println("KDV'siz tutar: " + kdvsizTutar);
        System.out.println("KDV Orani: " + kdvOrani);
        System.out.println("Kdv Tutarı: " + kdvTutar);
        System.out.print("Toplam Tutar: " + toplamTutar);
    }
}
