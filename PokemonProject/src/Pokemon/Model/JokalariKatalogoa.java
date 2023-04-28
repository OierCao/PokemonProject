package Pokemon.Model;

public class JokalariKatalogoa {
	private static JokalariKatalogoa nJK = null;
	private JokalariZerrenda lista;
	
	//Singleton patroia
	private JokalariKatalogoa() {
		this.lista = new JokalariZerrenda();
	}
	
	public static JokalariKatalogoa getJK() {
		if (nJK == null) {
			nJK = new JokalariKatalogoa();
		}
		return nJK;	
	}
	
	//Jokalariak eratu
	public Jokalari newJokalari(int pMota, int pSubMota, int pJokNum,int pPokKop) {
		Jokalari newJokalari = this.lista.newJokalari(pMota,pSubMota,pJokNum,pPokKop);
		return newJokalari;
	}
	
	
	//Setter eta Getter
	public JokalariZerrenda getLista() {
		return this.lista;
	}
	
	public void reset() {
		this.lista.removeAll();
	}
	
	public Jokalari getJokPos(int i) { //i posizioan dagoen jokalaria bueltatu
		return lista.getJoklariaPos(i);
	}
	
	public int getPos(Jokalari jok) {//jok Jokalariaren posizioa bueltatu
		return lista.getPos(jok);
	}
}
