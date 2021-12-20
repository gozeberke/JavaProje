// Kullanıcıdan bilgi almak için gerekli ekleme
import java.util.Scanner;


public class KullaniciBilgisiAlma {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);  //Kullanıcıdan bilgi alınan kısım
        System.out.print("Bir sayı giriniz: ");
        int deger=oku.nextInt();//Alınan bilgiyi degiskene atama kısmı, degiskenin tipi neyse nextInt,nextFloat şeklinde olmalı.
        System.out.println("Girdiğiniz sayı: "+deger);
        // Kullanıcıdan String ifade alma.

        Scanner StrOku=new Scanner(System.in);
        System.out.print("Kelime Giriniz: ");
        String kelime= StrOku.nextLine();
        System.out.println("Girdiğiniz kelime: "+ kelime);

    }
}
