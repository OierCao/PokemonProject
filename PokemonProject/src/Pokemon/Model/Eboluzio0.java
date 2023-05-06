package Pokemon.Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Eboluzio0 implements Eboluzioa{
	
	
	public Eboluzio0(Pokemon pPok) {
		
		
		if( (pPok.getMota1().equals(Mota.Fire) && (pPok.getId()==16)) ||
			(pPok.getMota1().equals(Mota.Ice) && (pPok.getId()==8)) ||
			(pPok.getMota1().equals(Mota.Poison) && (pPok.getId()==5)) ||
			(pPok.getMota1().equals(Mota.Rock) && (pPok.getId()==8))
		    ) {
			pPok.gehituMota(Mota.Bug);
		}
		else if((pPok.getMota1().equals(Mota.Ground) && (pPok.getId()==1)) ||
				(pPok.getMota1().equals(Mota.Poison) && (pPok.getId()==10)) ||
				(pPok.getMota1().equals(Mota.Water) && (pPok.getId()==18))
				) {
			pPok.gehituMota(Mota.Dark);
		}
		else if( (pPok.getMota1().equals(Mota.Dark) && (pPok.getId()==10)) ||
				 (pPok.getMota1().equals(Mota.Flying) && (pPok.getId()==6)) ||
				 (pPok.getMota1().equals(Mota.Grass) && (pPok.getId()==18)) ||
				 (pPok.getMota1().equals(Mota.Rock) && (pPok.getId()==13)) ||
				 (pPok.getMota1().equals(Mota.Steel) && (pPok.getId()==9))
				) {
			pPok.gehituMota(Mota.Dragon);
		}
		else if( (pPok.getMota1().equals(Mota.Bug) && (pPok.getId()==16))
				) {
			pPok.gehituMota(Mota.Electric);
		}
		else if( (pPok.getMota1().equals(Mota.Bug) && (pPok.getId()==7)) || 
				 (pPok.getMota1().equals(Mota.Dark) && (pPok.getId()==12)) ||
				 (pPok.getMota1().equals(Mota.Ghost) && (pPok.getId()==9)) ||
				 (pPok.getMota1().equals(Mota.Normal) && (pPok.getId()==2)) ||
				 (pPok.getMota1().equals(Mota.Psychic) && (pPok.getId()==0 || pPok.getId()==2 || pPok.getId()==12)) ||
				 (pPok.getMota1().equals(Mota.Steel) && (pPok.getId()==2)) ||
				 (pPok.getMota1().equals(Mota.Water) && (pPok.getId()==20))
				) {
			pPok.gehituMota(Mota.Fairy);
		}
		else if( (pPok.getMota1().equals(Mota.Bug) && (pPok.getId()==14)) ||
				 (pPok.getMota1().equals(Mota.Dark) && (pPok.getId()==7)) ||
				 (pPok.getMota1().equals(Mota.Normal) && (pPok.getId()==11)) ||
				 (pPok.getMota1().equals(Mota.Poison) && (pPok.getId()==6))
				) {
			pPok.gehituMota(Mota.Fight);
		}
		else if( (pPok.getMota1().equals(Mota.Bug) && (pPok.getId()==19)) ||
				 (pPok.getMota1().equals(Mota.Dark) && (pPok.getId()==2)) ||
				 (pPok.getMota1().equals(Mota.Ghost) && (pPok.getId()==6)) ||
				 (pPok.getMota1().equals(Mota.Poison) && (pPok.getId()==9))
				) {
			pPok.gehituMota(Mota.Fire);
		}
		else if( (pPok.getMota1().equals(Mota.Bug) && (pPok.getId()==11 || pPok.getId()==13)) ||
				 (pPok.getMota1().equals(Mota.Dark) && (pPok.getId()==0)) ||
				 (pPok.getMota1().equals(Mota.Electric) && (pPok.getId()==9)) ||
				 (pPok.getMota1().equals(Mota.Fight) && (pPok.getId()==11)) ||
				 (pPok.getMota1().equals(Mota.Ghost) && (pPok.getId()==4)) ||
				 (pPok.getMota1().equals(Mota.Grass) && (pPok.getId()==15)) ||
				 (pPok.getMota1().equals(Mota.Ground) && (pPok.getId()==4)) ||
				 (pPok.getMota1().equals(Mota.Poison) && (pPok.getId()==3)) ||
				 (pPok.getMota1().equals(Mota.Psychic) && (pPok.getId()==4 || pPok.getId()==11)) ||
				 (pPok.getMota1().equals(Mota.Rock) && (pPok.getId()==6 || pPok.getId()==12))
				) {
			pPok.gehituMota(Mota.Flying);
		}
		else if( (pPok.getMota1().equals(Mota.Dragon) && (pPok.getId()==7)) ||
				(pPok.getMota1().equals(Mota.Ground) && (pPok.getId()==10)) ||
				(pPok.getMota1().equals(Mota.Steel) && (pPok.getId()==5))
				) {
			pPok.gehituMota(Mota.Ghost);
		}
		else if( (pPok.getMota1().equals(Mota.Bug) && (pPok.getId()==6)) ||
				(pPok.getMota1().equals(Mota.Ghost) && (pPok.getId()==7 || pPok.getId()==10)) ||
				 (pPok.getMota1().equals(Mota.Rock) && (pPok.getId()==7)) ||
				 (pPok.getMota1().equals(Mota.Water) && (pPok.getId()==17))
				) {
			pPok.gehituMota(Mota.Grass);
		}
		else if( (pPok.getMota1().equals(Mota.Bug) && (pPok.getId()==4)) ||
				 (pPok.getMota1().equals(Mota.Dragon) && (pPok.getId()==2)) ||
				 (pPok.getMota1().equals(Mota.Fire) && (pPok.getId()==7)) ||
				 (pPok.getMota1().equals(Mota.Ghost) && (pPok.getId()==8)) ||
				 (pPok.getMota1().equals(Mota.Ice) && (pPok.getId()==0)) ||
				 (pPok.getMota1().equals(Mota.Rock) && (pPok.getId()==0 || pPok.getId()==1 || pPok.getId()==4))
				) {
			pPok.gehituMota(Mota.Ground);
		}
		else if( (pPok.getMota1().equals(Mota.Dark) && (pPok.getId()==1)) ||
				(pPok.getMota1().equals(Mota.Dragon) && (pPok.getId()==9)) ||
				 (pPok.getMota1().equals(Mota.Grass) && (pPok.getId()==8)) ||
				(pPok.getMota1().equals(Mota.Rock) && (pPok.getId()==14))
				) {
			pPok.gehituMota(Mota.Ice);
		}
		else if( (pPok.getMota1().equals(Mota.Dark) && (pPok.getId()==4)) ||
				 (pPok.getMota1().equals(Mota.Electric) && (pPok.getId()==6)) ||
				 (pPok.getMota1().equals(Mota.Fire) && (pPok.getId()==19)) ||
				 (pPok.getMota1().equals(Mota.Flying) && !(pPok.getId()==2 || pPok.getId()==5 || pPok.getId()==6)) ||
				 (pPok.getMota1().equals(Mota.Grass) && (pPok.getId()==19))
				) {
			pPok.gehituMota(Mota.Normal);
		}
		else if( (pPok.getMota1().equals(Mota.Bug) && (pPok.getId()==1 || pPok.getId()==8)) ||
				 (pPok.getMota1().equals(Mota.Electric) && (pPok.getId()==7)) ||
				 (pPok.getMota1().equals(Mota.Ghost) && (pPok.getId()==0)) ||
				 (pPok.getMota1().equals(Mota.Grass) && (pPok.getId()==0 || pPok.getId()==2 || pPok.getId()==3 || pPok.getId()==7)) ||
				 (pPok.getMota1().equals(Mota.Rock) && (pPok.getId()==18)) ||
				 (pPok.getMota1().equals(Mota.Steel) && (pPok.getId()==7))
				) {
			pPok.gehituMota(Mota.Poison);
		}
		else if( (pPok.getMota1().equals(Mota.Dark) && (pPok.getId()==11)) ||
				 (pPok.getMota1().equals(Mota.Fight) && (pPok.getId()==3)) ||
				 (pPok.getMota1().equals(Mota.Grass) && (pPok.getId()==4)) ||
				 (pPok.getMota1().equals(Mota.Ground) && (pPok.getId()==7)) ||
				 (pPok.getMota1().equals(Mota.Ice) && (pPok.getId()==2)) ||
				 (pPok.getMota1().equals(Mota.Steel) && (pPok.getId()==0 || pPok.getId()==3))
				) {
			pPok.gehituMota(Mota.Psychic);
		}
		else if( (pPok.getMota1().equals(Mota.Bug) && (pPok.getId()==15)) ||
				(pPok.getMota1().equals(Mota.Ground) && (pPok.getId()==0)) ||
				 (pPok.getMota1().equals(Mota.Steel) && (pPok.getId()==1)) ||
				 (pPok.getMota1().equals(Mota.Water) && (pPok.getId()==16))
				) {
			pPok.gehituMota(Mota.Rock);
		}
		else if( (pPok.getMota1().equals(Mota.Dark) && (pPok.getId()==9)) ||
				 (pPok.getMota1().equals(Mota.Electric) && (pPok.getId()==1)) ||
				 (pPok.getMota1().equals(Mota.Fairy) && (pPok.getId()==8)) ||
				 (pPok.getMota1().equals(Mota.Grass) && (pPok.getId()==11)) ||
				 (pPok.getMota1().equals(Mota.Rock) && (pPok.getId()==10))
				) {
			pPok.gehituMota(Mota.Steel);
		}
		else if( (pPok.getMota1().equals(Mota.Bug) && (pPok.getId()==5)) ||
				 (pPok.getMota1().equals(Mota.Dragon) && (pPok.getId()==8)) ||
				 (pPok.getMota1().equals(Mota.Flying) && (pPok.getId()==5)) ||
				 (pPok.getMota1().equals(Mota.Ice) && (pPok.getId()==5)) ||
				 (pPok.getMota1().equals(Mota.Poison) && (pPok.getId()==8 || pPok.getId()==11)) ||
				 (pPok.getMota1().equals(Mota.Rock) && (pPok.getId()==2 || pPok.getId()==3 || pPok.getId()==19))
				) {
			pPok.gehituMota(Mota.Water);
		}
		pPok.setIzena(PokemonIzenak.getPI().getIzenak0()[pPok.getId()][Arrays.asList(Mota.values()).indexOf(pPok.getMota1())]);
		System.out.println(pPok.getIzena());
	}
	
	@Override
	public void eboluzionatu(Pokemon pPok) {
		pPok.setEboluzio(new Eboluzio1(pPok));
	}

}
