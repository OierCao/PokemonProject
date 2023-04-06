package Pokemon.Model;

public class EgoeraNormal implements Egoera {

	private int atk=100;
	private int def=100;
	
	@Override
	public void egoeraAldatu(Pokemon pPok) {
		pPok.setEgoera(new EgoeraEuforia());
		pPok.gehituAtributuak(atk, def);
	}

}
