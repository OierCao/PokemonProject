package Pokemon.Model;

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
			
				System.out.println(p.getIzena() + " pokemonarekin hurrengoari erasotuko diot");
				System.out.println(erasoJ.getIzena() + " jokalariari");
				System.out.println(erasoPok.getIzena() + " pokemonari");
			
				MK.setJokErasotzaile(this);
				MK.setPokErasotzaile(p);
			
				MK.setJokErasotua(erasoJ);
				MK.setPokErasotua(erasoPok);
			
				irabazlea = MK.eraso();	
			}
			
		}
	}	
}