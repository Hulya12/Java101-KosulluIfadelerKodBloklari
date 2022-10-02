import java.util.Scanner;

public class UcakBiletiAlmaProjesi {
    public static void main(String[] args) {

        /* Mesafe(km),yaş,Yolculuk tipi sor.
          Kmbaşı ücret 0.10 tl
           İlk olarak uçuşun toplam fiyatını hesaplayın ve
          sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın */



        /*Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
          yolculuk tipi ise 1 veya 2) olmalıdır.
          Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
          Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
          Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
          Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
          Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/


        int mesafe, yas, yolculukTipi;
        double kmbasi = 0.10, normalTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Yaşınızı Giriniz : ");
        yas = input.nextInt();

        System.out.print("Lütfen Mesafeyi KM Cinsinden Giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Seyehatiniz tek yönlü ise (1) Gidiş-Geliş ise (2) basınız. : ");
        yolculukTipi = input.nextInt();

        normalTutar = (kmbasi * mesafe);

        double indirimliTutar1 = (normalTutar / 2);
        double indirimliTutar2 = (normalTutar - (normalTutar * 0.10));
        double indirimliTutar3 = (normalTutar - (normalTutar * 0.30));

        boolean kosul1 = (yolculukTipi >= 1 && yolculukTipi <= 2);
        boolean kosul2 = (mesafe > 0);
        boolean kosul3 = (yas > 0);


        if (kosul1 && kosul2 && kosul3) {
            if (yolculukTipi == 1) {
                if (yas < 12) {
                    System.out.println("Toplam Ödemeniz : " + indirimliTutar1);
                } else if (yas >= 12 && yas <= 24) {
                    System.out.println("Toplam Ödemeniz : " + indirimliTutar2);
                } else if (yas > 65) {
                    System.out.println("Toplam Ödemeniz : " + indirimliTutar3);
                }else{
                    System.out.println("Toplam Ödemeniz : " + normalTutar);
                }
            }
            if (yolculukTipi == 2) {
                if (yas < 12) {
                    System.out.println("Toplam Ödemeniz : " + (indirimliTutar1 - (indirimliTutar1 * 0.2)));
                }
                else if (yas >= 12 && yas <= 24){
                    System.out.println("Toplam Ödemeniz : " + (indirimliTutar2-(indirimliTutar2*0.2)));
                }
                else if (yas > 65){
                    System.out.println("Toplam Ödemeniz : " + (indirimliTutar3-(indirimliTutar3*0.2)));
                }else{
                    System.out.println("Toplam Ödemeniz : " + (normalTutar-(normalTutar*0.2)));
                }
            }

            System.out.println("İyi Yolculuklar Dileriz.");


        }else{
            System.out.println("Hatalı Veri Girişi Yaptınız! ");
        }
    }
}


