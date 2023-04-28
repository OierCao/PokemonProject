package Pokemon.Model;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;


public class Medium extends AIPortaera{

	@Override
	public ArrayList<Object> mugimenduaPentsatu(Pokemon pPok,Jokalari pJok) {
		ArrayList<HashMap<ArrayList<Object>,Integer>> hmArray= new ArrayList<HashMap<ArrayList<Object>,Integer>>();
		
		HashMap<ArrayList<Object>,Integer> hmEfikazia=super.efikazia(pPok, pJok);
		HashMap<ArrayList<Object>,Integer> hmEuforia=super.euforia(pPok, pJok);
		hmArray.add(hmEfikazia);
		hmArray.add(hmEuforia);
		
		HashMap<ArrayList<Object>,Integer> hmSum=super.sumHash(hmArray);
		ArrayList<Object> mugimenduHoberena =super.getMugimenduHoberena(hmSum);
		return mugimenduHoberena;
	}

}
