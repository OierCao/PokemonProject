package Pokemon.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class InteligentziaArtifiziala {
	private static InteligentziaArtifiziala nIA=null;
	
	//Singleton patroia
	public static InteligentziaArtifiziala getIA() {
		if (nIA == null) {
			nIA = new InteligentziaArtifiziala();
			}
		return nIA;	
		}

		//--------------------METODO NAGUSIA-----------------
		public ArrayList<Object> mugimenduHoberena(Pokemon pPok,Jokalari pJok, int pIAmaila) {
			
			//HASIERAKETAK
			ArrayList<HashMap<ArrayList<Object>,Integer>> hmArray= new ArrayList<HashMap<ArrayList<Object>,Integer>>();
			ArrayList<Object> mugimenduHoberena = new ArrayList<Object>();
			
			//-----MEDIUM-----
			HashMap<ArrayList<Object>, Integer> hmEfikazia= new HashMap<>();
			HashMap<ArrayList<Object>, Integer> hmEuforia= new HashMap<>();
			hmArray.add(hmEfikazia);
			hmArray.add(hmEuforia);
			//-----HARD-----
			HashMap<ArrayList<Object>,Integer> hmEuforiaKarga= new HashMap<>();
			HashMap<ArrayList<Object>,Integer> hmBizitzaKop= new HashMap<>();
			hmArray.add(hmEuforiaKarga);
			hmArray.add(hmBizitzaKop);

			
			//ITERAZIOAK
			ArrayList<Jokalari> jokLista = JokalariKatalogoa.getJK().getLista().getLista();
			Iterator<Jokalari> itrJok = jokLista.iterator();
			
			while (itrJok.hasNext()) {
				Jokalari j=itrJok.next();
				if (!j.equals(pJok) && j.getBizirik()) {
					ArrayList<Pokemon> pokLista = j.getTalde();
					Iterator<Pokemon> itrPok = pokLista.iterator();
					
					while (itrPok.hasNext()) {
						Pokemon p=itrPok.next();
						if (!p.getAhulduta()) {
							System.out.println(p.getIzena() +" ahulduta: "+ p.getAhulduta());
							ArrayList<Mota> pokMotak= pPok.getMotak();
							Iterator<Mota> itrMota = pokMotak.iterator();
							
							while (itrMota.hasNext()) {
								Mota m=itrMota.next();

								int value=0;
								ArrayList<Object> arrayInfo = new ArrayList <>(); //mota(atk), jokalari, pokemon
								arrayInfo.add(m);
								arrayInfo.add(j);
								arrayInfo.add(p);
								
								
								//-----EASY-----
								if (pIAmaila==1) {
									mugimenduHoberena=this.random(pJok);
								}
								
								//-----MEDIUM-----
								if (pIAmaila>=2) {
									//Efikazia
									value=this.efikazia(m, p);
									hmEfikazia.put(arrayInfo, value);
									
									//Euforia
									value=this.euforia(p);
									hmEuforia.put(arrayInfo, value);
			
									//-----HARD-----
									if (pIAmaila>=3) {
										//EuforiaKarga
										value=this.euforiaKarga(p);
										hmEuforiaKarga.put(arrayInfo, value);
										
										//BizitzaKop
										value=this.bizitzaKop(p);
										hmBizitzaKop.put(arrayInfo, value);
									}
			
								}

							}//mota loop
						}//pokemon !ahulduta
					}//pokemon loop
				}//jokalari !bot
			}//loop jokalari
			
			
			if(pIAmaila>1) {
				HashMap<ArrayList<Object>,Integer> hmSum=this.sumHash(hmArray);
				mugimenduHoberena =this.getMugimenduHoberena(hmSum);
			}
			
			return mugimenduHoberena;
			}
		
		
		
		
		//------------------INTELIGENTZIA METODOAK------------------------
		
		private ArrayList<Object> random(Jokalari pJok){
			ArrayList<Object> mugimenduHoberena = new ArrayList<Object>();
			
			JokalariZerrenda pJZ = JokalariKatalogoa.getJK().getLista();
			Jokalari j=pJZ.getBesteRandomBizirik(pJok);
			Pokemon p = j.getPokemonak().getRandomEzAhulduta();
			Random r = new Random();
			Mota m;
			int i = r.nextInt(2);
			if(p.getMota2()!=null && i==1) {
				m=p.getMota2();
			}
			else {
				m=p.getMota1();
			}
			
			mugimenduHoberena.add(0,m);
			mugimenduHoberena.add(1,j);
			mugimenduHoberena.add(2,p) ;
			return mugimenduHoberena;
		}
		
		private int efikazia(Mota m, Pokemon p) {
			int value=0;
			float efikazia = MugimenduKudeatzailea.getMK().efikaziaCalc(m,p);
			//efikazia posibleak --> 0,0.25,0.5,1,2,4
			if (efikazia==0.0f) {value=-1000000;}
			else if (efikazia==0.25f) {value=-100;}
			else if (efikazia==0.5f) {value=-50;}
			else if (efikazia==1f) {value=0;}
			else if (efikazia==2f) {value=50;}
			else if (efikazia==4f) {value=100;}
			
			return value;
		}
		
		
		private int euforia(Pokemon p) {
			int value=0;
			Egoera pokEgoera=p.getEgoera();
			//egoera posibleak --> EgoeraNormal, EgoeraEuforia
			if (pokEgoera instanceof EgoeraEuforia) {value=-75;}
			else {
				value=0;
			}
			
			return value;
		}
		
		private int euforiaKarga(Pokemon p) {
			int value=0;
			int egoeraI=p.getEgoeraI();
			int egoeraMax=p.getEgoeraIMax();
			float egoeraPercent=egoeraI/egoeraMax;
			
			//egoera posibleak --> EgoeraNormal, EgoeraEuforia
			if (egoeraPercent <= 0.33) {value=25;}
			else if (egoeraPercent > 0.33 && egoeraPercent <= 0.66) {value=0;}
			else if (egoeraPercent > 0.66 && egoeraPercent < 1) {value=-25;}
			
			return value;
		}
		
		private int bizitzaKop(Pokemon p) {
			int value=0;
			int pHp=p.getHP();
			int pHpMax=p.getMaxHP();
			float HpPercent=pHp/pHpMax;
			
			//egoera posibleak --> EgoeraNormal, EgoeraEuforia
			if (HpPercent <= 0.33) {value=30;}
			else if (HpPercent > 0.33 && HpPercent <= 0.66) {value=15;}
			else {value=0;}

			return value;
		}
		
		
		
		//---------------------METODO EXTRAK------------------------
		
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
}