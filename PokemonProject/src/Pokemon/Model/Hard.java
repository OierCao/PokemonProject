package Pokemon.Model;

import java.util.ArrayList;
import java.util.HashMap;

public class Hard extends AIPortaera{


	@Override
	public ArrayList<Object> mugimenduaPentsatu(Pokemon pPok,Jokalari pJok) {
		ArrayList<HashMap<ArrayList<Object>,Integer>> hmArray= new ArrayList<HashMap<ArrayList<Object>,Integer>>();
		HashMap<ArrayList<Object>,Integer> hmEfikazia=super.efikazia(pPok, pJok);
		HashMap<ArrayList<Object>,Integer> hmEuforia=super.euforia(pPok, pJok);
		HashMap<ArrayList<Object>,Integer> hmEuforiaKarga=super.euforiaKarga(pPok, pJok);
		HashMap<ArrayList<Object>,Integer> hmBizitzaKop=super.bizitzaKop(pPok, pJok);
		hmArray.add(hmEfikazia);
		hmArray.add(hmEuforia);
		hmArray.add(hmEuforiaKarga);
		hmArray.add(hmBizitzaKop);
		HashMap<ArrayList<Object>,Integer> hmSum=super.sumHash(hmArray);
		
		ArrayList<Object> mugimenduHoberena =super.getMugimenduHoberena(hmSum);
		return mugimenduHoberena;
	}

}
