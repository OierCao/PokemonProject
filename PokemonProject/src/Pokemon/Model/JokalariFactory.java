package Pokemon.Model;

public class JokalariFactory {

	private static JokalariFactory nJF=null;

	private JokalariFactory() {}

	public static JokalariFactory getJF() {
		if (nJF==null) {
			nJF = new JokalariFactory();
		}
		return nJF;
	}

	public Jokalari createJokalari(int type,int pJokNum, int pPokKop) {
		Jokalari j;
		if (type==1) {
			j = new Pertsona(pJokNum,pPokKop);
		}
		else {
			j = new Bot(pJokNum,pPokKop);
		}
		return j;
	}

	
	
}