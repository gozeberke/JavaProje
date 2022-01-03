import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        int sayi,i;
        Scanner s=new Scanner(System.in);
        System.out.print("Sayi girin: ");
        sayi=s.nextInt();
        double sonuc=0;
        for(i=1;i<=sayi;i++){
            sonuc+=(1.0/i);
        }
        System.out.println(sonuc);
    }
}
