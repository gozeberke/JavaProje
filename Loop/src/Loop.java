import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        int i,toplam=0,sayac=0,sayi;
        double ort = 0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi=inp.nextInt();
        for(i=1;i<sayi;i++){
            if(i%3==0 && i%4==0){
                toplam=toplam+i;
                sayac=sayac+1;
                ort=toplam/sayac;
            }


        }
        System.out.println("Toplam: "+toplam);
        System.out.println("Ortalama: "+ort);
    }
}
