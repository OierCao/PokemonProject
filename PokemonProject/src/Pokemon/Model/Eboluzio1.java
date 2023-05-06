package Pokemon.Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Eboluzio1 implements Eboluzioa{

	public Eboluzio1(Pokemon pPok) {
		
		pPok.gehituAtributuak(5, 3);
		
		if( (pPok.getMota1().equals(Mota.Bug) && (pPok.getId()==18)) || 
			(pPok.getMota1().equals(Mota.Fight) && (pPok.getId()==7)) ||
			(pPok.getMota1().equals(Mota.Grass) && (pPok.getId()==9))
				) {
			pPok.gehituMota(Mota.Dark);
		}
		else if( (pPok.getMota1().equals(Mota.Ground) && (pPok.getId()==6)) ||
				 (pPok.getMota1().equals(Mota.Poison) && (pPok.getId()==12))
				) {
			pPok.gehituMota(Mota.Dragon);
		}
		else if( (pPok.getMota1().equals(Mota.Bug) && (pPok.getId()==17))
				) {
			pPok.gehituMota(Mota.Electric);
		}
		else if( (pPok.getMota1().equals(Mota.Dragon) && (pPok.getId()==6)) ||
				 (pPok.getMota1().equals(Mota.Electric) && (pPok.getId()==8)) ||
				 (pPok.getMota1().equals(Mota.Fire) && (pPok.getId()==1 || pPok.getId()==6 || pPok.getId()==10)) ||
				 (pPok.getMota1().equals(Mota.Grass) && (pPok.getId()==6))
				) {
			pPok.gehituMota(Mota.Fight);
		}
		else if( (pPok.getMota1().equals(Mota.Rock) && (pPok.getId()==5))
				) {
			pPok.gehituMota(Mota.Fire);
		}
		else if( (pPok.getMota1().equals(Mota.Fairy) && (pPok.getId()==0)) ||
				 (pPok.getMota1().equals(Mota.Water) && (pPok.getId()==15))
				) {
			pPok.gehituMota(Mota.Flying);
		}
		else if( (pPok.getMota1().equals(Mota.Ice) && (pPok.getId()==4)) ||
				 (pPok.getMota1().equals(Mota.Water) && (pPok.getId()==10))
				) {
			pPok.gehituMota(Mota.Ghost);
		}
		else if( (pPok.getMota1().equals(Mota.Water) && (pPok.getId()==1 || pPok.getId()==19))
				) {
			pPok.gehituMota(Mota.Ground);
		}
		else if( (pPok.getMota1().equals(Mota.Fight) && (pPok.getId()==8))
				) {
			pPok.gehituMota(Mota.Ice);
		}
		else if( (pPok.getMota1().equals(Mota.Bug) && (pPok.getId()==10)) ||
				 (pPok.getMota1().equals(Mota.Fire) && (pPok.getId()==18))
				) {
			pPok.gehituMota(Mota.Psychic);
		}
		else if( (pPok.getMota1().equals(Mota.Fight) && (pPok.getId()==4)) ||
				 (pPok.getMota1().equals(Mota.Ghost) && (pPok.getId()==12)) ||
				 (pPok.getMota1().equals(Mota.Ground) && (pPok.getId()==9))
				) {
			pPok.gehituMota(Mota.Steel);
		}
		else if( (pPok.getMota1().equals(Mota.Fight) && (pPok.getId()==12))
				) {
			pPok.gehituMota(Mota.Water);
		}
		
		
		// Mota aldaketa
		else if( (pPok.getMota1().equals(Mota.Poison) && (pPok.getId()==5))
				) {
			pPok.aldatuMota(Mota.Dark);
		}
		else if( (pPok.getMota1().equals(Mota.Flying) && (pPok.getId()==9)) ||
				 (pPok.getMota1().equals(Mota.Poison) && (pPok.getId()==8)) 
				) {
			pPok.aldatuMota(Mota.Dragon);
		}
		else if( (pPok.getMota1().equals(Mota.Flying) && (pPok.getId()==1))
				) {
			pPok.aldatuMota(Mota.Fire);
		}
		else if( (pPok.getMota1().equals(Mota.Bug) && (pPok.getId()==4 || pPok.getId()==5))
				) {
			pPok.aldatuMota(Mota.Flying);
		}
		else if( (pPok.getMota1().equals(Mota.Psychic) && (pPok.getId()==12))
				) {
			pPok.aldatuMota(Mota.Ice);
		}
		else if( (pPok.getMota1().equals(Mota.Bug) && (pPok.getId()==13)) ||
				 (pPok.getMota1().equals(Mota.Rock) && (pPok.getId()==4)) 
				) {
			pPok.aldatuMota(Mota.Steel);
		}

		pPok.setIzena(PokemonIzenak.getPI().getIzenak1()[pPok.getId()][Arrays.asList(Mota.values()).indexOf(pPok.getMota1())]);
		System.out.println(pPok.getIzena());
	}
	
	
	@Override
	public void eboluzionatu(Pokemon pPok) {
		pPok.setEboluzio(new Eboluzio2(pPok));
	}
}
