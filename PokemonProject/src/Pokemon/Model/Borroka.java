package Pokemon.Model;
import java.util.Observable;

public class Borroka extends Observable{
	private static Borroka nB = null;
	
	
	//BUILDER
	private Borroka() {	
	}
	
	public static Borroka getBorroka() {
		if (nB==null) {
			nB = new Borroka();
		}
		return nB;
	}
	
	
	
	
	//EXTRAS
	public void hasieraketak(int perKop, int botKop, int pokKop) {
		JokalariKatalogoa JK = JokalariKatalogoa.getJK();
		int iPer = 0; 
		int iBot = 0;
		//pertsona (1)
		while (iPer<=perKop) {
			Jokalari j = JK.newJokalari(1,iPer,pokKop);
			JK.getLista().addJokalari(j);
			eguneratuBorrokaScreen();
			iPer++;	
			
		}
		//bot (2)
		while (iBot<=botKop) {
			Jokalari j = JK.newJokalari(2,iBot,pokKop);
			JK.getLista().addJokalari(j);
			eguneratuBorrokaScreen();
			iBot++;	
		}
		
	}
	
	
	public void partida() {
		JokalariKatalogoa JK = JokalariKatalogoa.getJK();
		Jokalari irabazle = null;
		while (irabazle==null) {
			irabazle = JK.getLista().txandaJolastu();
		}
		
		JK.reset();
		
	}
	
	
	//SCREEN
	private void eguneratuBorrokaScreen() { //actualizar la pantalla porque hay un nuevo jugador
		setChanged();
		notifyObservers();
		
	}
	
	
}
