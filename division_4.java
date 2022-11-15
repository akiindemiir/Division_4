import java.util.Scanner;

public class division_4 {
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz: ");
            sayi = input.nextInt();
            if (sayi%4==0) {
                toplam+=sayi;
            }
        } while (sayi%2==0);

        System.out.println("Sayılar Toplamı: " +toplam);

    }
}