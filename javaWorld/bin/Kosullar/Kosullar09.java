package Kosullar;
//100 TL ve üzeri kargo yok!!
public class Kosullar09 {

	public static void main(String[] args) {
		
		int urunlerToplami,urun1=9,urun2=34,urun3=47;
		urunlerToplami = urun1+urun2+urun3;
		
		if(urunlerToplami >= 100) 
		{
			System.out.println("Toplam ödenecek ücret =" + urunlerToplami);
		}
		else 
		{
			System.out.println("Ürünlerin toplam fiyatı = " + urunlerToplami );
			System.out.println("Kargo ücreti = " + 10);
			System.out.println("Toplam ödenecek ücret = " + (urunlerToplami+10));
		}

	}

}
