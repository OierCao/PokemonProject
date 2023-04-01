	package Pokemon.Model;

import java.util.ArrayList;
import java.util.Observable;

public class Jokalari extends Observable{

	protected String izena;
	protected PokemonZerrenda talde;
	private boolean bizirik;
	private boolean txanda;
	
	//Eraikitzaile
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
	public void setTxanda(boolean b) {
		txanda=b;
		setChanged();
		notifyObservers();
	}
	
	//Beste metodoak
	public void jolastu() {}

	public void eguneratuEgoera() {	
		if (talde.guztiakAhulduta()) {
			setBizirik(false);
		}
		setChanged();
		notifyObservers();
	}
	
	//SCREEN
	public void eguneratuTaldea(){
		this.talde.pokemonakEguneratu();
	}
	
	
	
}