package Pokemon.Model;

import java.util.ArrayList;
import java.util.Iterator;

public class Bot extends Jokalari {
	int delayms;

	public Bot(int pJokNum,int pPokKop,int pDelayms) {
		super(pPokKop);
		delayms=pDelayms;
		izena = "Bot" + pJokNum;
	}
	
	
	public void jolastu(JokalariZerrenda pJZ) {
		MugimenduKudeatzailea MK = MugimenduKudeatzailea.getMK();
		for (Pokemon p : getPokemonak().getEzAhulduak().getLista()) {
			Jokalari erasoJ = getJokalaria(pJZ);
			Pokemon erasoPok = getAtkPok(erasoJ.getPokemonak().getEzAhulduak());
			
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