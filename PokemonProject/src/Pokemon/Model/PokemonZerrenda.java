package Pokemon.Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class PokemonZerrenda {

	private ArrayList<Pokemon> lista;

	//BUILDER
	public PokemonZerrenda() {
		lista = new ArrayList<Pokemon>();
	}

	//SET/GET
	private Iterator<Pokemon> getIter() {
		return lista.iterator();
	}
	
	public ArrayList<Pokemon> getLista(){
		return this.lista;
	}
	
	public PokemonZerrenda getXRandom(int pKop) {
		PokemonZerrenda pArray = new PokemonZerrenda();
		int i=0;
		Random r = new Random();
		while (i<pKop) {
			 Pokemon aux = lista.get(r.nextInt(lista.size()));
			 pArray.addPokemon(new Pokemon(aux.getIzena(),aux.getMota()));
			 i++;
		} 
		return pArray;	
	}
	
	public PokemonZerrenda getEzAhulduak(){
		PokemonZerrenda pArray = new PokemonZerrenda();
		Iterator<Pokemon> itr = getIter();
		while (itr.hasNext()) {
			 Pokemon p = itr.next();
			 if (!p.getAhulduta()) pArray.addPokemon(p);
		} 
		return pArray;	
	}

	public Pokemon getRandomEzAhulduta() {
		PokemonZerrenda pZ = getEzAhulduak();
		Pokemon p = null;
		int rand;
		Random r=new Random();
		rand = r.nextInt(pZ.lista.size());
		p = this.lista.get(rand);
		return p;
	}
	
	public int getPos(Pokemon pPok) {
		Iterator<Pokemon> itr = getIter();
		boolean aurkitua=false;
		Pokemon p;
		int pos=0;
		while (itr.hasNext() && !aurkitua) {
			p = itr.next();
			if (p.equals(pPok)) {
				aurkitua=true;
			}
			else {
				pos++;
			}
		}
		return pos;
	}
	
	
	
	//ADD/REMOVE
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
	
	
	
	
	
	//EXTRAS
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
	
	public boolean pokemonaDago(Pokemon pPok) {
		Iterator<Pokemon> itr = getIter();
		boolean aurk = false;
		Pokemon p = null;
		while (itr.hasNext() && !aurk) {
			p = itr.next();
			if(p.equals(pPok)) {
				aurk = true;
			}
		}
		return aurk;
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
	

	//SCREEN
	public void pokemonakEguneratu() {
		Iterator<Pokemon> itr = getIter();
		while (itr.hasNext()) {
			 Pokemon p = itr.next();
			 p.eguneratuEgoera();
		} 
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

}