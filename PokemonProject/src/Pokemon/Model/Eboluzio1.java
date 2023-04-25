package Pokemon.Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Eboluzio1 implements Eboluzioa{

	private int atk=7;
	private int def=5;
	private String[][] izenak;
	
	public Eboluzio1(Pokemon pPok) {
		izenak = new String[21][18];
		matrizeaSortu(pPok);
		
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

		pPok.setIzena(izenak[pPok.getId()][Arrays.asList(Mota.values()).indexOf(pPok.getMota1())]);	
	}
	
	
	private void matrizeaSortu(Pokemon pPok) {
		ArrayList<String> izenGuztiak = izenGuztiak();
		int balioMax;	
		int err=0;
		int zut=0;
		int pos=0;
		while(zut<Mota.values().length) {
			if(zut==2 || zut==4 || zut==16 || zut==11) {
				balioMax=10;
			}
			else if(zut==0 || zut==6 || zut==9 || zut==15) {
				balioMax=20;
			}
			else if(zut==17) {
				balioMax=21;
			}
			else {
				balioMax=13;
			}
			while(err<balioMax) {
				System.out.println(err + " " + zut + "" + izenGuztiak.get(pos));
				izenak[err][zut] = izenGuztiak.get(pos);
				err++;
				pos++;
			}
			err=0;
			zut++;
		}
	}

	private ArrayList<String> izenGuztiak() {
		ArrayList<String> izenak = new ArrayList<>();
		izenak.add("Metapod");
		izenak.add("Kakuna");
		izenak.add("Silcoon");
		izenak.add("Cascoon");
		izenak.add("Ninjask");
		izenak.add("Masquerain");
		izenak.add("Swadloon");
		izenak.add("Ribombee");
		izenak.add("Whirlipede");
		izenak.add("Spewpa");
		izenak.add("Dottler");
		izenak.add("Yanmega");
		izenak.add("Pinsir");
		izenak.add("Scizor");
		izenak.add("Heracross");
		izenak.add("Crustle");
		izenak.add("Galvantula");
		izenak.add("Charjabug");
		izenak.add("Lokix");
		izenak.add("Volcarona");
		
		izenak.add("Honchkrow");
		izenak.add("Wavile");
		izenak.add("Houndoom");
		izenak.add("Mightyena");
		izenak.add("Linoone");
		izenak.add("Absol");
		izenak.add("Liepard");
		izenak.add("Scrafty");
		izenak.add("Zoroark");
		izenak.add("Bishrap");
		izenak.add("Zweilous");
		izenak.add("Malamar");
		izenak.add("Morgrem");
		
		izenak.add("Dragonair");
		izenak.add("Shelgon");
		izenak.add("Gabite");
		izenak.add("Fraxure");
		izenak.add("Druddigon");
		izenak.add("Sliggoo");
		izenak.add("Hakamo-o");
		izenak.add("Drakloak");
		izenak.add("Tatsugiri");
		izenak.add("Arctibax");
		
		izenak.add("Pikachu");
		izenak.add("Magneton");
		izenak.add("Elektabuzz");
		izenak.add("Manectric");
		izenak.add("Flaaffy");
		izenak.add("Luxio");
		izenak.add("Heliolisk");
		izenak.add("Toxtricity");
		izenak.add("Pawmo");
		izenak.add("Kilowattrel");
		izenak.add("Eelektrik");
		izenak.add("Bellibolt");
		izenak.add("Boltund");
		
		izenak.add("Togetic");
		izenak.add("Clefairy");
		izenak.add("Granbull");
		izenak.add("Floette");
		izenak.add("Aromatisse");
		izenak.add("Slurpuff");
		izenak.add("Alcremie");
		izenak.add("Dachsbun");
		izenak.add("Tinkatuff");
		izenak.add("Comfey");
		
		izenak.add("Primeape");
		izenak.add("Machoke");
		izenak.add("Hariyama");
		izenak.add("Medicham");
		izenak.add("Lucario");
		izenak.add("Gurdurr");
		izenak.add("Mienshao");
		izenak.add("Pangoro");
		izenak.add("Crabominable");
		izenak.add("Grapploct");
		izenak.add("Farfetch'd");
		izenak.add("Hawlucha");
		izenak.add("Tauros");
		
		izenak.add("Charmeleon");
		izenak.add("Monferno");
		izenak.add("Ninetales");
		izenak.add("Arcanine");
		izenak.add("Quilava");
		izenak.add("Magmar");
		izenak.add("Combusken");
		izenak.add("Camerupt");
		izenak.add("Magcargo");
		izenak.add("Rapidash");
		izenak.add("Pignite");
		izenak.add("Simisear");
		izenak.add("Darmanitan");
		izenak.add("Braixen");
		izenak.add("Torracat");
		izenak.add("Raboot");
		izenak.add("Centiskorch");
		izenak.add("Crocalor");
		izenak.add("Armarouge");
		izenak.add("Pyroar");
		
		izenak.add("Pidgeotto");
		izenak.add("Fletchinder");
		izenak.add("Corvisquire");
		izenak.add("Braviary");
		izenak.add("Trumbeak");
		izenak.add("Cramorant");
		izenak.add("Noivern");
		izenak.add("Swellow");
		izenak.add("Staravia");
		izenak.add("Altaria");
		izenak.add("Tranquil");
		izenak.add("Tranquil");
		izenak.add("Noctowl");
		
		izenak.add("Haunter");
		izenak.add("Dusclops");
		izenak.add("Mismagius");
		izenak.add("Banette");
		izenak.add("Drifblim");
		izenak.add("Cofagrigus");
		izenak.add("Lampent");
		izenak.add("Trevenant");
		izenak.add("Palossand");
		izenak.add("Mimikyu");
		izenak.add("Gourgeist");
		izenak.add("Cursola");
		izenak.add("Gholdengo");
		
		izenak.add("Ivysaur");
		izenak.add("Grovyle");
		izenak.add("Gloom");
		izenak.add("Weepinbell");
		izenak.add("Exeggutor");
		izenak.add("Bayleef");
		izenak.add("Breloom");
		izenak.add("Roselia");
		izenak.add("Abomasnow");
		izenak.add("Nuzleaf");
		izenak.add("Grotle");
		izenak.add("Ferrothorn");
		izenak.add("Servine");
		izenak.add("Steenee");
		izenak.add("Quilladin");
		izenak.add("Dartrix");
		izenak.add("Thwackey");
		izenak.add("Floragato");
		izenak.add("Flapple");
		izenak.add("Dolliv");
		
		izenak.add("Rhydon");
		izenak.add("Krokorok");
		izenak.add("Sandslash");
		izenak.add("Dugtrio");
		izenak.add("Gliscor");
		izenak.add("Donphan");
		izenak.add("Vibrava");
		izenak.add("Calydol");
		izenak.add("Hippowdon");
		izenak.add("Excadrill");
		izenak.add("Golurk");
		izenak.add("Sandaconda");
		izenak.add("Marowak");
		
		izenak.add("Piloswine");
		izenak.add("Vanillish");
		izenak.add("Jynx");
		izenak.add("Glalie");
		izenak.add("Froslass");
		izenak.add("Sealeo");
		izenak.add("Beartic");
		izenak.add("Avalugg");
		izenak.add("Frosmoth");
		izenak.add("Eiscue");
		
		izenak.add("Loudred");
		izenak.add("Chansey");
		izenak.add("Jigglypuff");
		izenak.add("Persian");
		izenak.add("Ursaring");
		izenak.add("Dudunsparce");
		izenak.add("Wyrdeer");
		izenak.add("Porygon2");
		izenak.add("Vigoroth");
		izenak.add("Herdier");
		izenak.add("Snorlax");
		izenak.add("Bewear");
		izenak.add("Lopunny");
		
		izenak.add("Nidorino");
		izenak.add("Nidorina");
		izenak.add("Arbok");
		izenak.add("Golabat");
		izenak.add("Muk");
		izenak.add("Drapion");
		izenak.add("Toxicroak");
		izenak.add("Garbodor");
		izenak.add("Dragalge");
		izenak.add("Salazzle");
		izenak.add("Skuntank");
		izenak.add("Toxapex");
		izenak.add("Naganadel");
		
		izenak.add("Kirlia");
		izenak.add("Kadabra");
		izenak.add("Kirlia");
		izenak.add("Wobbuffet");
		izenak.add("Swoobat");
		izenak.add("Gothorita");
		izenak.add("Duosion");
		izenak.add("Beheeyem");
		izenak.add("Meowstic");
		izenak.add("Hattrem");
		izenak.add("Hypno");
		izenak.add("Xatu");
		izenak.add("Mr. Mime");
		
		izenak.add("Graveler");
		izenak.add("Pupitar");
		izenak.add("Omastar");
		izenak.add("Kabutops");
		izenak.add("Steelix");
		izenak.add("Carkol");
		izenak.add("Aerodactyl");
		izenak.add("Cradily");
		izenak.add("Armaldo");
		izenak.add("Rampardos");
		izenak.add("Bastiodon");
		izenak.add("Sudowoodo");
		izenak.add("Archeops");
		izenak.add("Tyrantrum");
		izenak.add("Aurorus");
		izenak.add("Boldore");
		izenak.add("Lycanroc");
		izenak.add("Naclstack");
		izenak.add("Glimmora");
		izenak.add("Barbaracle");
		
		izenak.add("Metang");
		izenak.add("Lairon");
		izenak.add("Mawile");
		izenak.add("Bronzong");
		izenak.add("Klang");
		izenak.add("Doublade");
		izenak.add("Melmetal");
		izenak.add("Revavroom");
		izenak.add("Copperajah");
		izenak.add("Duraludon");
		
		izenak.add("Wartortle");
		izenak.add("Marshtomp");
		izenak.add("Croconaw");
		izenak.add("Prinplup");
		izenak.add("Dewott");
		izenak.add("Frogadier");
		izenak.add("Brionne");
		izenak.add("Drizzile");
		izenak.add("Quaxwell");
		izenak.add("Milotic");
		izenak.add("Basculegion");
		izenak.add("Clawitzer");
		izenak.add("Golduck");
		izenak.add("Poliwhirl");
		izenak.add("Seadra");
		izenak.add("Gyarados");
		izenak.add("Carracosta");
		izenak.add("Lombre");
		izenak.add("Sharpedo");
		izenak.add("Palpitoad");
		izenak.add("Marill");
		return izenak;
	}
	
	@Override
	public void eboluzionatu(Pokemon pPok) {
		pPok.setEboluzio(new Eboluzio2(pPok));
		pPok.gehituAtributuak(atk, def);
	}
}
