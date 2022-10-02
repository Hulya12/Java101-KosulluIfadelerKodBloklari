import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int month,day;


        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen Hangi Ayda Doğduğunuzu giriniz : ");
        month = input.nextInt();
        System.out.print("Lütfen Hangi Günde Doğduğunuzu giriniz : ");
        day = input.nextInt();


        if (month>=1 && month<=12){
            if(month==1){
                if(day>=1 && day<=31){
                    if(day<=21){
                        System.out.println("Burcunuz Oğlak!");
                    }else{
                        System.out.println("Burcunuz Kova! ");
                    }
                }else{
                    System.out.println("Hatalı Bir Gün Girdiniz.");
                }
            }
            if (month == 2){
                if(day>=1 && day<=28){
                    if(day<20){
                        System.out.println("Burcunuz Kova! ");
                    }else{
                        System.out.println("Burcunuz Balık");
                    }
                }else{
                    System.out.println("Hatalı Bir Gün Girdiniz.");
                }
            }
            if (month == 3){
                if(day>=1 && day<=31){
                    if(day<=20){
                        System.out.println("Burcunuz Balık!");
                    }else{
                        System.out.println("Burcunuz Koç!");
                    }
                }else{
                    System.out.println("Hatalı Gün Girdiniz.");
                }
            }

            if (month == 4){
                if(day>=1 && day<=30){
                    if(day<=20){
                        System.out.println("Burcunuz Koç!");
                    }else{
                        System.out.println("Burcunuz Boğa!");
                    }
                }else{
                    System.out.println("Hatalı Gün Girdiniz.");
                }
            }
            if (month == 5){
                if(day>=1 && day<=31){
                    if(day<=21){
                        System.out.println("Burcunuz Boğa!");
                    }else{
                        System.out.println("Burcunuz İkizler!");
                    }
                }else{
                    System.out.println("Hatalı Gün Girdiniz.");
                }
            }
            if (month == 6){
                if(day>=1 && day<=30){
                    if(day<=22){
                        System.out.println("Burcunuz İkizler!");
                    }else{
                        System.out.println("Burcunuz Yengeç!");
                    }
                }else{
                    System.out.println("Hatalı Gün Girdiniz.");
                }
            }
            if (month == 7){
                if(day>=1 && day<=31){
                    if(day<=22){
                        System.out.println("Burcunuz Yengeç!");
                    }else{
                        System.out.println("Burcunuz Aslan!");
                    }
                }else{
                    System.out.println("Hatalı Gün Girdiniz.");
                }
            }
            if (month == 8){
                if(day>=1 && day<=31){
                    if(day<=22){
                        System.out.println("Burcunuz Aslan!");
                    }else{
                        System.out.println("Burcunuz Başak!");
                    }
                }else{
                    System.out.println("Hatalı Gün Girdiniz.");
                }
            }
            if (month == 9){
                if(day>=1 && day<=30){
                    if(day<=22){
                        System.out.println("Burcunuz Başak!");
                    }else{
                        System.out.println("Burcunuz Terazi!");
                    }
                }else{
                    System.out.println("Hatalı Gün Girdiniz.");
                }
            }
            if (month == 10){
                if(day>=1 && day<=31){
                    if(day<=22){
                        System.out.println("Burcunuz Terazi!");
                    }else{
                        System.out.println("Burcunuz Akrep!");
                    }
                }else{
                    System.out.println("Hatalı Gün Girdiniz.");
                }
            }
            if (month == 11){
                if(day>=1 && day<=30){
                    if(day<=22){
                        System.out.println("Burcunuz Akrep!");
                    }else{
                        System.out.println("Burcunuz Yay!");
                    }
                }else{
                    System.out.println("Hatalı Gün Girdiniz.");
                }
            }
            if (month == 12){
                if(day>=1 && day<=31){
                    if(day<=21){
                        System.out.println("Burcunuz Yay!");
                    }else{
                        System.out.println("Burcunuz Oğlak!");
                    }
                }else{
                    System.out.println("Hatalı Gün Girdiniz.");
                }
            }
        }
        else {
            System.out.println("Lütfen ay tarihinizi doğru girdiğinizden emin olun! ");
        }
    }

}

