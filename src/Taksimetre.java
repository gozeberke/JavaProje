import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        double km_uzunluk,km_degeri=2.20,odenecek_tutar;
        int acilis_ucret=10,min_ucret=20;
        System.out.print("Kaç KM gidilecek? : ");
        Scanner km=new Scanner(System.in);
        km_uzunluk=km.nextDouble();
        odenecek_tutar=(km_uzunluk*km_degeri)+acilis_ucret;
        boolean fiyat=odenecek_tutar>20;
        double son_fiyat=fiyat ? odenecek_tutar:min_ucret;
        System.out.println("Taksimetre ücreti: "+son_fiyat);
    }
}
