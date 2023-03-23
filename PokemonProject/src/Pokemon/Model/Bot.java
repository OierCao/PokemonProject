package Pokemon.Model;

import java.util.ArrayList;
import java.util.Iterator;

public class Bot extends Jokalari {

	public Bot(int pJokNum,int pPokKop) {
		super(pPokKop);
		izena = "this.getClass().getName()" + pJokNum;
	}
	
	
	public void jolastu(JokalariZerrenda pJZ) {
		MugimenduKudeatzailea MK = MugimenduKudeatzailea.getMK();
		for (Pokemon p : this.getTalde().getEzAhulduak().getLista()) {
			Jokalari erasoJ = getJokalaria(pJZ);
			Pokemon erasoPok = getAtkPok(erasoJ.getTalde().getEzAhulduak());
			
			MK.setJokErasotzaile(this);
			MK.setPokErasotzaile(p);
			
			MK.setJokErasotua(erasoJ);
			MK.setPokErasotua(erasoPok);
			
			MK.eraso();	
		}
		

	}
	
	
	private Jokalari getJokalaria(JokalariZerrenda pJZ) {
		return pJZ.getRandomBizirik();

	}
	
	private Pokemon getAtkPok(PokemonZerrenda pZ) {
		return pZ.getRandomEzAhulduta();
	}

	
}