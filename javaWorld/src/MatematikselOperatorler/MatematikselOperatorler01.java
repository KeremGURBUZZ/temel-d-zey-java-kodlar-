package MatematikselOperatorler;

public class MatematikselOperatorler01 {

	public static void main(String[] args) {
		
		// + toplama operatörü
		int sayi1 = 100;
		int sayi2 = 345;
		
		int toplam = (sayi1 + sayi2);
		System.out.println("Sayıların toplamı = " + toplam);
		// + toplama operatörü
		
		// - çıkarma operatörü
		double yenisayi1 = 12.5;
		double yenisayi2 = 6.4;
		double yenitoplam = yenisayi1 - yenisayi2;
		System.out.println("Sayıların çıkarma işlemi sonucu = " + yenitoplam);
		// - çıkarma operatörü
		
		// / bölme operatörü
		yenisayi1 = 123;
		yenisayi2 = 30;
		yenitoplam = yenisayi1/yenisayi2;
		System.out.println("Bölme işlemi sonucu = " + yenitoplam);
		// / bölme operatörü
		
		// * çarpma işlemi
		toplam = sayi1 * sayi2;
		System.out.println(toplam);
		// * çarpma işlemi
		
		// % mod alma operatörü (kalan bulma)
		System.out.println(77%13);
		// % mod alma operatörü (kalan bulma)

	}

}
