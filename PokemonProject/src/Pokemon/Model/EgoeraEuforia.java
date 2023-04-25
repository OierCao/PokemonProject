package Pokemon.Model;

public class EgoeraEuforia implements Egoera {
	private int atk=-50;
	private int def=-50;
	
	@Override
	public void egoeraAldatu(Pokemon pPok) {
		pPok.setEgoera(new EgoeraNormal());
		pPok.gehituAtributuak(atk, def);
	}
}
