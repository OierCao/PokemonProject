package Pokemon.Model;

public class JokalariKatalogoa {
	private static JokalariKatalogoa nJK = null;
	private JokalariZerrenda lista;
	
	//BUILDER
	private JokalariKatalogoa() {
		this.lista = new JokalariZerrenda();
	}
	
	public static JokalariKatalogoa getJK() {
		if (nJK == null) {
			nJK = new JokalariKatalogoa();
		}
		return nJK;	
	}
	
	//ADD/REMOVE
	public Jokalari newJokalari(int pMota,int pJokNum,int pPokKop,int pDelayms) {
		Jokalari newJokalari = this.lista.newJokalari(pMota,pJokNum,pPokKop,pDelayms);
		return newJokalari;
	}
	
	
	//SET/GET
	public JokalariZerrenda getLista() {
		return this.lista;
	}
	
	public void reset() {
		this.lista.removeAll();
	}
	
	
	
	//EXTRAS
}
