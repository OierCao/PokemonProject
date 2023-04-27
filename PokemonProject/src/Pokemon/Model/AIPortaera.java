package Pokemon.Model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;

public abstract class AIPortaera {

	
	
	public void random() { //all values = 0
		
	}
	
	
	public HashMap<ArrayList<Object>, Integer> efikazia(Pokemon pPok,Jokalari pJok) {
		HashMap<ArrayList<Object>, Integer> map = new HashMap<>();
		
		ArrayList<Jokalari> jokLista = JokalariKatalogoa.getJK().getLista().getLista();
		Iterator<Jokalari> itrJok = jokLista.iterator();
		
		while (itrJok.hasNext()) {
			Jokalari j=itrJok.next();
			ArrayList<Pokemon> pokLista = j.getTalde();
			Iterator<Pokemon> itrPok = pokLista.iterator();
			
			while (itrPok.hasNext()) {
				Pokemon p=itrPok.next();
				ArrayList<Mota> pokMotak= pPok.getMotak();
				Iterator<Mota> itrMota = pokMotak.iterator();
				
				while (itrMota.hasNext()) {
					Mota m=itrMota.next();
					
					int value=0;
					ArrayList<Object> arrayInfo = new ArrayList <>(); //mota(atk), jokalari, pokemon
					arrayInfo.add(m);
					arrayInfo.add(j);
					arrayInfo.add(p);
					
					float efikazia = MugimenduKudeatzailea.getMK().efikaziaCalc(m,p);
					//efikazia posibleak --> 0,0.25,0.5,1,2,4
					if (efikazia==0.0f) {value=-10000;}
					else if (efikazia==0.25f) {value=-100;}
					else if (efikazia==0.5f) {value=-50;}
					else if (efikazia==1f) {value=0;}
					else if (efikazia==0.25f) {value=50;}
					else if (efikazia==0.25f) {value=100;}
					map.put(arrayInfo, value);
				}
			}
		}
		
		return map;
		
		}
	
	
	/*
	public HashMap<ArrayList<String>, Integer> bizitzaKop(Pokemon pPok,Jokalari pJok) {
		//JokalariKatalogoa.getJK();
		
		int value=0;
		ArrayList<String> ArrayInfo = new ArrayList<String>(); //mota(atk), jokalari, pokemon
		HashMap<ArrayList<String>, Integer> map = new HashMap<>();
		loop jokalari
			loop pokemon
				simulatu eraso
				
		
		
		
		
		}
	 */
	
	
	private ArrayList<Object> getMugimenduHoberena(HashMap<ArrayList<Object>, Integer> hashInfo){
		int max=-1000000;
		ArrayList<Object> mugimenduHoberena = new ArrayList<Object>();
		
		for ( Map.Entry<ArrayList<Object>, Integer> entry : hashInfo.entrySet() )
		{
			int mugimenduValue=hashInfo.get(entry.getKey() );
				
			if (mugimenduValue>max) {
				max=mugimenduValue;
				mugimenduHoberena=entry.getKey();
				}
		    }
		return mugimenduHoberena;
	}
	
	private HashMap<ArrayList<Object>, Integer> sumHash(ArrayList<HashMap<ArrayList<Object>, Integer>> pIrizpideak) {
		HashMap<ArrayList<Object>, Integer> hashFinal= pIrizpideak.get(0);
		pIrizpideak.remove(0);
		
		Iterator<HashMap<ArrayList<Object>, Integer>> itr = pIrizpideak.iterator();
		while ( itr.hasNext()) {
			HashMap<ArrayList<Object>, Integer> hM = itr.next();
			for ( Map.Entry<ArrayList<Object>, Integer> entry : hM.entrySet() )
			{
				ArrayList<Object> key = entry.getKey();
				int mugimenduValue=hM.get(key);
				int finalValue=hashFinal.get(key);
				
				int suma= finalValue + mugimenduValue;
				hashFinal.replace(key, suma);
			}
		}
		
		return hashFinal;
	}

	
	
	public void mugimenduaPentsatu() {};
	
}
