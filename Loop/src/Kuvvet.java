import java.util.Scanner;
public class Kuvvet {
    public static void main(String[] args) {
        int sayi,dort_kuv=1,bes_kuv=1;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi=inp.nextInt();
        for(int i=1;i<sayi;i*=4){
            System.out.println( "Dördün kuvvetleri :"+i);
        }
        for(int j=1;j<sayi;j*=5){
            System.out.println( "Beşin kuvvetleri :"+j);
        }

    }
}
