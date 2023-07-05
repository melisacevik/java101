
//switch-case !!!!!!!!!!!
public class CodeBlocks {
    public static void main(String[] args) {
        int day = 1;

        if( day == 1){
            System.out.println("Bugün pzt");
        }else if( day ==2){
            System.out.println("bugün salı");
        }else if( day ==3){
            System.out.println("bugün çrş");
        }else if( day ==4){
            System.out.println("bugün prş");
        }else if( day ==5){
            System.out.println("bugün cuma");
        }else if( day ==6){
            System.out.println("bugün ctesi");
        }else if( day ==7){
            System.out.println("bugün pazar");
        }else{
            System.out.println("hatalı giris");
        }

        switch (day){
            case 1:
                System.out.println("Bugün pzt");
            break;
            case 2:
                System.out.println("Bugün salı");
            break;
            default:
                System.out.println("hatalı giris");
        }

        int points=6;
        switch(points)
        {
            case 6:
                ;
            case 7:
                System.out.println("Java");break;
            case 8:
                ;
            case 9:
                System.out.println("101");break;
            case 10:
                System.out.println("Patika"); break;
            default:
                System.out.println("Dev");
        }
    }


}
