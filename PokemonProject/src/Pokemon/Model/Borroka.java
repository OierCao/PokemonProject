package Pokemon.Model;
import java.util.Observable;


public class Borroka extends Observable{
	private static Borroka nB = null;
	private Jokalari irabazle=null;
	
	
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
		JokalariKatalogoa JK = JokalariKatalogoa.getJK();
		int iPer = 0; 
		int iBot = 0;
		//pertsona (1)
		while (iPer<perKop) {
			Jokalari j = JK.newJokalari(1,iPer,pokKop,pDelayms);
			JK.getLista().addJokalari(j);
			eguneratuBorrokaScreen(j);
			iPer++;	
		}
		//bot (2)
		while (iBot<botKop) {
			Jokalari j = JK.newJokalari(2,iBot,pokKop,pDelayms);
			JK.getLista().addJokalari(j);
			eguneratuBorrokaScreen(j);
			iBot++;	
		}
		
	}
	
	
	public void partida() {
		JokalariKatalogoa JK = JokalariKatalogoa.getJK();
		irabazle = null;
		while (irabazle==null) {
			JK.getLista().jokalariakEguneratu();
			irabazle = JK.getLista().txandaJolastu();
		}
		
		JK.reset();
		
	}

	
	//SCREEN
	private void eguneratuBorrokaScreen(Jokalari j) { //actualizar la pantalla porque hay un nuevo jugador
		setChanged();
		System.out.println("Buenos Dias");
		notifyObservers(j);
		
	}
	
	
}
