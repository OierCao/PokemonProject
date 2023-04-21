package Pokemon.Model;

import java.util.Random;

public class Bot extends Jokalari {
	
	//Eraikitzaile
	public Bot(int pJokNum,int pPokKop) {
		super(pPokKop);
		izena = "Bot" + pJokNum;
	}
	
	//Getter
	private Jokalari getJokalaria(JokalariZerrenda pJZ) {
		return pJZ.getBesteRandomBizirik(this);
	}
	
	private Pokemon getAtkPok(PokemonZerrenda pZ) {
		return pZ.getRandomEzAhulduta();
	}
	
	//Beste metodoak
	public void jolastu() {
		System.out.println("Nire izena " + izena + " da eta erasotzeari ekin egingo diot");
		JokalariZerrenda pJZ = JokalariKatalogoa.getJK().getLista();
		MugimenduKudeatzailea MK = MugimenduKudeatzailea.getMK();
		
		Jokalari irabazlea=pJZ.irabazlea();
		
		for (Pokemon p : getPokemonak().getEzAhulduak().getLista()) {
			if (irabazlea==null) {
				Jokalari erasoJ = getJokalaria(pJZ);
				Pokemon erasoPok = getAtkPok(erasoJ.getPokemonak().getEzAhulduak());
			
				System.out.println(p.getId() + " pokemonarekin hurrengoari erasotuko diot");
				System.out.println(erasoJ.getIzena() + " jokalariari");
				System.out.println(erasoPok.getId() + " pokemonari");
			
				MK.setJokErasotzaile(this);
				MK.setPokErasotzaile(p);
				Random r = new Random();
				int i = r.nextInt(2);
				if(p.getMota2()!=null && i==1) {
					System.out.println("Eraso egingo diot " + p.getMota2().toString() + " atakearekin");
					MK.setMotaAtk(p.getMota2());
				}
				else {
					System.out.println("Eraso egingo diot " + p.getMota1().toString() + " atakearekin");
					MK.setMotaAtk(p.getMota1());
				}
			
				MK.setJokErasotua(erasoJ);
				MK.setPokErasotua(erasoPok);
				
			
				irabazlea = MK.eraso();	
			}
			
		}
	}	
}