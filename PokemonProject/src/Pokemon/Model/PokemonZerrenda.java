package Pokemon.Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class PokemonZerrenda {

	private ArrayList<Pokemon> lista;

	//Eraikitzailea
	public PokemonZerrenda() {
		lista = new ArrayList<Pokemon>();
	}

	//SET/GET
	public ArrayList<Pokemon> getLista(){return this.lista;}
	
	public PokemonZerrenda getXRandom(int pKop) {
		PokemonZerrenda pArray = new PokemonZerrenda();
		int i=0;
		Random r = new Random();
		while (i<pKop) {
			int mota1 = r.nextInt(Mota.values().length);
			pArray.addPokemon(new Pokemon(Mota.values()[mota1]));
			i++;
		} 
		return pArray;	
	}

	public PokemonZerrenda getEzAhulduak(){
		PokemonZerrenda pArray = new PokemonZerrenda();
		lista.stream().filter(p->!p.getAhulduta()).forEach(p->pArray.addPokemon(p));
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
	
	//Pokemonak gehitu eta kendu
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
	
	//Beste Metodoak
	public int getPokemonPos(Pokemon pPok) {
		return lista.indexOf(pPok);
	}


	//Pantalla
	public void pokemonakEguneratu() {
		lista.stream().forEach(p->p.eguneratuEgoera());
	}
}