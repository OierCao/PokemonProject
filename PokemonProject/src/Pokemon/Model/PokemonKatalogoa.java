package Pokemon.Model;

import java.util.Random;

public class PokemonKatalogoa {

	private PokemonZerrenda lista;
	private static PokemonKatalogoa nPK = null;

	//BUILDER
	private PokemonKatalogoa() {
		lista = new PokemonZerrenda();
		Pokemon p1= new Pokemon("charmander", "Fire");
		Pokemon p2= new Pokemon("bulbasaur", "Grass");
		Pokemon p3= new Pokemon("squirtle", "Water");
		Pokemon p4= new Pokemon("pikachu", "Electric");
		
		
		lista.addPokemon(p1);
		lista.addPokemon(p2);
		lista.addPokemon(p3);
		lista.addPokemon(p4);
	}

	
	public static PokemonKatalogoa getPK() {
		if (nPK==null) {
			nPK = new PokemonKatalogoa();
		}
		return nPK;
	}
	
	
	//SET/GET
	public PokemonZerrenda getLista() {
		return this.lista;
	}

	
}