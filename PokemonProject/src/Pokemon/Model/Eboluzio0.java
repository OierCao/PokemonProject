package Pokemon.Model;

public class Eboluzio0 implements Eboluzioa{
	
	private int atk=5;
	private int def=3;
	
	@Override
	public void eboluzionatu(Pokemon pPok) {
		pPok.setEboluzio(new Eboluzio1());
		pPok.gehituAtributuak(atk, def);
	}

}
