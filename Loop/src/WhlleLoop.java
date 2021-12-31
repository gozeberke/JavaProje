import java.util.Scanner;
public class WhlleLoop {
    public static void main(String[] args) {
        int sayi,toplam=0;
        do{
            Scanner inp=new Scanner(System.in);
            System.out.print("Sayı giriniz: ");
            sayi=inp.nextInt();
            if(sayi%4==0){
                toplam+=sayi;
            }



        }while(sayi%2==0);
        System.out.println("4'ün katı olan sayıların toplamı: "+toplam);
    }
}
