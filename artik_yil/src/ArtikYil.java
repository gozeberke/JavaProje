import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        String yil_durumu;
        Scanner s= new Scanner(System.in);
        System.out.print("Yıl girin: ");
        yil=s.nextInt();
        if(yil%4==0 ) {
            yil_durumu="Artık yıldır";
            if(yil%100==0){
                if(yil%400==0){
                    yil_durumu="Artık yıldır";

                }else {
                    yil_durumu="Artık yıl degil";

                }
            }
            System.out.println(yil+" "+yil_durumu);
        }else System.out.println(yil+ " Artık yıl değil");
    }
}
