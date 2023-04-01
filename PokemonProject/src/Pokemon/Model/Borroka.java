package Pokemon.Model;
import java.util.Observable;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class Borroka extends Observable{
	private static Borroka nB = null;
	private Jokalari irabazle=null;
	private int txanda;
	private int millis;
	private Timer timer;
	
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
	public void setIrabazle(Jokalari pJok) {
		irabazle=pJok;
	}
	
	
	
	//EXTRAS
	public void hasieraketak(int perKop, int botKop, int pokKop, int pDelayms) {
		millis=pDelayms;
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
		long l=0;
		irabazle = null;
		TimerTask txandaJolastu = new TimerTask() {
			public void run() {
				if (irabazle==null) {
					JokalariKatalogoa.getJK().getLista().txandaJolastu();
					irabazle = JokalariKatalogoa.getJK().getLista().irabazlea();
					JokalariKatalogoa.getJK().getLista().jokalariakEguneratu();
				}
				else {
					irabazle.eguneratuEgoera();
					JokalariKatalogoa.getJK().reset();
					timerAmaitu();
				}
			}
		};
		timer = new Timer();
		timer.scheduleAtFixedRate(txandaJolastu, l, (long)millis);
		
	}
	
	public void timerAmaitu() {
		timer.cancel();
		timer.purge();
	}

	
	//SCREEN
	private void eguneratuBorrokaScreen(int pJokPos) { //actualizar la pantalla porque hay un nuevo jugador
		setChanged();
		notifyObservers(pJokPos);
		
	}
	
	
}
