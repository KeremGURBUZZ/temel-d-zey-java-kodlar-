package Kosullar;

import java.util.Scanner;

// Kullanıcıdan alınan sayının tek mi çift mi olduğunu bulan program
public class Kosullar08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sayi;
		System.out.print("Lütfen bir sayı giriniz : ");
		sayi = scanner.nextInt();
		if(sayi == 0) 
		{
			System.out.println("Sayı SIFIFDIR.");
		}
		else if(sayi % 2 == 0) 
		{
			System.out.println("Sayi ÇİFTTİR.");
		}
		else if(sayi % 2 != 0) 
		{
			System.out.println("Sayı TEKTİR.");
		}
		else 
		{
			System.out.println("Lütfen geçerli bir sayı giriniz.");
		}
		
       scanner.close();
	}
	
}
