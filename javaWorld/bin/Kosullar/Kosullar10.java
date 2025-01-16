package Kosullar;

import java.util.Scanner;

// Scanner versiyonu!!
public class Kosullar10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int urunlerToplami = 0;
		
		//Kullanıcıdan ürünlerin fiyatını alıyoruz.
		
		System.out.print("Lütfen birinci ürünün fiyatını giriniz:");
		int urun1 = scanner.nextInt();
		
		System.out.print("Lütfen ikinci ürünün fiyatını giriniz :");
		int urun2 = scanner.nextInt();
		
		System.out.print("Lütfen üçüncü ürünün fiyatını giriniz :");
		int urun3 = scanner.nextInt();
		
		urunlerToplami = urun1+urun2+urun3;
		
		System.out.println(" ");
		
		// Kargo ücreti kontrolü
		
		if(urunlerToplami >= 100) 
		{
			System.out.println("Toplam ödenecek ücret =" + urunlerToplami);
		}
		else 
		{
			System.out.println("Ürünlerin toplam fiyatı = " + urunlerToplami);
			System.out.println("Kargo ücreti = " + 10);
			System.out.println("Toplam ödenecek ücret = " + (urunlerToplami + 10));
		}
		scanner.close();

	}

}
