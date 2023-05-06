package Pokemon.Model;

public class EgoeraEuforia implements Egoera {

	public EgoeraEuforia(Pokemon pPok) {
		pPok.gehituAtributuak(50,50);
	}
	
	@Override
	public void egoeraAldatu(Pokemon pPok) {
		pPok.setEgoera(new EgoeraNormal(pPok, false));
	}
}
