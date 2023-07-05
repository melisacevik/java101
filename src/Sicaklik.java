import java.util.Scanner;
public class Sicaklik {
    public static void main(String[] args) {
        int heat;

        System.out.print("Sıcaklığı giriniz: ");
        Scanner input = new Scanner(System.in);
        heat = input.nextInt();

        if(heat < 5){
            System.out.println("Kayak yap!");
        }else if( heat >= 5 && heat <= 10){
            System.out.println("Sinemaya git!");
        }else if( heat >= 10 && heat <= 15){
            System.out.println("Sinemaya veya pikniğe git");
        }else if( heat >= 15 && heat <= 25){
            System.out.println("Pikniğe git");
        }else{
            System.out.println("Yüzmeye git");
        }
    }
}
