import java.util.Scanner;
public class LogIn {
    public static void main(String[] args) {
        String userName, password, yeni_sifre, kullanici_adi = "berke", sifre = "berke1234";
        int secim;
        Scanner s = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı girin: ");
        userName = s.nextLine();
        System.out.print("Şifrenizi girin: ");
        password = s.nextLine();
        if (userName.equals(kullanici_adi) && password.equals(sifre)) {
            System.out.println("Giriş yapabilirsiniz.");
        } else {
            if (userName.equals(kullanici_adi)) {
                System.out.println("Şifrenizi yanlış girdiniz.");
                System.out.println("Şirenizi sıfırlamak istiyor musunuz? : \n 1. Evet\n 2. Hayır");
                System.out.print("Seçiminiz(1/2): ");
                secim = s.nextInt();
               switch (secim) {
                   case 1:
                       Scanner ss=new Scanner(System.in);
                       System.out.print("Yeni şifrenizi girin: ");
                       yeni_sifre=ss.nextLine();

                       if(yeni_sifre.equals(sifre)){
                           System.out.println("Yeni şifre eskisi ile aynı olamaz");
                       }else {
                           System.out.println("Şifreniz değiştirildi");

                       }
                       break;
                   case 2:
                       System.out.println("Şifrenizi değiştirilmedi.");
                       break;
                   default:
                       System.out.println("Hatalı tuşlama yaptınız.");
               }


                }
                else if (password.equals(sifre)) {
                    System.out.println("Kullanıcı adınızı yanlış girdiniz.");
                } else {
                    System.out.println("Kullanıcı adı ve sifrenizi yanlış girdiniz.");
                }
                // System.out.println("Kullanıcı adı veya şifre yanlış!");
            }
        }
    }


