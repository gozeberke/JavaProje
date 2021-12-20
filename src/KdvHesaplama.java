import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        double KDV=0.18,urun_fiyat,kdv_fiyat,kdv_tutari;
        System.out.print("Ürünün fiyatını giriniz: ");
        Scanner fiyat=new Scanner(System.in);
        urun_fiyat=fiyat.nextDouble();
        kdv_fiyat= urun_fiyat+urun_fiyat*KDV;
        kdv_tutari=urun_fiyat*KDV;
        System.out.println("Ürünün KDV'li fiyatı: "+kdv_fiyat+"\nÜrün fiyatı: "+urun_fiyat+"\nKDV tutarı: "+kdv_tutari);
    }
}
