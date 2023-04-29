package Pokemon.Model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;

public abstract class AIPortaera {

	
	
	//INTELIGENTZIA
	protected HashMap<ArrayList<Object>, Integer> efikazia(Pokemon pPok,Jokalari pJok) {
		HashMap<ArrayList<Object>, Integer> map = new HashMap<>();
		
		ArrayList<Jokalari> jokLista = JokalariKatalogoa.getJK().getLista().getLista();
		Iterator<Jokalari> itrJok = jokLista.iterator();
		
		while (itrJok.hasNext()) {
			Jokalari j=itrJok.next();
			if (!j.equals(pJok)) {
				ArrayList<Pokemon> pokLista = j.getTalde();
				Iterator<Pokemon> itrPok = pokLista.iterator();
				
				while (itrPok.hasNext()) {
					Pokemon p=itrPok.next();
					if (!p.getAhulduta()) {
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
							if (efikazia==0.0f) {value=-1000000;}
							else if (efikazia==0.25f) {value=-100;}
							else if (efikazia==0.5f) {value=-50;}
							else if (efikazia==1f) {value=0;}
							else if (efikazia==2f) {value=50;}
							else if (efikazia==4f) {value=100;}
							map.put(arrayInfo, value);
						}
					}
				}
			}	
		}
		return map;
		}
	
	
	protected HashMap<ArrayList<Object>, Integer> euforia(Pokemon pPok,Jokalari pJok) {
		HashMap<ArrayList<Object>, Integer> map = new HashMap<>();
		
		ArrayList<Jokalari> jokLista = JokalariKatalogoa.getJK().getLista().getLista();
		Iterator<Jokalari> itrJok = jokLista.iterator();
		
		while (itrJok.hasNext()) {
			Jokalari j=itrJok.next();
			if (!j.equals(pJok)) {
				ArrayList<Pokemon> pokLista = j.getTalde();
				Iterator<Pokemon> itrPok = pokLista.iterator();
				
				while (itrPok.hasNext()) {
					Pokemon p=itrPok.next();
					if (!p.getAhulduta()) {
						ArrayList<Mota> pokMotak= pPok.getMotak();
						Iterator<Mota> itrMota = pokMotak.iterator();
						
						while (itrMota.hasNext()) {
							Mota m=itrMota.next();
							
							int value=0;
							ArrayList<Object> arrayInfo = new ArrayList <>(); //mota(atk), jokalari, pokemon
							arrayInfo.add(m);
							arrayInfo.add(j);
							arrayInfo.add(p);
							
							Egoera pokEgoera=p.getEgoera();
							//egoera posibleak --> EgoeraNormal, EgoeraEuforia
							if (pokEgoera instanceof EgoeraEuforia) {value=-75;}
							else {
								value=0;
							}
							map.put(arrayInfo, value);
						}
					}
				}
			}	
		}
		return map;
		}
	
	
	protected HashMap<ArrayList<Object>, Integer> euforiaKarga(Pokemon pPok,Jokalari pJok) {
		HashMap<ArrayList<Object>, Integer> map = new HashMap<>();
		
		ArrayList<Jokalari> jokLista = JokalariKatalogoa.getJK().getLista().getLista();
		Iterator<Jokalari> itrJok = jokLista.iterator();
		
		while (itrJok.hasNext()) {
			Jokalari j=itrJok.next();
			if (!j.equals(pJok)) {
				ArrayList<Pokemon> pokLista = j.getTalde();
				Iterator<Pokemon> itrPok = pokLista.iterator();
				
				while (itrPok.hasNext()) {
					Pokemon p=itrPok.next();
					if (!p.getAhulduta()) {
						ArrayList<Mota> pokMotak= pPok.getMotak();
						Iterator<Mota> itrMota = pokMotak.iterator();
						
						while (itrMota.hasNext()) {
							Mota m=itrMota.next();
							
							int value=0;
							ArrayList<Object> arrayInfo = new ArrayList <>(); //mota(atk), jokalari, pokemon
							arrayInfo.add(m);
							arrayInfo.add(j);
							arrayInfo.add(p);
							
							int egoeraI=p.getEgoeraI();
							int egoeraMax=p.getEgoeraIMax();
							float egoeraPercent=egoeraI/egoeraMax;
							
							//egoera posibleak --> EgoeraNormal, EgoeraEuforia
							if (egoeraPercent <= 0.33) {value=25;}
							else if (egoeraPercent > 0.33 && egoeraPercent <= 0.66) {value=0;}
							else if (egoeraPercent > 0.66 && egoeraPercent < 1) {value=-25;}
							map.put(arrayInfo, value);
						}
					}
				}
			}	
		}
		return map;
		}
	
	
	
	protected HashMap<ArrayList<Object>, Integer> bizitzaKop(Pokemon pPok,Jokalari pJok) {
		HashMap<ArrayList<Object>, Integer> map = new HashMap<>();
		
		ArrayList<Jokalari> jokLista = JokalariKatalogoa.getJK().getLista().getLista();
		Iterator<Jokalari> itrJok = jokLista.iterator();
		
		while (itrJok.hasNext()) {
			Jokalari j=itrJok.next();
			if (!j.equals(pJok)) {
				ArrayList<Pokemon> pokLista = j.getTalde();
				Iterator<Pokemon> itrPok = pokLista.iterator();
				
				while (itrPok.hasNext()) {
					Pokemon p=itrPok.next();
					if (!p.getAhulduta()) {
						ArrayList<Mota> pokMotak= pPok.getMotak();
						Iterator<Mota> itrMota = pokMotak.iterator();
						
						while (itrMota.hasNext()) {
							Mota m=itrMota.next();
							
							int value=0;
							ArrayList<Object> arrayInfo = new ArrayList <>(); //mota(atk), jokalari, pokemon
							arrayInfo.add(m);
							arrayInfo.add(j);
							arrayInfo.add(p);
							
							int pHp=p.getHP();
							int pHpMax=p.getMaxHP();
							float HpPercent=pHp/pHpMax;
							
							//egoera posibleak --> EgoeraNormal, EgoeraEuforia
							if (HpPercent <= 0.33) {value=30;}
							else if (HpPercent > 0.33 && HpPercent <= 0.66) {value=15;}
							else {value=0;}
							map.put(arrayInfo, value);
						}
					}
				}
			}	
		}
		return map;
		}
	
	
	
	
	//METODO EXTRAK
	protected ArrayList<Object> getMugimenduHoberena(HashMap<ArrayList<Object>, Integer> hashInfo){
		int max=-999999999;
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
	
	protected HashMap<ArrayList<Object>, Integer> sumHash(ArrayList<HashMap<ArrayList<Object>, Integer>> pIrizpideak) {
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

	
	
	protected ArrayList<Object> mugimenduaPentsatu(Pokemon pPok,Jokalari pJok) {
		return null;};
}
