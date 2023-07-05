import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        double kmBasi = 0.10, normalTutar, indirimOrani = 0.0, toplamTutar, yasIndirimi, indirimliTutar, gidisDonusIndirim = 0.00;
        int gidilenKm, yas, yolculukTipi;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen mesafeyi giriniz: ");
        gidilenKm = input.nextInt();

        System.out.print("Lütfen yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        yolculukTipi = input.nextInt();

        if (gidilenKm > 0 && yas >= 0) {
            if (yas < 12) {
                indirimOrani = 0.50;
            } else if (yas < 24) {
                indirimOrani = 0.10;
            } else if (yas > 65) {
                indirimOrani = 0.30;
            } else {
                System.out.println("Hatalı veri girdiniz!");
                System.exit(0);
            }

            normalTutar = gidilenKm * kmBasi;
            System.out.println("Normal Tutar: " + normalTutar + " TL");

            yasIndirimi = normalTutar * indirimOrani;
            System.out.println("Yaş İndirimi: " + yasIndirimi + " TL");

            indirimliTutar = normalTutar - yasIndirimi;
            System.out.println("İndirimli Tutar: " + indirimliTutar + " TL");

            if (yolculukTipi == 2) {
                gidisDonusIndirim = indirimliTutar * 0.20;
                System.out.println("Gidiş-Dönüş Bilet İndirimi: " + gidisDonusIndirim);
            } else if (yolculukTipi == 1) {
                gidisDonusIndirim = 0.00;
                System.out.println("Gidiş-Dönüş Bilet İndirimi: " + gidisDonusIndirim);
            } else {
                System.out.println("Lütfen 1 veya 2 yazınız.");
                System.exit(0);
            }

            toplamTutar = (indirimliTutar - gidisDonusIndirim) * yolculukTipi;
            System.out.println("Toplam Tutar: " + toplamTutar + " TL");
        } else {
            System.out.println("Hatalı veri girdiniz!");
        }
    }
}
