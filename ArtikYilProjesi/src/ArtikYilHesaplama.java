import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int yil ;


        Scanner input = new Scanner(System.in);


        System.out.print("Lütfen Yılı Giriniz : ");
        yil = input.nextInt();
        double hesap1 = yil % 100,hesap2 = yil % 400,hesap3 = yil % 4;

        if(hesap1 == 0){
            if(hesap2 == 0){
                System.out.println(yil+" bir artık yıldır. ");
            }else{
                System.out.println(yil+" bir artik yıl değildir. ");
            }
        }else{
            if(hesap3 == 0){
                System.out.println(yil+" bir artık yıldır. ");
            }else{
                System.out.println(yil+" bir artık yıl değildir. ");
            }
        }

    }
}
