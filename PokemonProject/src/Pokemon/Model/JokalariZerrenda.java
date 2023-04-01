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
	
	public Jokalari newJokalari(int pMota,int pJokNum,int pPokKop) {
		Jokalari newJokalari = JokalariFactory.getJF().createJokalari(pMota,pJokNum,pPokKop);
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
			 if (j.getBizirik()) {
				 pArray.addJokalari(j);
			 }
		} 
		return pArray;	
	}
	
	
	public Jokalari getRandomBizirik() {
		JokalariZerrenda jZ = getBizirikDaudenak();
		Jokalari j = null;
		int rand;
		Random r=new Random();
		rand = r.nextInt(jZ.lista.size());
		j = jZ.lista.get(rand);
		return j;
	}
	
	public Jokalari getBesteRandomBizirik(Jokalari pJok) {
		Jokalari j = null;
		boolean aurkitua=false;
		while (!aurkitua) {
			j = this.getRandomBizirik();
			if (!j.equals(pJok)) {
				aurkitua=true;
			}
		}
		return j;
	}
	
	public int getPos(Jokalari pJok) {
		Iterator<Jokalari> itr = getIter();
		boolean aurkitua=false;
		Jokalari j;
		int pos=0;
		while (itr.hasNext() && !aurkitua) {
			j = itr.next();
			if (j.equals(pJok)) {
				aurkitua=true;
			}
			else {
				pos++;
			}
		}
		return pos;
	}
	public Jokalari getJoklaraiPos(int i) {
		return lista.get(i);
	}
	
	public int jokalariKop() {
		return lista.size();
	}
	
	
	
	//EXTRAS 
	public Jokalari txandaJolastu() {
		setGuztienTxandaFalse();
		Jokalari oraingoJ = null;
		
		oraingoJ = getRandomBizirik();
		System.out.println(oraingoJ.getIzena() + "-ren txanda \n");
		oraingoJ.setTxanda(true);
		oraingoJ.jolastu();
		if (oraingoJ instanceof Pertsona) {
			Borroka.getBorroka().timerAmaitu();
			System.out.println("Pertsona naiz");
		}
		return oraingoJ;
	}
	
	
	public Jokalari irabazlea() {
		Iterator<Jokalari> itr = getIter();
		Jokalari jIrabazle = null;
		int i = 0;
		while ( itr.hasNext() && i<this.lista.size() ) {
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
				if (j.getTxanda() ) { 
					jJolasten=j;
					aurkitua=true;
					}
			}
		}
		return  jJolasten;
	}


	public void jokalariakEguneratu() {
		Iterator<Jokalari> itr = getIter();
		while (itr.hasNext()) {
			 Jokalari j = itr.next();
			 j.eguneratuEgoera();
		}
	}
	
	public void setGuztienTxandaFalse() {
		for (Jokalari j: JokalariKatalogoa.getJK().getLista().getLista()) {
			j.setTxanda(false);
		}
	}
	

}
