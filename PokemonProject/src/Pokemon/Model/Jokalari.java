	package Pokemon.Model;

public class Jokalari {

	protected String izena;
	private PokemonZerrenda talde;
	private boolean bizirik;
	
	//BUILDER
	public Jokalari(int pPokKop) {
		bizirik = true;
		talde = randomTaldeLortu(pPokKop);
		for (Pokemon p: talde.getLista()) {
			p.estatistikakKalkulatu();
		}
	}
	
	private PokemonZerrenda randomTaldeLortu(int pKop) {
		PokemonKatalogoa PK = PokemonKatalogoa.getPK();
		PokemonZerrenda randomTalde = PK.getLista().getXRandom(pKop);
	
		return randomTalde;
	}
	
	
	//SET/GET
	public boolean getBizirik() {
		return this.bizirik;
	}
	private void setBizirik(boolean pBizirik) {
		this.bizirik = pBizirik;
	}
	public PokemonZerrenda getTalde() {
		return this.talde;
	}
	public String getIzena() {
		return izena;
	}
	
	

	
	//EXTRAS
	public void jolastu() {}
	
	public boolean pokemonaDu(Pokemon pPok) {
		return this.talde.pokemonaDago(pPok);
	}
	
	
	protected void eguneratuErasotua(Jokalari pJokalari) { //beste jokalari baten egoera eguneratu
		pJokalari.eguneratuEgoera();
	}
	
	public void eguneratuEgoera() {	
		if (this.talde.guztiakAhulduta() == true) {
			setBizirik(false);
		}
	}
	
	
	//SCREEN
	public void eguneratuTaldea(){
		this.talde.pokemonakEguneratu();
	}
	
	
	
}