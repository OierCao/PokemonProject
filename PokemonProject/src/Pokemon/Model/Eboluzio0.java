package Pokemon.Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Eboluzio0 implements Eboluzioa{
	
	private int atk=5;
	private int def=3;
	private String[][] izenak;
	
	public Eboluzio0(Pokemon pPok) {
		izenak = new String[21][18];
		matrizeaSortu(pPok);
		
		
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
		
		izenak.add("Pichu");
		izenak.add("Magnemite");
		izenak.add("Elekid");
		izenak.add("Electrike");
		izenak.add("Mareep");
		izenak.add("Shinx");
		izenak.add("Helioptile");
		izenak.add("Toxel");
		izenak.add("Pawmi");
		izenak.add("Wattrel");
		izenak.add("Tynamo");
		izenak.add("Tadbulb");
		izenak.add("Yamper");
		
		izenak.add("Togepi");
		izenak.add("Cleffa");
		izenak.add("Snubbull");
		izenak.add("Flabébé");
		izenak.add("Spritzee");
		izenak.add("Swirlix");
		izenak.add("Milcery");
		izenak.add("Fidough");
		izenak.add("Tinkatink");
		izenak.add("Comfey");
		
		izenak.add("Mankey");
		izenak.add("Machop");
		izenak.add("Makuhita");
		izenak.add("Meditite");
		izenak.add("Riolu");
		izenak.add("Timburr");
		izenak.add("Mienfoo");
		izenak.add("Pancham");
		izenak.add("Crabrawler");
		izenak.add("Clobbopus");
		izenak.add("Farfetch'd");
		izenak.add("Hawlucha");
		izenak.add("Tauros");
		
		izenak.add("Charmander");
		izenak.add("Chimchar");
		izenak.add("Vulpix");
		izenak.add("Growlithe");
		izenak.add("Cyndaquil");
		izenak.add("Magby");
		izenak.add("Torchic");
		izenak.add("Numel");
		izenak.add("Slugma");
		izenak.add("Ponyta");
		izenak.add("Tepig");
		izenak.add("Pansear");
		izenak.add("Darumaka");
		izenak.add("Fennekin");
		izenak.add("Litten");
		izenak.add("Scorbunny");
		izenak.add("Sizzlipede");
		izenak.add("Fuecoco");
		izenak.add("Charcadet");
		izenak.add("Litleo");
		
		izenak.add("Pidgey");
		izenak.add("Fletchling");
		izenak.add("Rookidee");
		izenak.add("Rufflet");
		izenak.add("Pikipek");
		izenak.add("Cramorant");
		izenak.add("Noibat");
		izenak.add("Taillow");
		izenak.add("Starly");
		izenak.add("Swablu");
		izenak.add("Pidove");
		izenak.add("Pidove");
		izenak.add("Hoothoot");
		
		izenak.add("Gastly");
		izenak.add("Duskull");
		izenak.add("Misdreavus");
		izenak.add("Shuppet");
		izenak.add("Drifloon");
		izenak.add("Yamask");
		izenak.add("Litwick");
		izenak.add("Phantump");
		izenak.add("Sandygast");
		izenak.add("Mimikyu");
		izenak.add("Pumpkaboo");
		izenak.add("Corsola");
		izenak.add("Gimmighoul");
		
		izenak.add("Bulbasaur");
		izenak.add("Treecko");
		izenak.add("Oddish");
		izenak.add("Bellsprout");
		izenak.add("Exeggcute");
		izenak.add("Chikorita");
		izenak.add("Shroomish");
		izenak.add("Budew");
		izenak.add("Snover");
		izenak.add("Seedot");
		izenak.add("Turtwig");
		izenak.add("Ferroseed");
		izenak.add("Snivy");
		izenak.add("Bounsweet");
		izenak.add("Chespin");
		izenak.add("Rowlet");
		izenak.add("Grookey");
		izenak.add("Sprigatito");
		izenak.add("Applin");
		izenak.add("Smoliv");
		
		izenak.add("Rhyhorn");
		izenak.add("Sandile");
		izenak.add("Sandshrew");
		izenak.add("Diglett");
		izenak.add("Gligar");
		izenak.add("Phanpy");
		izenak.add("Trapinch");
		izenak.add("Baltoy");
		izenak.add("Hippopotas");
		izenak.add("Drillbur");
		izenak.add("Golett");
		izenak.add("Silicobra");
		izenak.add("Cubone");
		
		izenak.add("Swinub");
		izenak.add("Vanillite");
		izenak.add("Smoochum");
		izenak.add("Snorunt");
		izenak.add("Snorunt");
		izenak.add("Spheal");
		izenak.add("Cubchoo");
		izenak.add("Bergmite");
		izenak.add("Snom");
		izenak.add("Eiscue");
		
		izenak.add("Whismur");
		izenak.add("Happiny");
		izenak.add("Igglybuff");
		izenak.add("Meowth");
		izenak.add("Teddiursa");
		izenak.add("Dunsparce");
		izenak.add("Stantler");
		izenak.add("Porygon");
		izenak.add("Slakoth");
		izenak.add("Lillipup");
		izenak.add("Munchlax");
		izenak.add("Stufful");
		izenak.add("Buneary");
		
		izenak.add("Nidoran(Male)");
		izenak.add("Nidoran(Female)");
		izenak.add("Ekans");
		izenak.add("Zubat");
		izenak.add("Grimer");
		izenak.add("Skorupi");
		izenak.add("Croagunk");
		izenak.add("Trubbish");
		izenak.add("Skrelp");
		izenak.add("Salandit");
		izenak.add("Stunky");
		izenak.add("Mareanie");
		izenak.add("Poipole");
		
		izenak.add("Ralts");
		izenak.add("Abra");
		izenak.add("Ralts");
		izenak.add("Wynaut");
		izenak.add("Woobat");
		izenak.add("Gothita");
		izenak.add("Solosis");
		izenak.add("Elgyem");
		izenak.add("Espurr");
		izenak.add("Hatenna");
		izenak.add("Drowzee");
		izenak.add("Natu");
		izenak.add("Mime Jr.");
		
		izenak.add("Geodude");
		izenak.add("Larvitar");
		izenak.add("Omanyte");
		izenak.add("Kabuto");
		izenak.add("Onix");
		izenak.add("Rolycoly");
		izenak.add("Aerodactyl");
		izenak.add("Lileep");
		izenak.add("Anorith");
		izenak.add("Cranidos");
		izenak.add("Shieldon");
		izenak.add("Bonsly");
		izenak.add("Archen");
		izenak.add("Tyrunt");
		izenak.add("Amaura");
		izenak.add("Roggenrola");
		izenak.add("Rockruff");
		izenak.add("Nacli");
		izenak.add("Glimmet");
		izenak.add("Binacle");
		
		izenak.add("Beldum");
		izenak.add("Aron");
		izenak.add("Mawile");
		izenak.add("Bronzor");
		izenak.add("Klink");
		izenak.add("Honedge");
		izenak.add("Meltan");
		izenak.add("Varoom");
		izenak.add("Cuffant");
		izenak.add("Duraludon");
		
		izenak.add("Squirtle");
		izenak.add("Mudkip");
		izenak.add("Totodile");
		izenak.add("Piplup");
		izenak.add("Oshawott");
		izenak.add("Froakie");
		izenak.add("Popplio");
		izenak.add("Sobble");
		izenak.add("Quaxly");
		izenak.add("Feebas");
		izenak.add("Basculin");
		izenak.add("Clauncher");
		izenak.add("Psyduck");
		izenak.add("Poliwag");
		izenak.add("Horsea");
		izenak.add("Magikarp");
		izenak.add("Tirtouga");
		izenak.add("Lotad");
		izenak.add("Carvanha");
		izenak.add("Tympole");
		izenak.add("Azurill");
		return izenak;
	}

	@Override
	public void eboluzionatu(Pokemon pPok) {
		pPok.setEboluzio(new Eboluzio1(pPok));
		pPok.gehituAtributuak(atk, def);
	}

}
