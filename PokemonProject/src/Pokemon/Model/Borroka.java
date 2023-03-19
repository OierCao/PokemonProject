package Pokemon.Model;

public class Borroka {
	private static Borroka nB;
	
	
	//BUILDER
	private Borroka() {	
	}
	
	public static Borroka getBorroka() {
		if (nB==null) {
			nB = new Borroka();
		}
		return nB;
	}
	
	
	
	public void hasieraketak(int perKop, int botKop, int pokKop) {
		JokalariKatalogoa JK = JokalariKatalogoa.getJK();
		int iPer = 0; 
		int iBot = 0;
		int jokNum = 0;
		//1-->Per,2-->bot
		while (iPer<=perKop) {
			JK.newJokalari(1,jokNum,pokKop);
			jokNum++;
			
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
	
	
	
	
	
}
