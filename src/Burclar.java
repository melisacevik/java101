import java.util.Scanner;
public class Burclar {
    public static void main(String[] args) {
        int month,day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay:");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün: ");
        day = input.nextInt();

        if(month == 1){
            if( day >= 1 && day <= 31){
                if( day < 22){
                    burc = "Oglak";
                }else{
                    burc = "Kova";
                }
            }else{
                isError = true;
            }
        }else if( month == 2){
            if( day >= 1 && day <= 28){
                if( day < 20){
                    burc = "Kova";
                }else{
                    burc = "Balık";
                }
            }else{
                isError = true;
            }
        }else if(month == 3){
            if( day >= 1 && day <= 31){
                if( day < 21 ){
                    burc = "Balık";
                }else{
                    burc = "Koç";
                }
            }else{
                isError = true;
            }
        }else if(month == 4){
            if( day >= 1 && day <= 30){
                if( day < 21){
                    burc = "Koc";
                }else{
                    burc = "Boğa";
                }
            }else{
                isError = true;
            }
        }else{
            System.out.println("hatali ay/gün yazdınız !!!!!");
        }

        if(isError){
            System.out.println("Hatalı ay/gün yazdınız");
        }else{
            System.out.println("Burcunuz: " + burc);
        }
    }
}
