import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int a,b,c,select;
        Scanner input=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        a=input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b=input.nextInt();
        System.out.println("1-TOPLAMA\n2-ÇIKARMA\n3-ÇARPMA\n4-BÖLME");
        System.out.print("SEÇİMİNİZ: ");
        select= input.nextInt();

        switch(select){

            case 1:
                System.out.println("SONUCUNUZ: "+(a+b));
                break;
            case 2:
                System.out.println("SONUCUNUZ: "+(a-b));
                break;
            case 3:
                System.out.println("SONUCUNUZ :"+(a*b));
                break;
            case 4:
                if (b==0){
                    System.out.println("Bir sayının 0 ile bölümü tanımsızdır.");
                }else System.out.println("SONUCUNUZ: "+(a/b));
                break;

            default:
                System.out.println("Yanlış seçim yaptınız! Lütfen Tekrar deneyiniz.");


        }


    }
}
