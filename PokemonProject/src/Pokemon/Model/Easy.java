package Pokemon.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Easy extends AIPortaera{

	@Override
	public ArrayList<Object> mugimenduaPentsatu(Pokemon pPok,Jokalari pJok) {
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


	
}
