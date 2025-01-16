package Kosullar;

// 100 TL ve üzeri kargo yok!!
import java.util.Scanner;

public class Kosullar11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int urunlerToplami = 0;
        int kargoUcreti = 10;
        int kargoUcretsizLimit = 100;

        System.out.print("Kaç adet ürün gireceksiniz? ");
        int urunSayisi = scanner.nextInt();

        // Ürünlerin fiyatlarını kullanıcıdan alıyoruz
        for (int i = 1; i <= urunSayisi; i++) {
            System.out.print(i + ". ürünün fiyatını giriniz: ");
            int urunFiyati = scanner.nextInt();
            urunlerToplami += urunFiyati; // Toplam fiyatı güncelliyoruz
        }
        
        System.out.println(" ");

        // Toplam fiyat ve kargo ücreti hesaplama
        if (urunlerToplami >= kargoUcretsizLimit) {
            System.out.println("Toplam ürün fiyatı = " + urunlerToplami + " TL");
            System.out.println("Kargo ücretsiz!");
            System.out.println("Toplam ödenecek tutar = " + urunlerToplami + " TL");
        } else {
            System.out.println("Toplam ürün fiyatı = " + urunlerToplami + " TL");
            System.out.println("Kargo ücreti = " + kargoUcreti + " TL");
            System.out.println("Toplam ödenecek tutar = " + (urunlerToplami + kargoUcreti) + " TL");
        }

        scanner.close(); // Scanner'ı kapatmayı unutmayın
    }
}
