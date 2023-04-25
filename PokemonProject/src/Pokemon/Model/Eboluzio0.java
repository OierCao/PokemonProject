package Pokemon.Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Eboluzio0 implements Eboluzioa{
	
	private int atk=5;
	private int def=3;
	private String[][] izenak;
	private Pokemon pok;
	
	public Eboluzio0(Pokemon pPok) {
		pok =pPok;
		izenak = new String[21][18];
		//matrizeaSortu(pPok);
		
		
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
		pPok.setIzena(izenak[pPok.getId()][Arrays.asList(Mota.values()).indexOf(pPok.getMota1())]);	
	}
	
	/*private void matrizeaSortu(Pokemon pPok) {
		ArrayList<String> izenGuztiak = izenGuztiak();
		int iMota = Arrays.asList(Mota.values()).indexOf(pPok.getMota1());
		int balioMax;
		if(iMota==2 || iMota==4 || iMota==16 || iMota==11) {
			balioMax=10;
		}
		else if(iMota==0 || iMota==6 || iMota==9 || iMota==15) {
			balioMax=20;
		}
		else if(iMota==17) {
			balioMax=21;
		}
		else {
			balioMax=13;
		}
		
		
		int err=0;
		int zut=0;
		for() {
			
		}
	}*/

	private ArrayList<String> izenGuztiak() {
		ArrayList<String> izenak = new ArrayList<>();
		izenak.add("Caterpie");
		izenak.add("Weedle");
		izenak.add("Wurmple");
		izenak.add("Wurmple");
		izenak.add("Nincada");
		izenak.add("Surskit");
		izenak.add("Sewaddle");
		izenak.add("Cutiefly");
		izenak.add("Venipede");
		izenak.add("Scatterbug");
		izenak.add("Blipbug");
		izenak.add("Yanma");
		izenak.add("Pinsir");
		izenak.add("Scyther");
		izenak.add("Heracross");
		izenak.add("Dwebble");
		izenak.add("Joltik");
		izenak.add("Grubin");
		izenak.add("Nymble");
		izenak.add("Larvesta");
		
		izenak.add("Murkrow");
		izenak.add("Sneasel");
		izenak.add("Houndour");
		izenak.add("Poochyena");
		izenak.add("Zigzagoon");
		izenak.add("Absol");
		izenak.add("Purrloin");
		izenak.add("Scraggy");
		izenak.add("Zorua");
		izenak.add("Pawniard");
		izenak.add("Deino");
		izenak.add("Inkay");
		izenak.add("Impidimp");
		
		izenak.add("Dratini");
		izenak.add("Bagon");
		izenak.add("Gible");
		izenak.add("Axew");
		izenak.add("Druddigon");
		izenak.add("Goomy");
		izenak.add("Jangmo-o");
		izenak.add("Dreepy");
		izenak.add("Tatsugiri");
		izenak.add("Frigibax");
		
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		izenak.add("Caterpie");
		return izenak;
	}

	@Override
	public void eboluzionatu(Pokemon pPok) {
		pPok.setEboluzio(new Eboluzio1(pPok));
		pPok.gehituAtributuak(atk, def);
	}

}
