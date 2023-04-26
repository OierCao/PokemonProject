package Pokemon.Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Eboluzio2 implements Eboluzioa{

	public Eboluzio2(Pokemon pPok) {
		
		if( (pPok.getMota1().equals(Mota.Fire) && (pPok.getId()==14)) || 
			(pPok.getMota1().equals(Mota.Grass) && (pPok.getId()==17)) || 
			(pPok.getMota1().equals(Mota.Water) && (pPok.getId()==5))
				) {
			pPok.gehituMota(Mota.Dark);
		}
		else if( (pPok.getMota1().equals(Mota.Water) && (pPok.getId()==14))
				) {
			pPok.gehituMota(Mota.Dragon);
		}
		else if( (pPok.getMota1().equals(Mota.Psychic) && (pPok.getId()==9))||
				 (pPok.getMota1().equals(Mota.Water) && (pPok.getId()==6))
				) {
			pPok.gehituMota(Mota.Fairy);
		}
		else if( (pPok.getMota1().equals(Mota.Grass) && (pPok.getId()==14)) ||
				 (pPok.getMota1().equals(Mota.Normal) && (pPok.getId()==12)) ||
				 (pPok.getMota1().equals(Mota.Water) && (pPok.getId()==8 || pPok.getId()==13))
				) {
			pPok.gehituMota(Mota.Fight);
		}
		else if( (pPok.getMota1().equals(Mota.Bug) && (pPok.getId()==0 || pPok.getId()==2 || pPok.getId()==9 || pPok.getId()==12)) ||
				 (pPok.getMota1().equals(Mota.Dragon) && (pPok.getId()==0 || pPok.getId()==1)) ||
				 (pPok.getMota1().equals(Mota.Fire) && (pPok.getId()==0))
				) {
			pPok.gehituMota(Mota.Flying);
		}
		else if( (pPok.getMota1().equals(Mota.Fight) && (pPok.getId()==0)) ||
				 (pPok.getMota1().equals(Mota.Fire) && (pPok.getId()==17))
				) {
			pPok.gehituMota(Mota.Ghost);
		}
		else if( (pPok.getMota1().equals(Mota.Grass) && (pPok.getId()==10)) ||
				 (pPok.getMota1().equals(Mota.Normal) && (pPok.getId()==4)) ||
				 (pPok.getMota1().equals(Mota.Poison) && (pPok.getId()==0 || pPok.getId()==1))
				) {
			pPok.gehituMota(Mota.Ground);
		}
		else if( (pPok.getMota1().equals(Mota.Bug) && (pPok.getId()==3))
				) {
			pPok.gehituMota(Mota.Poison);
		}
		else if( (pPok.getMota1().equals(Mota.Fire) && (pPok.getId()==12 || pPok.getId()==13))
				) {
			pPok.gehituMota(Mota.Psychic);
		}
		else if( (pPok.getMota1().equals(Mota.Ice) && (pPok.getId()==7))
				) {
			pPok.gehituMota(Mota.Rock);
		}
		else if( (pPok.getMota1().equals(Mota.Flying) && (pPok.getId()==2)) ||
				 (pPok.getMota1().equals(Mota.Water) && (pPok.getId()==3))
				) {
			pPok.gehituMota(Mota.Steel);
		}
		
		
		
		// Mota aldaketa
		else if( (pPok.getMota1().equals(Mota.Rock) && (pPok.getId()==1)) ||
				 (pPok.getMota1().equals(Mota.Water) && (pPok.getId()==15))
				) {
			pPok.aldatuMota(Mota.Dark);
		}

		else if( (pPok.getMota1().equals(Mota.Grass) && (pPok.getId()==4))
				) {
			pPok.aldatuMota(Mota.Dragon);
		}
		else if( (pPok.getMota1().equals(Mota.Fight) && (pPok.getId()==12))
				) {
			pPok.aldatuMota(Mota.Fire);
		}
		else if( (pPok.getMota1().equals(Mota.Psychic) && (pPok.getId()==2))
				) {
			pPok.aldatuMota(Mota.Fight);
		}
		else if( (pPok.getMota1().equals(Mota.Bug) && (pPok.getId()==4)) ||
				 (pPok.getMota1().equals(Mota.Fire) && (pPok.getId()==18)) ||
				 (pPok.getMota1().equals(Mota.Grass) && (pPok.getId()==15)) 
				) {
			pPok.aldatuMota(Mota.Ghost);
		}
		
		pPok.setIzena(PokemonIzenak.getPI().getIzenak2()[pPok.getId()][Arrays.asList(Mota.values()).indexOf(pPok.getMota1())]);
		System.out.println(PokemonIzenak.getPI().getIzenak2()[pPok.getId()][Arrays.asList(Mota.values()).indexOf(pPok.getMota1())]);
		System.out.println(pPok.getIzena());
	}
	
	@Override
	public void eboluzionatu(Pokemon pPok) {	}

}
