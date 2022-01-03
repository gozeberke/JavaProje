import java.util.Scanner;
public class BasTop {
    public static void main(String[] args) {
        int sayi;
        Scanner s=new Scanner(System.in);
        System.out.print("Sayi girin: ");
        sayi=s.nextInt();
        int bolum,sayac=0,sonuc=0,basDeger,copy_sayi=sayi;

        //basamak sayısı bulma
        while(copy_sayi!=0){
            copy_sayi /=10;
            sayac+=1;
        }

        copy_sayi=sayi;

        for(int i=0;i<sayac;i++){
            basDeger=copy_sayi%10;
            sonuc+=basDeger;
            copy_sayi /=10;

        }
        System.out.println(sayi+"'nın basamakları toplamı: "+sonuc);
    }
}
