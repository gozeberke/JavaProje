import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        int mat,tur,kim,fzk,mzk,sayac=5;
        double ort;
        Scanner inp=new Scanner(System.in);
        System.out.print("Matematik notunu girin: ");
        mat=inp.nextInt();
        if(!(0<mat && mat <100)){
            mat=0;
            sayac-=1;
        }
        System.out.print("Türkçe notunu girin: ");
        tur=inp.nextInt();
        if(!(0<tur && tur <100)){
            tur=0;
            sayac-=1;
        }
        System.out.print("Kimya notunu girin: ");
        kim=inp.nextInt();
        if(!(0<kim && kim <100)){
            kim=0;
            sayac-=1;
        }
        System.out.print("Fizik notunu girin: ");
        fzk=inp.nextInt();
        if(!(0<fzk && fzk <100)){
            fzk=0;
            sayac-=1;
        }
        System.out.print("Müzik notunu girin: ");
        mzk=inp.nextInt();
        if(!(0<mzk && mzk <100)){
            mzk=0;
            sayac-=1;
        }
        ort=(mat+tur+kim+fzk+mzk)/sayac;
        if(ort>55){
            System.out.println("Sınıfı geçtiniz. ");
        }else{
            System.out.println("Sınıfta kaldınız.");
        }
        System.out.print("Ortalama:"+ ort);



    }
}
