
public class Main {

	public static void main(String[] args) {
		sayiBulma();
		sayiBulma();

	}
	public static void sayiBulma() {
		int[] sayilar= new int[] {1,2,3,4,5,6,7,9,0};
		int aranacak =6;
		boolean varMi = false;
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		if (varMi) {
			mesajVer("Sayi Mevcuttur: "+aranacak);
		}
		else {
			mesajVer("Sayi Mevcut Değildir: "+aranacak);
		}
		
	}
	public static void mesajVer(String mesaj){
		System.out.println(mesaj);
		
		
	}

}
