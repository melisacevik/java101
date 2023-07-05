import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int dogumYili;
        String hayvan = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        dogumYili = input.nextInt();

        if (dogumYili > 0) {
            int kalan = dogumYili % 12;

            switch (kalan) {
                case 0:
                    hayvan = "Maymun";
                    break;
                case 1:
                    hayvan = "Horoz";
                    break;
                case 2:
                    hayvan = "Köpek";
                    break;
                case 3:
                    hayvan = "Domuz";
                    break;
                case 4:
                    hayvan = "Fare";
                    break;
                case 5:
                    hayvan = "Öküz";
                    break;
                case 6:
                    hayvan = "Kaplan";
                    break;
                case 7:
                    hayvan = "Tavşan";
                    break;
                case 8:
                    hayvan = "Ejderha";
                    break;
                case 9:
                    hayvan = "Yılan";
                    break;
                case 10:
                    hayvan = "At";
                    break;
                case 11:
                    hayvan = "Koyun";
                    break;
                default:
                    System.out.println("Hatalı doğum yılı!");
                    System.exit(0);
            }
        } else {
            System.out.println("Hatalı doğum yılı");
            System.exit(0);
        }

        System.out.println("Çin Zodyağı Burcunuz: " + hayvan);
    }
}
