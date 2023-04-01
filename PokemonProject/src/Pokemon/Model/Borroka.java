package Pokemon.Model;
import java.util.Observable;
import java.util.Random;


public class Borroka extends Observable{
	private static Borroka nB = null;
	private Jokalari irabazle=null;
	private int txanda;
	private int delay;
	
	//BUILDER
	private Borroka() {
	}
	
	public static Borroka getBorroka() {
		if (nB==null) {
			nB = new Borroka();
		}
		return nB;
	}
	
	public Jokalari getIrabazale() {
		return irabazle;
	}
	
	
	
	//EXTRAS
	public void hasieraketak(int perKop, int botKop, int pokKop, int pDelayms) {
		delay=pDelayms;
		JokalariKatalogoa.getJK();
		int iPer = 0; 
		int iBot = 0;
		//pertsona (1)
		while (iPer<perKop) {
			Jokalari j = JokalariKatalogoa.getJK().newJokalari(1,iPer,pokKop);
			JokalariKatalogoa.getJK().getLista().addJokalari(j);
			eguneratuBorrokaScreen(JokalariKatalogoa.getJK().getPos(j));
			iPer++;	
		}
		//bot (2)
		while (iBot<botKop) {
			Jokalari j = JokalariKatalogoa.getJK().newJokalari(2,iBot,pokKop);
			JokalariKatalogoa.getJK().getLista().addJokalari(j);
			eguneratuBorrokaScreen(JokalariKatalogoa.getJK().getPos(j));
			iBot++;	
		}
		
	}
	
	public void txandaKalkulatu() {
		Random r = new Random();
		txanda = r.nextInt(JokalariKatalogoa.getJK().getLista().jokalariKop()-1);
		JokalariKatalogoa.getJK().getJokPos(txanda).setTxanda(true);
	}
	
	
	public void partida() {
		JokalariKatalogoa JK = JokalariKatalogoa.getJK();
		irabazle = null;
		while (irabazle==null) {
			JK.getLista().jokalariakEguneratu();
			irabazle = JK.getLista().txandaJolastu();
		}
		irabazle.eguneratuEgoera();
		System.out.println("\n\n Irabazlea " + irabazle.getIzena() +"da");
		JK.reset();
		
	}

	
	//SCREEN
	private void eguneratuBorrokaScreen(int pJokPos) { //actualizar la pantalla porque hay un nuevo jugador
		setChanged();
		notifyObservers(pJokPos);
		
	}
	
	
}
