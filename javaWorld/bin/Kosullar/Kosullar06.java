package Kosullar;

import java.util.Scanner;

// Kullanıcıdan girilen sayının pozitif mi negatif mi olduğunu bulan proramm

public class Kosullar06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi;
		System.out.print("Lütfen pozitif veya negatif bir sayı giriniz : ");
		sayi = scanner.nextInt();
		
		if(sayi < 0)
		{
			System.out.println("Sayınız NEGATİF'TİR.");
		}
		else if(sayi > 0) 
		{
			System.out.println("Sayınız POZİTİF'TİR.");
		}
		else 
		{
			System.out.println("Lütfen geçerli bir sayı giriniz!!!");
		}

		scanner.close();
	}

}
