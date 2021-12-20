import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        double KDV,urun_fiyat,kdv_fiyat,kdv_tutari;
        System.out.print("Ürünün fiyatını giriniz: ");
        Scanner fiyat=new Scanner(System.in);
        urun_fiyat=fiyat.nextDouble();
        if(urun_fiyat>0 && urun_fiyat<1000){
            KDV=0.18;
        }else{
            KDV=0.08;
        }
        kdv_fiyat= urun_fiyat+urun_fiyat*KDV;
        kdv_tutari=urun_fiyat*KDV;
        System.out.println("Ürünün KDV'li fiyatı: "+kdv_fiyat+"\nÜrün fiyatı: "+urun_fiyat+"\nKDV tutarı: "+kdv_tutari);


    }
}
