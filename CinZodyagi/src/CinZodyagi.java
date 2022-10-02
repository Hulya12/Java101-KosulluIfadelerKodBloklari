import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int dogumyili,zodyakburcu;
        Scanner input = new Scanner(System.in);
        System.out.print("Hangi Yılda Doğdunuz? : ");
        dogumyili= input.nextInt();

        zodyakburcu=dogumyili%12;

        if(zodyakburcu==0){
            System.out.println("Çin Zodyağına göre Burcunuz MAYMUN! ");

        }else if(zodyakburcu==1){
            System.out.println("Çin Zodyağına göre Burcunuz HOROZ! ");

        }else if(zodyakburcu==2){
            System.out.println("Çin Zodyağına göre Burcunuz KÖPEK! ");

        }else if(zodyakburcu==3){
            System.out.println("Çin Zodyağına göre Burcunuz DOMUZ! ");

        }else if(zodyakburcu==4){
            System.out.println("Çin Zodyağına göre Burcunuz FARE! ");

        }else if(zodyakburcu==5){
            System.out.println("Çin Zodyağına göre Burcunuz ÖKÜZ! ");

        }else if(zodyakburcu==6){
            System.out.println("Çin Zodyağına göre Burcunuz KAPLAN! ");

        }else if(zodyakburcu==7){
            System.out.println("Çin Zodyağına göre Burcunuz TAVŞAN! ");

        }else if(zodyakburcu==8){
            System.out.println("Çin Zodyağına göre Burcunuz EJDERHA! ");

        }else if(zodyakburcu==9){
            System.out.println("Çin Zodyağına göre Burcunuz YILAN! ");

        }else if(zodyakburcu==10){
            System.out.println("Çin Zodyağına göre Burcunuz AT! ");

        }else if(zodyakburcu==11){
            System.out.println("Çin Zodyağına göre Burcunuz KOYUN! ");
        }


    }
}
