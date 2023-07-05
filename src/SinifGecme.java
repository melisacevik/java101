import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        int toplamDers = 0;
        int toplamNot = 0;
        Scanner input = new Scanner(System.in);

        //mat
        System.out.print("Mat notunuz: ");
        mat = input.nextInt();
        if( mat >= 0 && mat <= 100){
            toplamNot += mat;
            toplamDers++;
        }

        //fizik
        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        if( fizik >= 0 && fizik <= 100){
            toplamNot += fizik;
            toplamDers++;
        }

        //turkçe
        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        if( turkce >= 0 && turkce <= 100){
            toplamNot += turkce;
            toplamDers++;
        }

        //kimya
        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        if( kimya >= 0 && kimya <= 100){
            toplamNot += kimya;
            toplamDers++;
        }

        //müzik
        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
        if( muzik >= 0 && muzik <= 100){
            toplamNot += muzik;
            toplamNot++;
        }

        if(toplamDers > 0){
            double average = (double) toplamNot / toplamDers;

            if (average <= 55) {
                System.out.println("Sınıfta kaldınız.");
                System.out.println("Ortalamanız: " + average);
            } else {
                System.out.println("Geçtiniz.");
                System.out.println("Ortalamanız: " + average);
            }
        }else {
            System.out.println("En az bir dersin notunu 0-100 arasında giriniz.");
        }

    }
}
