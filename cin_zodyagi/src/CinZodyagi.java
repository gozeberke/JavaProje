import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        int dogum_tarih;
        String burc;
        Scanner s=new Scanner(System.in);
        System.out.print("Doğum yılınızı girin: ");
        dogum_tarih=s.nextInt();
        if(dogum_tarih%12==0){
            burc="Maymun";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }else  if(dogum_tarih%12==1){
            burc="Horoz";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }else if(dogum_tarih%12==2){
            burc="Köpek";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }else if(dogum_tarih%12==3){
            burc="Domuz";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }else if(dogum_tarih%12==4){
            burc="Fare";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }else if(dogum_tarih%12==5){
            burc="Öküz";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }else if(dogum_tarih%12==6){
            burc="Kaplan";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }else if(dogum_tarih%12==7){
            burc="Tavşan";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }else if(dogum_tarih%12==8){
            burc="Ejderha";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }else if(dogum_tarih%12==9){
            burc="Yılan";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }else if(dogum_tarih%12==10){
            burc="At";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }else if(dogum_tarih%11==2){
            burc="Koyun";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }
    }
}
