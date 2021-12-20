import java.util.Scanner;
public class UcgenHesabi {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner ucgen_kenar=new Scanner(System.in);
        System.out.print("Ücgenin yatay kenarını girin: ");
        a=ucgen_kenar.nextInt();
        System.out.print("Ücgenin dik kenarını girin: ");
        b=ucgen_kenar.nextInt();
        c=Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenüs değeri :"+c);
    }
}
