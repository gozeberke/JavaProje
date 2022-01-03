
import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        int sayi,n;
        double sonuc=1;

        Scanner s=new Scanner(System.in);
        System.out.print("Sayı girin: ");
        sayi=s.nextInt();
        System.out.print("Üs girin: ");
        n=s.nextInt();
        if(n==0){
            System.out.println("işlem sonucu: "+sonuc);
        }else{
            for(int i=1;i<=n;i++){
                sonuc*=sayi;
            }
            System.out.println("işlem sonucu: "+sonuc);

        }



    }
}
