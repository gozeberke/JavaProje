import java.util.Scanner;
public class Weather {
    public static void main(String[] args) {
        int sicaklik;
        Scanner s=new Scanner(System.in);
        System.out.print("Sıcaklık degerini girin: ");
        sicaklik=s.nextInt();
        if(sicaklik<5){
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        }else if(5<=sicaklik && sicaklik<15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }else if(15<=sicaklik && sicaklik<25){
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        else{
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
