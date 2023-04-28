package Pokemon.Model;

public class JokalariFactory {

	private static JokalariFactory nJF=null;

	//Factory patroia
	private JokalariFactory() {}

	public static JokalariFactory getJF() {
		if (nJF==null) {
			nJF = new JokalariFactory();
		}
		return nJF;
	}
	
	public Jokalari createJokalari(int type, int subType, int pJokNum, int pPokKop) {
		Jokalari j;
		if (type==1) {
			j = new Pertsona(pJokNum,pPokKop);
		}
		else {
			
			if (subType==1) {
				Easy e= new Easy();
				j = new Bot(pJokNum,pPokKop,e);
			}
			else if (subType==2) {
				Medium m= new Medium();
				j = new Bot(pJokNum,pPokKop,m);
			}
			else {
				Hard h= new Hard();
				j = new Bot(pJokNum,pPokKop,h);
			}

		}
		return j;
	}	
}