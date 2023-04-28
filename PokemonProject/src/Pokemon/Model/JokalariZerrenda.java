package Pokemon.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

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
	public Jokalari newJokalari(int pMota, int pSubMota, int pJokNum,int pPokKop) {
		Jokalari newJokalari = JokalariFactory.getJF().createJokalari(pMota,pSubMota,pJokNum,pPokKop);
		return newJokalari;
	}
	
	
	public ArrayList<Jokalari> getLista(){
		return lista;
	}


	public void removeAll() {
		this.lista.clear();
	}


	//Setter eta getter
	private ArrayList<Jokalari> getBizirikDaudenak() {
		return (ArrayList<Jokalari>)this.lista.stream().filter(j->j.getBizirik()).collect(Collectors.toList());
	}
	
	
	public Jokalari getRandomBizirik() {
		ArrayList<Jokalari> bizirik = getBizirikDaudenak();
		Jokalari j;
		int rand;
		Random r = new Random();
		rand = r.nextInt(bizirik.size());
		j = bizirik.get(rand);
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
	
	public int getPos(Jokalari pJok) {return lista.indexOf(pJok);}
	public Jokalari getJoklariaPos(int i) {
		return lista.get(i);
	}	
	
	public void setGuztienTxandaFalse() {
		lista.stream().forEach(j->j.setTxanda(false));
	}

	//Beste metodoak
	public Jokalari irabazlea() {
		Jokalari jIrabazle = null;
		List<Jokalari> jokLista = lista.stream().filter(j->j.getBizirik()).collect(Collectors.toList());

		if (jokLista.size()==1) {
			jIrabazle = jokLista.get(0);
		}
		return  jIrabazle;
	}
	
	//Pantalla
	public void jokalariakEguneratu() {
		lista.stream().forEach(j->j.eguneratuEgoera());
	}
	

}
