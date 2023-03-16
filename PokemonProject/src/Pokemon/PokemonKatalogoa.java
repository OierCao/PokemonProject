package Pokemon;

public class PokemonKatalogoa {

	private PokemonZerrenda lista;
	private static PokemonKatalogoa nPK;

	private PokemonKatalogoa() {
		lista = new PokemonZerrenda();
		Pokemon p1= new Pokemon();
	}

	public static PokemonKatalogoa getPK() {
		if (nPK==null) {
			nPK = new PokemonKatalogoa();
		}
		return nPK;
	}

	
}