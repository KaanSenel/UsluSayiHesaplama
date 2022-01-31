import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        int sayi=scanner.nextInt();
        System.out.print("Üssü giriniz : ");
        int us=scanner.nextInt();
        int sonuc=1;
        for (int i=1;i<=us;i++){
            sonuc*=sayi;
        }
        System.out.println(sonuc);
    }

}
