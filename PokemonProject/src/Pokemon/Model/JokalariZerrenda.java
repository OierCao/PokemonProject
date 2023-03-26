package Pokemon.Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class JokalariZerrenda {
	private ArrayList<Jokalari> lista;
	
	
	//BUILDER
	public JokalariZerrenda() {
		lista = new ArrayList<Jokalari>();
	}
	
	
	//ADD/REMOVE
	public void addJokalari(Jokalari pJokalaria) {
		this.lista.add(pJokalaria);
	}
	public void removeJokalari(Jokalari pJokalaria) {
		this.lista.remove(pJokalaria);
	}
	
	public Jokalari newJokalari(int pMota,int pJokNum,int pPokKop,int pDelayms) {
		Jokalari newJokalari = JokalariFactory.getJF().createJokalari(pMota,pJokNum,pPokKop,pDelayms);
		return newJokalari;
	}
	
	
	//SET/GET
	private Iterator<Jokalari> getIter() {
		return lista.iterator();
	}
	
	public void removeAll() {
		this.lista.clear();
	}
	public ArrayList<Jokalari> getLista(){
		return lista;
	}
	
	private JokalariZerrenda getBizirikDaudenak() {
		JokalariZerrenda pArray = new JokalariZerrenda();;
		Iterator<Jokalari> itr = getIter();
		while (itr.hasNext()) {
			 Jokalari j = itr.next();
			 if (!j.getBizirik()) pArray.addJokalari(j);
		} 
		return pArray;	
	}
	
	
	public Jokalari getRandomBizirik() {
		JokalariZerrenda jZ = getBizirikDaudenak();
		Jokalari j = null;
		int rand;
		Random r=new Random();
		rand = r.nextInt(lista.size()-1);
		j = this.lista.get(rand);
		return j;
	}
	
	
	
	//EXTRAS 
	public Jokalari txandaJolastu() {
		Jokalari jIrabazle = null;
		Jokalari oraingoJ = null;
		
		oraingoJ = getRandomBizirik();
		oraingoJ.jolastu();
		
		jIrabazle = irabazlea();
		
		return jIrabazle;
	}
	
	
	public Jokalari irabazlea() {
		Iterator<Jokalari> itr = getIter();
		Jokalari jIrabazle = null;
		int i = 0;
		while (itr.hasNext() && i<2) {
			Jokalari j = itr.next();
			if (j.getBizirik()) {
				jIrabazle = j;
				i++;
			}
		}
		if (i>1) {
			jIrabazle = null;
		}
		return  jIrabazle;
	}
	
	
	public Jokalari norDagoJolasten() {
		Iterator<Jokalari> itr = getIter();
		Jokalari jJolasten = null;
		boolean aurkitua=false;
		while (itr.hasNext() && !aurkitua) {
			Jokalari j = itr.next();
			if (j instanceof Pertsona) {
				if ( ((Pertsona) j).getJolasten() ) { 
					jJolasten=j;
					aurkitua=true;
					}
			}
		}
		return  jJolasten;
	}
	

}
