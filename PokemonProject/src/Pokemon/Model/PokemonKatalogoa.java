package Pokemon.Model;

public class PokemonKatalogoa {

	private PokemonZerrenda lista;
	private static PokemonKatalogoa nPK = null;

	//BUILDER
	private PokemonKatalogoa() {
		lista = new PokemonZerrenda();
		Pokemon p1= new Pokemon("Charmander", "Fire");
		Pokemon p2= new Pokemon("Bulbasuar", "Grass");
		Pokemon p3= new Pokemon("Squirtle", "Water");
		Pokemon p4= new Pokemon("Pikachu", "Electric");
		
		
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