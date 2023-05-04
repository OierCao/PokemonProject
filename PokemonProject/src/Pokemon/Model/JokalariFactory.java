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
			
			if (subType==1) { //easy
				j = new Bot(pJokNum,pPokKop,1);
			}
			else if (subType==2) { //medium
				j = new Bot(pJokNum,pPokKop,2);
			}
			else { //hard
				j = new Bot(pJokNum,pPokKop,3);
			}

		}
		return j;
	}	
}