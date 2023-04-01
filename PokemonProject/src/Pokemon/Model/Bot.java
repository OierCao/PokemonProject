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
	
	@Override
	public void jolastu() {
		System.out.println("nire izena" + izena + " da eta erasotzeari ekin egingo diot");
		JokalariZerrenda pJZ = JokalariKatalogoa.getJK().getLista();
		MugimenduKudeatzailea MK = MugimenduKudeatzailea.getMK();
		for (Pokemon p : getPokemonak().getEzAhulduak().getLista()) {
			Jokalari erasoJ = getJokalaria(pJZ);
			Pokemon erasoPok = getAtkPok(erasoJ.getPokemonak().getEzAhulduak());
			
			System.out.println(p.getIzena() + " \n pokemonarekin hurrengoari erasotuko diot");
			System.out.println(erasoJ.getIzena() + " jokalariari");
			System.out.println(erasoPok.getIzena() + "pokemonari");
			
			MK.setJokErasotzaile(this);
			MK.setPokErasotzaile(p);
			
			MK.setJokErasotua(erasoJ);
			MK.setPokErasotua(erasoPok);
			
			MK.eraso();	
		}
	}
	
	
	private Jokalari getJokalaria(JokalariZerrenda pJZ) {
		return pJZ.getBesteRandomBizirik(this);

	}
	
	private Pokemon getAtkPok(PokemonZerrenda pZ) {
		return pZ.getRandomEzAhulduta();
	}

	
}