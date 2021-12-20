import java.util.Scanner;
public class OrtalamaHesabi {
    public static void main(String[] args) {
        int mat,fzk,kmy,trk,trh,mzk;
        double sonuc;
        Scanner deger=new Scanner(System.in);

        System.out.print("Matematik Notunuzu Girin: ");
        mat=deger.nextInt();
        System.out.print("Kimya Notunuzu Girin: ");
        fzk=deger.nextInt();
        System.out.print("Fizik Notunuzu Girin: ");
        kmy=deger.nextInt();
        System.out.print("Türkçe Notunuzu Girin: ");
        trk=deger.nextInt();
        System.out.print("Tarih Notunuzu Girin: ");
        trh=deger.nextInt();
        System.out.print("Müzik Notunuzu Girin: ");
        mzk=deger.nextInt();
        sonuc=(mat+fzk+kmy+trk+trh+mzk)/6;
        System.out.println("Ders Ortalamanız: " + sonuc);
        //Sınıf geçeme kalma durumu karşılaştırma
        boolean gecti=sonuc>=60;
        String str = gecti ? "Geçtiniz": "Kaldınız";
        System.out.println("Sınıf Durumunuz: "+str);


    }
}
