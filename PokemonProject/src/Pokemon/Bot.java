package Pokemon;

import java.util.ArrayList;
import java.util.Iterator;

public class Bot extends Jokalari {
	int sakonera;

	public Bot(int pSakonera) {
		this.sakonera=pSakonera;
	}
	
	
	public void jolastu(JokalariZerrenda pJZ) {
		for (Pokemon p : this.getTalde().getEzAhulduak()) {
			Jokalaria erasoJ = getJokalaria(pJZ);
			Pokemon erasoPok = getAtkPok(erasoJ.getTalde().getEzAhulduak());
			MugimenduKudeatzailea.eraso(this,p,erasoJ,erasoPok);
			
					
			
		}
		

	}
	
	
	
	private Jokalaria getJokalaria(pJZ) {
		PJZ.getRandom();	
	}
	
	private Pokemon getAtkPok(PokemonZerrenda pZ) {
		pZ.getRandom();
	}

}