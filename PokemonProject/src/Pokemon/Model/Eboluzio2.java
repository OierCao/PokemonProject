package Pokemon.Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Eboluzio2 implements Eboluzioa{

	private String[][] izenak;

	public Eboluzio2(Pokemon pPok) {
		izenak = new String[21][18];
		matrizeaSortu(pPok);
		
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
		izenak.add("Butterfree");
		izenak.add("Beedrill");
		izenak.add("Beautifly");
		izenak.add("Dustox");
		izenak.add("Shedinja");
		izenak.add("Masquerain");
		izenak.add("Leavanny");
		izenak.add("Ribombee");
		izenak.add("Scolipede");
		izenak.add("Vivillon");
		izenak.add("Orbeetle");
		izenak.add("Yanmega");
		izenak.add("Mega-Pinsir");
		izenak.add("Mega-Scizor");
		izenak.add("Mega-Heracross");
		izenak.add("Crustle");
		izenak.add("Galvantula");
		izenak.add("Vikabolt");
		izenak.add("Lokix");
		izenak.add("Volcarona");
		
		izenak.add("Honchkrow");
		izenak.add("Wavile");
		izenak.add("Mega-Houndoom");
		izenak.add("Mightyena");
		izenak.add("Obstagoon");
		izenak.add("Mega-Absol");
		izenak.add("Liepard");
		izenak.add("Scrafty");
		izenak.add("Zoroark");
		izenak.add("Kingambit");
		izenak.add("Hydrigon");
		izenak.add("Malamar");
		izenak.add("Grimmsnarl");
		
		izenak.add("Dragonite");
		izenak.add("Salamence");
		izenak.add("Garchomp");
		izenak.add("Haxorus");
		izenak.add("Druddigon");
		izenak.add("Goodra");
		izenak.add("Kommo-o");
		izenak.add("Dragapult");
		izenak.add("Tatsugiri");
		izenak.add("Baxcalibur");
		
		izenak.add("Raichu");
		izenak.add("Magnezone");
		izenak.add("Electivire");
		izenak.add("Mega-Manectric");
		izenak.add("Ampharos");
		izenak.add("Luxray");
		izenak.add("Heliolisk");
		izenak.add("Toxtricity");
		izenak.add("Pawmot");
		izenak.add("Kilowattrel");
		izenak.add("Eelektross");
		izenak.add("Bellibolt");
		izenak.add("Boltund");
		
		izenak.add("Togekiss");
		izenak.add("Clefable");
		izenak.add("Granbull");
		izenak.add("Florges");
		izenak.add("Aromatisse");
		izenak.add("Slurpuff");
		izenak.add("Alcremie");
		izenak.add("Dachsbun");
		izenak.add("Tinkaton");
		izenak.add("Comfey");
		
		izenak.add("Annihilape");
		izenak.add("Machamp");
		izenak.add("Hariyama");
		izenak.add("Mega-Medicham");
		izenak.add("Mega-Lucario");
		izenak.add("Conkeldurr");
		izenak.add("Mienshao");
		izenak.add("Pangoro");
		izenak.add("Crabominable");
		izenak.add("Grapploct");
		izenak.add("Sirfetch’d");
		izenak.add("Hawlucha");
		izenak.add("Tauros");
		
		izenak.add("Charizard");
		izenak.add("Infernape");
		izenak.add("Ninetales");
		izenak.add("Arcanine");
		izenak.add("Typhlosion");
		izenak.add("Magmortar");
		izenak.add("Blaziken");
		izenak.add("Mega-Camerupt");
		izenak.add("Magcargo");
		izenak.add("Rapidash");
		izenak.add("Emboar");
		izenak.add("Simisear");
		izenak.add("Darmanitan(Zen)");
		izenak.add("Delphox");
		izenak.add("Incineroar");
		izenak.add("Cinderace");
		izenak.add("Centiskorch");
		izenak.add("Skeledirge");
		izenak.add("Ceruledge");
		izenak.add("Pyroar");
		
		izenak.add("Pidgeot");
		izenak.add("Talonflame");
		izenak.add("Corviknight");
		izenak.add("Braviary");
		izenak.add("Toucannon");
		izenak.add("Cramorant");
		izenak.add("Noivern");
		izenak.add("Swellow");
		izenak.add("Staraptor");
		izenak.add("Mega-Altaria");
		izenak.add("Unfezant(Male)");
		izenak.add("Unfezant(Female)");
		izenak.add("Noctowl");
		
		izenak.add("Gengar");
		izenak.add("Dusknoir");
		izenak.add("Mismagius");
		izenak.add("Mega-Banette");
		izenak.add("Drifblim");
		izenak.add("Cofagrigus");
		izenak.add("Chandelure");
		izenak.add("Trevenant");
		izenak.add("Palossand");
		izenak.add("Mimikyu");
		izenak.add("Gourgeist");
		izenak.add("Cursola");
		izenak.add("Gholdengo");
		
		izenak.add("Venusaur");
		izenak.add("Sceptile");
		izenak.add("Vileplume");
		izenak.add("Victreebel");
		izenak.add("Exeggutor");
		izenak.add("Meganium");
		izenak.add("Breloom");
		izenak.add("Roserade");
		izenak.add("Mega-Abomasnow");
		izenak.add("Shiftry");
		izenak.add("Torterra");
		izenak.add("Ferrothorn");
		izenak.add("Serperior");
		izenak.add("Tsareena");
		izenak.add("Chesnaught");
		izenak.add("Decidueye");
		izenak.add("Rillaboom");
		izenak.add("Meowscarada");
		izenak.add("Appletun");
		izenak.add("Arboliva");
		
		izenak.add("Rhyperior");
		izenak.add("Krookodile");
		izenak.add("Sandslash");
		izenak.add("Dugtrio");
		izenak.add("Gliscor");
		izenak.add("Donphan");
		izenak.add("Flygon");
		izenak.add("Calydol");
		izenak.add("Hippowdon");
		izenak.add("Excadrill");
		izenak.add("Golurk");
		izenak.add("Sandaconda");
		izenak.add("Marowak");
		
		izenak.add("Mamoswine");
		izenak.add("Vanilluxe");
		izenak.add("Jynx");
		izenak.add("Mega-Glalie");
		izenak.add("Froslass");
		izenak.add("Walrein");
		izenak.add("Beartic");
		izenak.add("Avalugg");
		izenak.add("Frosmoth");
		izenak.add("Eiscue");
		
		izenak.add("Exploud");
		izenak.add("Blissey");
		izenak.add("Wigglytuff");
		izenak.add("Meowth");
		izenak.add("Ursaluna");
		izenak.add("Dudunsparce");
		izenak.add("Wyrdeer");
		izenak.add("Porygon-Z");
		izenak.add("Slaking");
		izenak.add("Stoutland");
		izenak.add("Snorlax");
		izenak.add("Bewear");
		izenak.add("Mega-Lopunny");
		
		izenak.add("Nidoking");
		izenak.add("Nidoqueen");
		izenak.add("Arbok");
		izenak.add("Crobat");
		izenak.add("Muk");
		izenak.add("Drapion");
		izenak.add("Toxicroak");
		izenak.add("Garbodor");
		izenak.add("Dragalge");
		izenak.add("Salazzle");
		izenak.add("Skuntank");
		izenak.add("Toxapex");
		izenak.add("Naganadel");
		
		izenak.add("Gardevoir");
		izenak.add("Alakazam");
		izenak.add("Gallade");
		izenak.add("Wobbuffet");
		izenak.add("Swoobat");
		izenak.add("Gothitelle");
		izenak.add("Reuniclus");
		izenak.add("Beheeyem");
		izenak.add("Meowstic");
		izenak.add("Hatterene");
		izenak.add("Hypno");
		izenak.add("Xatu");
		izenak.add("Mr. Rime");
		
		izenak.add("Golem");
		izenak.add("Tyranitar");
		izenak.add("Omastar");
		izenak.add("Kabutops");
		izenak.add("Mega-Steelix");
		izenak.add("Coalossal");
		izenak.add("Mega-Aerodactyl");
		izenak.add("Cradily");
		izenak.add("Armaldo");
		izenak.add("Rampardos");
		izenak.add("Bastiodon");
		izenak.add("Sudowoodo");
		izenak.add("Archeops");
		izenak.add("Tyrantrum");
		izenak.add("Aurorus");
		izenak.add("Gigalith");
		izenak.add("Lycanroc");
		izenak.add("Garganacl");
		izenak.add("Glimmora");
		izenak.add("Barbaracle");
		
		izenak.add("Metagross");
		izenak.add("Aggron");
		izenak.add("Mega-Mawile");
		izenak.add("Bronzong");
		izenak.add("Klinklang");
		izenak.add("Aegislash");
		izenak.add("Melmetal");
		izenak.add("Revavroom");
		izenak.add("Copperajah");
		izenak.add("Duraludon");
		
		izenak.add("Blastoise");
		izenak.add("Swampert");
		izenak.add("Feraligatr");
		izenak.add("Empoleon");
		izenak.add("Samurott");
		izenak.add("Greninja(Ash)");
		izenak.add("Primarina");
		izenak.add("Inteleon");
		izenak.add("Quaquaval");
		izenak.add("Milotic");
		izenak.add("Basculegion");
		izenak.add("Clawitzer");
		izenak.add("Golduck");
		izenak.add("Poliwrath");
		izenak.add("Kingdra");
		izenak.add("Mega-Gyarados");
		izenak.add("Carracosta");
		izenak.add("Ludicolo");
		izenak.add("Mega-Sharpedo");
		izenak.add("Seismitoad");
		izenak.add("Azumarill");
		return izenak;
	}
	
	@Override
	public void eboluzionatu(Pokemon pPok) {	}

}
