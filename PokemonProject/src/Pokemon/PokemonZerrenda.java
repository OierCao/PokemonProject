package Pokemon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class PokemonZerrenda {

	private ArrayList<Pokemon> lista;

	public PokemonZerrenda() {
		lista = new ArrayList<Pokemon>();
	}

	private Iterator<Pokemon> getIter() {
		return lista.iterator();
	}
	
	public Pokemon bilatuPokemon(String pIzena) {
		Iterator<Pokemon> itr = getIter();
		boolean aurk = false;
		Pokemon p = null;
		while (itr.hasNext() && !aurk) {
			p = itr.next();
			if(p.getIzena().equals(pIzena)) {
				aurk = true;
			}
		}
		if (aurk) {
			return p;
		}
		else {
			return null;
		}
	}

	public void addPokemon(Pokemon pPok) {
		lista.add(pPok);
	}

	public Pokemon removePokemon(Pokemon pPok) {
		try {
			lista.remove(pPok);
		}
		catch(Exception e) {System.out.println ("Ez da aurkitu pokemona.");}
		return pPok;
	}

}