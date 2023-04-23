package andrea.pirkovic;

public class Main {

	static void testPatka(Patka patka) {
		patka.kvace();
		patka.leti();
		
	}
	
	public static void main(String[] args) {
		
		DivljaPatka patka = new DivljaPatka();
		
		Curka curka = new DivljaCurka();
		
		// Umotavamo Curku u CurkaAdapter zahvaljujuci
		//kome ce izgledati kao Patka
		
		Patka curkaAdapter = new CurkaAdapter(curka);
		
		System.out.println("Curka : ");
		curka.curlice();
		curka.leti();
		
		System.out.println("Patka : ");
		testPatka(patka);
		//pokusavamo da poturimo Curku kao Patku
		System.out.println("AdapterCurka");
		testPatka(curkaAdapter);//metoda testPatka ne zna da je dobila 
		//poruku prerusenu Curku u Patku
		
	}

}
