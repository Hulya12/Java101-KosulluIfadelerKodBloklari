import java.util.Scanner;

public class SayilariSiralama {
    public static void main(String[] args) {
        int x,y,z;
        Scanner input= new Scanner(System.in);
        System.out.print("1.Sayıyı Giriniz : ");
        x = input.nextByte();

        System.out.print("2.Sayıyı Giriniz : ");
        y = input.nextInt();

        System.out.print("3.Sayıyı Giriniz : ");
        z = input.nextInt();

        if ((x<y)&&(x<z)){
            if(y<z){
                System.out.println("x<y<z");
            }else{
                System.out.println("x<z<y");
            }
        }else if ((y<z)&&(y<x)){
            if(z<x){
                System.out.println("y<z<x");
            }else{
                System.out.println("y<x<z");
            }
        }else{
            if(x<y){
                System.out.println("z<x<y");
            }else{
                System.out.println("z<y<x");
            }
        }

    }
}
