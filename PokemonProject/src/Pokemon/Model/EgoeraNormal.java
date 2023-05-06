package Pokemon.Model;

public class EgoeraNormal implements Egoera {

	public EgoeraNormal(Pokemon pPok, boolean hasiera) {
		if(!hasiera) {
			pPok.gehituAtributuak(-50,-50);
		}
	}
	@Override
	public void egoeraAldatu(Pokemon pPok) {
		pPok.setEgoera(new EgoeraEuforia(pPok));
	}

}
