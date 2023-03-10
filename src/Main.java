import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar , kdvOrani = 0.18 , kdvOrani2 = 0.08 , kdvTutar , kdvliTutar ;
        Scanner input = new Scanner(System.in);

        System.out.print("Ürün Fiyatını Giriniz " );
        tutar = input.nextInt();

        kdvTutar = tutar*kdvOrani;
        kdvliTutar = tutar+kdvTutar;
        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);
        System.out.println("KDV Tutarı : " + kdvTutar);
    }
}
