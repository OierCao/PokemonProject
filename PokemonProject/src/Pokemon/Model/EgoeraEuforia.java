package Pokemon.Model;

public class EgoeraEuforia implements Egoera {
	private int atk=-100;
	private int def=-100;
	
	@Override
	public void egoeraAldatu(Pokemon pPok) {
		pPok.setEgoera(new EgoeraNormal());
		pPok.gehituAtributuak(atk, def);
	}
}
