import java.sql.SQLOutput;
import java.util.Scanner;

public class AlistirmaSorulari {
    public static void main(String[] args) {
        /*
        //1. Daire alan ve cevre hesabı baslangıc.
        double PI=3.14,r;
        double alan,cevre,dilim_alan,ma;
        Scanner yaricap=new Scanner(System.in);
        System.out.print("Yarıcap girin: ");
        r=yaricap.nextDouble();
        System.out.print("Merkez acı ölçüsü girin: ");
        ma=yaricap.nextDouble();
        alan=r*r*PI;
        cevre=2*r*PI;
        dilim_alan=(PI * (r*r) * ma) / 360;
        System.out.println("Dairenin Alanı: "+alan+"\nDairenin Çevresi: "+cevre+"\nMerkez açısı "+ma+" olan daire diliminin alanı: "+dilim_alan);
        // Daire alan ve cevre hesabı son */
        /*
        //2.Vücut kitle indeksi hesaplama baslangıc
        double boy,kilo,kitle_indeks;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz:(80) ");
        kilo=inp.nextDouble();
        System.out.println("Boyunuzu metre cinsinden girin:orn(1,80) ");
        boy=inp.nextDouble();
        kitle_indeks=kilo/(boy*boy);
        System.out.println("Vücut kitle endeksiniz: "+kitle_indeks);
        //Vücut kitle indeksi hesaplama bitis  */

        //3. Manav Hesaplama baslangıc
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5;
        double a,e,d,m,p,tplm_fyt;
        Scanner kg=new Scanner(System.in);
        System.out.print("Armut kg ?: ");
        a=kg.nextDouble();
        System.out.print("Elma kg ?: ");
        e=kg.nextDouble();
        System.out.print("Domates kg ?: ");
        d=kg.nextDouble();
        System.out.print("Muz kg ?: ");
        m=kg.nextDouble();
        System.out.print("Patlıcan kg ?: ");
        p=kg.nextDouble();
        tplm_fyt=((a*armut)+(e*elma)+(d*domates)+(muz*m)+(patlican*p));
        System.out.println("Toplam Fiyat: "+tplm_fyt);



    }
}
