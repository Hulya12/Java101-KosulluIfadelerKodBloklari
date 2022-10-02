import java.util.Scanner;

public class HavaDurumunaGoreEtkinlik {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input=new Scanner(System.in);

        System.out.print("Sıcaklığı giriniz : ");
        sicaklik = input.nextInt();

        if (sicaklik<5){
            System.out.println("Hava Durumunuz Kayak Yapmak için Uygun,Kayak Yapabilirsiniz.");
        }else if(sicaklik==15){
            System.out.println("Sinemaya gidebilirsiniz veya piknik yapabilirsiniz");
        }else if (sicaklik>= 5 && sicaklik <15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }else if (sicaklik>15 && sicaklik<=25){
            System.out.println("Hava Durumunuz Piknik yapmak için daha uygun");
        }else if(sicaklik>=25){
            System.out.println("Hava Durumunuz Yüzmek için daha uygun");
        }

    }
}
