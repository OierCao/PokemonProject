package Pokemon.Model;

import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

public class Borroka extends Observable{
	private static Borroka nB = null;
	private Jokalari irabazle=null;
	private Jokalari oraingoJok=null;
	private int millis;
	private Timer timer;
	
	//Singleton patroia
	private Borroka() {
	}
	
	public static Borroka getBorroka() {
		if (nB==null) {
			nB = new Borroka();
		}
		return nB;
	}
	
	//Getter eta Setter
	public Jokalari getIrabazale() {
		return irabazle;
		
	}
	public void setIrabazle(Jokalari pJok) {
		System.out.println("irabazlea dago \n");
		AudioKudeatzailea.getAudioKudeatzailea().playAudio("victory");
		irabazle=pJok;
	}
	public Jokalari getOraingoJok() {
		return this.oraingoJok;
	}
	
	
	
	//Beste metodoak
	public void hasieraketak(int perKop, int botKopEasy, int botKopMed, int botKopHard, int pokKop, int pDelayms) {
		millis=pDelayms;
		JokalariKatalogoa.getJK();
		int iPer = 0; 
		int iBot = 0;
		//pertsona (1,x)
		while (iPer<perKop) {
			Jokalari j = JokalariKatalogoa.getJK().newJokalari(1,0,iPer,pokKop);
			JokalariKatalogoa.getJK().getLista().addJokalari(j);
			eguneratuBorrokaScreen(JokalariKatalogoa.getJK().getPos(j));
			iPer++;	
		}
		//bot easy(2,1)
		while (iBot<botKopEasy) {
			Jokalari j = JokalariKatalogoa.getJK().newJokalari(2,1,iBot,pokKop);
			JokalariKatalogoa.getJK().getLista().addJokalari(j);
			eguneratuBorrokaScreen(JokalariKatalogoa.getJK().getPos(j));
			iBot++;	
		}
		
		//bot med(2,2)
		while (iBot<botKopMed) {
			Jokalari j = JokalariKatalogoa.getJK().newJokalari(2,2,iBot,pokKop);
			JokalariKatalogoa.getJK().getLista().addJokalari(j);
			eguneratuBorrokaScreen(JokalariKatalogoa.getJK().getPos(j));
			iBot++;	
			}
		
		//bot hard(2,3)
		while (iBot<botKopHard) {
			Jokalari j = JokalariKatalogoa.getJK().newJokalari(2,3,iBot,pokKop);
			JokalariKatalogoa.getJK().getLista().addJokalari(j);
			eguneratuBorrokaScreen(JokalariKatalogoa.getJK().getPos(j));
			iBot++;	
			}
		
		partida();
	}
	
	public void partida() {
		long l=0;
		irabazle = null;
		TimerTask txandaJolastu = new TimerTask() {
			public void run() {
				irabazle = JokalariKatalogoa.getJK().getLista().irabazlea();
				if (irabazle==null) {
					txandaJolastu();
					irabazle = JokalariKatalogoa.getJK().getLista().irabazlea();
					JokalariKatalogoa.getJK().getLista().jokalariakEguneratu();
				}
				else {
					JokalariKatalogoa.getJK().reset();
					timerAmaitu();
				}
			}
		};
		timer = new Timer();
		timer.scheduleAtFixedRate(txandaJolastu, l, (long)millis);
	}
	
	private void timerAmaitu() {
		timer.cancel();
	}
	
	private void txandaJolastu() {
		JokalariKatalogoa.getJK().getLista().setGuztienTxandaFalse();
		Jokalari oraingoJ = null;
		
		oraingoJ = JokalariKatalogoa.getJK().getLista().getRandomBizirik();
		oraingoJok=oraingoJ;
		eguneratuConsoleScreen(-1);
		
		System.out.println(oraingoJ.getIzena() + "-ren txanda \n");
		oraingoJ.setTxanda(true);
		if (oraingoJ instanceof Pertsona) {
			timerAmaitu();
			System.out.println("Pertsona naiz");
		}
		else {
			((Bot)oraingoJ).jolastu();
		}
	}

	
	//Pantalla eguneratu
	private void eguneratuBorrokaScreen(int pJokPos) { //actualizar la pantalla porque hay un nuevo jugador
		setChanged();
		
		notifyObservers(pJokPos);
	}
	
	//Pantalla eguneratu
		private void eguneratuConsoleScreen(int value) { //actualizar la pantalla porque hay un nuevo jugador
			setChanged();
			
			notifyObservers(value);
		}
	
	
}
