	package Pokemon;

public class Jokalari {

	private String izena;
	private PokemonZerrenda talde;
	private boolean bizirik;
	
	
	
	
	public void eguneratuTaldea(){
		this.talde.pokemonakEguneratu();
	}
	
	
	public void eguneratuEgoera() {	
		if (this.talde.guztiakAhulduta() == true) {
			setBizirik(false);
		}
	}
	
	
	private void setBizirik(boolean pBizirik) {
		this.bizirik = pBizirik;
	}
	
	
	protected PokemonZerrenda getTalde() {
		return this.talde;
	}
	
	
	
}