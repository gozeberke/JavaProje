import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.print("Birinci Sayiyi Girin: ");
        a = s.nextInt();
        System.out.print("İkinci Sayiyi Girin: ");
        b = s.nextInt();
        System.out.print("Üçüncü Sayiyi Girin: ");
        c = s.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("Sıralama: " + c + "<" + b + "<" + a);
            } else
                System.out.println("Sıralama: " + b + "<" + c + "<" + a);
        }else if(b>a && b>c){
            if(a>c){
                System.out.println("Sıralama: "+c+"<"+a+"<"+b);
            }else
                System.out.println("Sıralama: "+a+"<"+c+"<"+b);
        }else if(c>a && c>b){
            if(a>b){
                System.out.println("Sıralama: "+b+"<"+a+"<"+c);
            }else
                System.out.println("Sıralama: "+a+"<"+b+"<"+c);

        }
    }
}