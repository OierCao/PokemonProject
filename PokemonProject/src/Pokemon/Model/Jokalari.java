	package Pokemon.Model;

public class Jokalari {

	protected String izena;
	private PokemonZerrenda talde;
	private boolean bizirik;
	
	public Jokalari() {
		bizirik = true;
		
	}
	
	//SET/GET
	public boolean getBizirik() {
		return this.bizirik;
	}
	private void setBizirik(boolean pBizirik) {
		this.bizirik = pBizirik;
	}
	protected PokemonZerrenda getTalde() {
		return this.talde;
	}
	

	
	//EXTRAS
	public void jolastu() {}
	
	
	protected void eguneratuErasotua(Jokalari pJokalari) {
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