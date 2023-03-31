	package Pokemon.Model;

import java.util.ArrayList;
import java.util.Observable;

public class Jokalari extends Observable{

	protected String izena;
	protected PokemonZerrenda talde;
	private boolean bizirik;
	private boolean txanda;
	
	//BUILDER
	public Jokalari(int pPokKop) {
		bizirik = true;
		txanda=false;
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
	public PokemonZerrenda getPokemonak() {
		return this.talde;
	}
	public ArrayList<Pokemon> getTalde() {
		return this.talde.getLista();
	}
	public String getIzena() {
		return izena;
	}
	public boolean getTxanda() {
		return this.txanda;
	}
	protected void setTxanda(boolean b) {
		this.txanda=b;
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
		if (talde.guztiakAhulduta()) {
			setBizirik(false);
		}
		setChanged();
		notifyObservers();
	}
	
	public String txanda(){
		if (txanda) {
			return "Jokatu!";
		}
		else {
			return "Itxaron";
		}
	}
	
	
	//SCREEN
	public void eguneratuTaldea(){
		this.talde.pokemonakEguneratu();
	}
	
	
	
}