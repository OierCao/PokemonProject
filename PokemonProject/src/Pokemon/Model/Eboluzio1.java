package Pokemon.Model;

public class Eboluzio1 implements Eboluzioa{

	private int atk=7;
	private int def=5;
	
	@Override
	public void eboluzionatu(Pokemon pPok) {
		pPok.setEboluzio(new Eboluzio2());
		pPok.gehituAtributuak(atk, def);
	}
}
