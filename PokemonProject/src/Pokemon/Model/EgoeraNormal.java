package Pokemon.Model;

public class EgoeraNormal implements Egoera {

	private int atk=50;
	private int def=50;
	
	@Override
	public void egoeraAldatu(Pokemon pPok) {
		pPok.setEgoera(new EgoeraEuforia());
		pPok.gehituAtributuak(atk, def);
	}

}
