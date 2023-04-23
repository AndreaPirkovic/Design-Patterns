package andrea.pirkovic;
//Prvo se implementira interfejs tipa prema kojem
	//se vrsi prilagodjavanje
	//to je interfejs koji klijent ocekuje
public class CurkaAdapter implements Patka{
	
	Curka curka;
	// 2.korak u implementaciji interfejsa 
	// je dobiti referencu na objekat koji prilagodjavamo
	
	public CurkaAdapter(Curka curka) {
		this.curka=curka;
		
	}
	// 3.implementiranje metoda iz interfejsa
	//prevodjenje metode kvace() u metodu curlice() izmedju klasa
	public void kvace() {
		curka.curlice();
	}
	public void leti() {
		for (int i=0; i<5;i++) {
			curka.leti();
		}
	}
	
}
