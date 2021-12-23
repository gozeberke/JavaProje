import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int num1,num2,secim;
        Scanner number=new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        num1=number.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        num2=number.nextInt();
        System.out.println("Yapmak istediğiniz işlemi seçin: \n 1-Toplama\n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        System.out.print("Yapmak İstediğiniz işlem? :");
        secim=number.nextInt();
        double result;
        switch (secim){

            case 1:
                result=num1+num2;
                System.out.print("İşlem sonucu: "+result);
                break;
            case 2:
                result=num1-num2;
                System.out.print("İşlem sonucu: "+result);
                break;
            case 3:
                result=num1*num2;
                System.out.print("İşlem sonucu: "+result);
                break;
            case 4:
                result=num1/num2;
                System.out.print("İşlem sonucu: "+result);
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
        }



    }
}
