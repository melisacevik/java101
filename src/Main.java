import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int mat,fizik,kimya,turkce,tarih,muzik;

      Scanner inp = new Scanner(System.in);
      System.out.print("Mat notunuzu giriniz: " );
      mat = inp.nextInt();

      System.out.print("Fizik notunuzu giriniz: ");
      fizik = inp.nextInt();

      System.out.print("Kimya notunuzu giriniz: ");
      kimya = inp.nextInt();

      System.out.print("Türkçe notunuzu giriniz: ");
      turkce = inp.nextInt();

      System.out.print("Tarih notunuzu giriniz: ");
      tarih = inp.nextInt();

      System.out.print("Müzik notunuzu giriniz:  ");
      muzik = inp.nextInt();

      int toplam = mat + fizik + kimya + turkce + tarih + muzik;
      double sonuc = toplam / 6;
      int sinir = 60;

      boolean kosul1 = sonuc >= sinir;
      String kosul1a = kosul1 ? "Geçtiniz " : "";

      boolean kosul2 = sonuc < sinir;
      String kosul2a = kosul2 ? "Kaldiniz " : "";

      System.out.print(kosul1a);
      System.out.print(kosul2a);

    }
}
