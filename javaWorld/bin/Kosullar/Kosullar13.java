package Kosullar;
//Scanner sınıfını kullanarak kullanıcıdan not alıyoruz
import java.util.Scanner;

public class Kosullar13 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int ogrenciNotu;

        System.out.print("Lütfen notunuzu giriniz: ");
        ogrenciNotu = scanner.nextInt();

        
        if (ogrenciNotu >= 90 && ogrenciNotu <= 100) {
            System.out.println("AA");
        } else if (ogrenciNotu >= 80 && ogrenciNotu < 90) {
            System.out.println("BA");
        } else if (ogrenciNotu >= 70 && ogrenciNotu < 80) {
            System.out.println("BB");
        } else if (ogrenciNotu >= 60 && ogrenciNotu < 70) {
            System.out.println("CB");
        } else if (ogrenciNotu >= 50 && ogrenciNotu < 60) {
            System.out.println("CC");
        } else if (ogrenciNotu >= 0 && ogrenciNotu < 50) {
            System.out.println("FF");
        } else {
            System.out.println("Geçersiz not girdiniz! Lütfen 0-100 arasında bir değer giriniz.");
        }

        scanner.close();
    }
}
