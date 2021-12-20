import java.util.Scanner;
// girilen kelimeyi tersten yazdıran program
//charat fonksiyonu string ifadenin içindeki elemanlara ulaşmak için kullanılır.
public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Kelime giriniz: ");
        Scanner oku= new Scanner(System.in);
        String kelime =oku.nextLine();
        for(int i=kelime.length();i>0;i--){
            System.out.print(kelime.charAt(i-1));
        }



    }
}
