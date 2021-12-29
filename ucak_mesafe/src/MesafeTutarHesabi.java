import java.util.Scanner;
public class MesafeTutarHesabi {
    public static void main(String[] args) {
        int mesafe,yon_tercih,km_ucret,yas,normal_tutar;
        double yas_indirim_oran,yon_techi_oran = 0,indirimli_tutar;
        Scanner s=new Scanner(System.in);
        System.out.print("Gidilecek mesafeyi km cinsinden girin: ");
        mesafe=s.nextInt();
        System.out.print("Yasınızı girin: ");
        yas=s.nextInt();
        System.out.print("Yolculuk tipini girin:(1-tek yön)/(2-gidiş-dönüş): ");
        yon_tercih=s.nextInt();

        if(mesafe<0){
            System.out.println("Hatalı mesafe girdiniz");

        }

        if(yas<12){
            yas_indirim_oran=0.5;
        }else if(12<=yas && yas<=24){
            yas_indirim_oran=0.1;
        }else if(yas>65){
            yas_indirim_oran=0.3;
        }else{
            yas_indirim_oran=0;
        }
        switch (yon_tercih){
            case 1:
                yon_techi_oran=0;
                break;
            case 2:
                yon_techi_oran=0.2;
                mesafe=2*mesafe;
                break;
            default:
                System.out.println("Yanlış yön tercihi yaptınız");
        }
        normal_tutar= (int) (mesafe*0.10);
        indirimli_tutar=normal_tutar-(normal_tutar*yas_indirim_oran)-(normal_tutar*yon_techi_oran);
        System.out.print("Bilet fiyat: "+indirimli_tutar);

    }
}
