package Pokemon.Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class JokalariZerrenda {
	private ArrayList<Jokalari> lista;
	
	
	//Eraikitzaile
	public JokalariZerrenda() {
		lista = new ArrayList<Jokalari>();
	}
	
	
	//Jokalariak gehitu eta kendu
	public void addJokalari(Jokalari pJokalaria) {
		this.lista.add(pJokalaria);
	}
	public void removeJokalari(Jokalari pJokalaria) {
		this.lista.remove(pJokalaria);
	}
	
	//Jokalariak sortu
	public Jokalari newJokalari(int pMota,int pJokNum,int pPokKop) {
		Jokalari newJokalari = JokalariFactory.getJF().createJokalari(pMota,pJokNum,pPokKop);
		return newJokalari;
	}
	
	
	public ArrayList<Jokalari> getLista(){
		return lista;
	}


	public void removeAll() {
		this.lista.clear();
	}


	//Setter eta getter
	private Iterator<Jokalari> getIter() {
		return lista.iterator();
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
	
	public void setGuztienTxandaFalse() {
		for (Jokalari j: JokalariKatalogoa.getJK().getLista().getLista()) {
			j.setTxanda(false);
		}
	}

	//Beste metodoak
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

	public void txandaJolastu() {
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
	}
	
	//Pantalla
	public void jokalariakEguneratu() {
		Iterator<Jokalari> itr = getIter();
		while (itr.hasNext()) {
			 Jokalari j = itr.next();
			 j.eguneratuEgoera();
		}
	}
	

}
