import java.util.Scanner;
public class Cash {
    public static void main(String[] args) {
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, toplamTutar;
        double armutTL = 2.14, elmaTL = 3.67 , domatesTL = 1.11, muzTL = 0.95, patlicanTL = 5.00;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kg ? : ");
        armutKg = input.nextDouble();
        System.out.print("Elma kaç kg ? : ");
        elmaKg = input.nextDouble();
        System.out.print("Domates kaç kg ? : ");
        domatesKg = input.nextDouble();
        System.out.print("Muz kaç kg ? : ");
        muzKg = input.nextDouble();
        System.out.print("Patlıcan kaç kg ? : ");
        patlicanKg = input.nextDouble();

        toplamTutar = ( armutKg * armutTL) + (elmaKg * elmaTL) + (domatesKg * domatesTL) + ( muzKg * muzTL) + (patlicanKg * patlicanTL);
        System.out.print("Toplam tutar: " + toplamTutar);
    }
}
