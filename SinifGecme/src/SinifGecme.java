import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,muzik,toplamdersnotu=0,toplamderssayisi=0;
        double ortalama;
        Scanner input=new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        if (mat>=0 && mat<=100) {
            toplamdersnotu+=mat;
            toplamderssayisi++;
        }
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        if (fizik>=0 && fizik<=100){
            toplamdersnotu+=fizik;
            toplamderssayisi++;
        }
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        if (kimya>=0 && kimya<=100){
            toplamdersnotu+=kimya;
            toplamderssayisi++;
        }
        System.out.print( "Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        if (turkce>=0 && turkce<=100){
            toplamdersnotu+=turkce;
            toplamderssayisi++;
        }
        System.out.print("Müzik notunuzu giriniz : ");
        muzik= input.nextInt();
        if (muzik>=0 && muzik<=100){
            toplamdersnotu+=muzik;
            toplamderssayisi++;
        }

        ortalama=(toplamdersnotu/toplamderssayisi);

        if (toplamderssayisi==5) {
            if (ortalama <= 55) {
                System.out.println("Sınıfta kaldınız, sınavı geçmek için çalışmalısın!");
            }else{
                System.out.println("Tebrikler sınıfı geçtiniz!");
            }
        }else{
            System.out.println("Eksik veya hatalı not girişi yaptınız.");
            System.out.println("Lütfen girdiğiniz notların 0 ile 100 arasında olduğundan emin olunuz");
            System.out.println("Doğru girdiğiniz not adedi:"+toplamderssayisi);
        }
        System.out.print("Ortalamanız : " + ortalama);

    }
}
