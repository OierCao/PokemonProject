package Pokemon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class PokemonZerrenda {

	private ArrayList<Pokemon> lista;

	public PokemonZerrenda() {
		lista = new ArrayList<Pokemon>();
	}

	private Iterator<Pokemon> getIter() {
		return lista.iterator();
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
	
	
	public boolean guztiakAhulduta() {
		boolean ahuldutak = true;
		Iterator<Pokemon> itr = getIter();
		while (itr.hasNext() && ahuldutak == true) {
			 Pokemon p = itr.next();
			 ahuldutak = p.getAhulduta();
		} 
		return ahuldutak;	
	}
	
	public PokemonZerrenda getEzAhulduak(){
		PokemonZerrenda pArray = new PokemonZerrenda();
		int i;
		Iterator<Pokemon> itr = getIter();
		while (itr.hasNext()) {
			 Pokemon p = itr.next();
			 if (!p.getAhulduta()) pArray.addPokemon(p);
		} 
		return pArray;	
	}
	
	/*
	public Pokemon getXPokemon(Pokemon pPok) {
		Pokemon p = null;
		boolean aurkitua = false;
		Iterator<Pokemon> itr = getIter();
		while (itr.hasNext() && !aurkitua) {
			 p = itr.next();
			 if (p.equals(pPok)) {
				 aurkitua=true;
			 }
		} 
		return p;	
	}
	*/
	
	public Pokemon getRandom() {
		Pokemon p;
		int rand;
		Random r=new Random();
		rand = r.nextInt(1, this.lista.size());
		p = this.lista.get(rand);
		return p;
	}
	
	
	
	public void pokemonakEguneratu() {
		Iterator<Pokemon> itr = getIter();
		while (itr.hasNext()) {
			 Pokemon p = itr.next();
			 p.eguneratuEgoera();
		} 
	}


}