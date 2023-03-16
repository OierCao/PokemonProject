package Pokemon;

public class JokalariFactory {

	private static JokalariFactory nJF=null;

	private JokalariFactory() {}

	public static JokalariFactory getJF() {
		if (nJF==null) {
			nJF = new JokalariFactory();
		}
		return nJF;
	}

	public Jokalari createJokalari(int type) {
		Jokalari j;
		if (type==1) {
			j = new Pertsona();
		}
		else {
			j = new Bot();
		}
		return j;
	}

}