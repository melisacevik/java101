
import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        String userName,password;
        int select;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        userName = inp.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = inp.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş başarılı !");
        }else{
            System.out.println("Tekrar dene! Şifreni değiştirmek için 1 yaz");
            System.out.print("Şifre değiştirmek için 1'i tuşlayın.");
            select = inp.nextInt();
            if(select == 1){
                System.out.println("Yeni şifrenizi giriniz.");
                Scanner input = new Scanner(System.in);
                String newPassword = input.nextLine();

                if( newPassword != password){
                    newPassword = password;
                    System.out.println("Şifreniz güncellendi , giriş yapabilirsiniz");

                }
            }



        }
        }





    }
