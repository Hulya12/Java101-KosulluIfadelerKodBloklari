import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,password,sifirlama,newPassword;
        Scanner input= new Scanner(System.in);
        System.out.print("Kullanıcı Adını Giriniz : ");
        userName= input.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        password= input.nextLine();

        if (userName.equals("patika") && password.equals("java456")){
            System.out.println("Giriş Yaptınız! ");

        }else{
            System.out.println("Hatalı Giriş Yaptınız! ");
            System.out.println("Yeni Şifre oluşturmak isterseniz \"Evet\" İstemezseniz \"Hayır\" olarak belirtiniz");
        }
        sifirlama= input.nextLine();
        if(sifirlama.equals("Hayır")) {
            System.out.println("Oturum sonlandırıldı!");
        }else if(sifirlama.equals("Evet")) {
            System.out.println("Lütfen yeni bir şifre belirleyiniz.");
            newPassword= input.nextLine();

            if (newPassword.equals("java456")){
                System.out.println("Eski şifreyi girdiniz! Lütfen yeni bir şifre belirleyin.");
            }else{
                System.out.println("Şifreniz başarıyla oluşturuldu.");
            }



        }


    }

}


