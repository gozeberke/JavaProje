import java.util.Scanner;

public class Kombinasyon {

    public static int Fak(int sayi)
    {
        if (sayi >= 1)
            return sayi * Fak(sayi - 1);
        else
            return 1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,r,com;
        System.out.print("n değerinini girin: ");
        n=s.nextInt();
        System.out.print("r değerinini girin: ");
        r=s.nextInt();
        com=Fak(n)/(Fak(r)*Fak(n-r));
        System.out.println("("+n+","+r+") kombinasyon sonucu: "+com);

    }



}
