package Kosullar;

import java.util.Scanner;

//Kullanıcı giriş sistemi
public class Kosullar12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String kullaniciAdi = "Admin",sifre = "123";
		String girilenKullaniciAdi,girilenSifre;
		
		System.out.print("Lütfen kullanıcı adını giriniz: ");
		girilenKullaniciAdi = scanner.nextLine();
		
		System.out.println("Lütfen şifrenizi giriniz: ");
		girilenSifre = scanner.nextLine();
		
		if(girilenKullaniciAdi.equals(kullaniciAdi) && girilenSifre.equals(sifre))
		{
			System.out.println("Sisteme giriş yapıldı.");
		}
		else if(girilenKullaniciAdi.equals(kullaniciAdi) &&! girilenSifre.equals(sifre))
		{
			System.out.println("Şifre hatalı.");
		}
		else if(! girilenKullaniciAdi.equals(kullaniciAdi) && girilenSifre.equals(sifre)) 
		{
			System.out.println("Kullanıcı adı hatalı.");
		}
		else 
		{
			System.out.println("Sisteme giriş yapılamadı.");
		}
	scanner.close();
	}

}
