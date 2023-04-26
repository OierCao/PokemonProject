package Pokemon.Model;

import java.util.ArrayList;

public class PokemonIzenak {

	private static PokemonIzenak PI=null;
	private String[][] izenak0;
	private String[][] izenak1;
	private String[][] izenak2;
	
	private PokemonIzenak() {
		izenak0 = new String[21][18];
		izenak1 = new String[21][18];
		izenak2 = new String[21][18];
		matrizeakSortu();
	}
	
	public static PokemonIzenak getPI() {
		if(PI==null) {
			PI = new PokemonIzenak();
		}
		return PI;
	}
	
	
	private void matrizeakSortu() {
		ArrayList<String> izen0 = izenakPok0();
		ArrayList<String> izen1 = izenakPok1();
		ArrayList<String> izen2 = izenakPok2();		
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
				izenak0[err][zut] = izen0.get(pos);
				izenak1[err][zut] = izen1.get(pos);
				izenak2[err][zut] = izen2.get(pos);
				err++;
				pos++;
			}
			err=0;
			zut++;
		}
	}

	private ArrayList<String> izenakPok0() {
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
	
	private ArrayList<String> izenakPok1() {
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
	
	private ArrayList<String> izenakPok2() {
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
	
	public String[][] getIzenak0() {return izenak0;}
	public String[][] getIzenak1() {return izenak1;}
	public String[][] getIzenak2() {return izenak2;}
	
}
