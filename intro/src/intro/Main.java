package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		// isimlendirmeler camel case şeklinde yazılır.
		String  ortaMetin = "ilginizi çekebilir";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin);
		
		int vade = 12;
		double dolarDun = 18.15;
		double dolarBugun = 18.20;
		
		boolean dolarDuştuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun < dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
			
		} else if(dolarBugun > dolarDun) {
			okYonu ="up.svg";
			System.out.println(okYonu);
			
		} else {
			okYonu ="equal.svg";
			System.out.println(okYonu);
				
		}
		
		String[] krediler = {"hızlı kredi",
				"maaşını hakdan alan" ,
				"mutlu emekli"};
		for (int i = 0; i < krediler.length; i++) {
			
			System.out.println(krediler[i]);

			
		}
		
	}

}
