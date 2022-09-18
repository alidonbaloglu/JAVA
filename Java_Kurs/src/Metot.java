public class Metot {

	public static void main(String[] args) {
		int toplam = topla(5,6);
		
		System.out.println("Yüzdesel sonuç: "+yuzde(toplam));
	}
	
	public static void mesajVer(String isim, int sayi) {
		System.out.println("mesajver :"+isim +" nurmara :"+sayi);
		
	}
	public static void hesapla(int sayi) {
		System.out.println("hesaplandı :"+sayi);
			
	}
	public static int topla(int sayi1,int sayi2) {
		int toplam= sayi1+sayi2;
		return toplam;
	}
	public static double yuzde(int sayi) {
		double yuzde=(sayi*10)/100;
		return yuzde;
	}
	public static double krediHesapla(double krediMiktari) {
		// Hesaplar Yapılır.
		return 1230;
	}
	
}
