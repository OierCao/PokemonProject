package Pokemon.Model;

import java.util.ArrayList;

public class Bot extends Jokalari {
	private int IAmaila; 
	
	
	//Eraikitzaile
	public Bot(int pJokNum,int pPokKop,int pAI) {
		super(pPokKop);
		izena = "Bot" + pJokNum;
		IAmaila=pAI;
	}
	
	//Getter
	private Jokalari getJokalaria(JokalariZerrenda pJZ) {
		return pJZ.getBesteRandomBizirik(this);
	}
	
	private Pokemon getAtkPok(PokemonZerrenda pZ) {
		return pZ.getRandomEzAhulduta();
	}
	
	//Beste metodoak
	public void jolastu() {
		System.out.println("Nire izena " + izena + " da eta erasotzeari ekin egingo diot");
		JokalariZerrenda pJZ = JokalariKatalogoa.getJK().getLista();
		MugimenduKudeatzailea MK = MugimenduKudeatzailea.getMK();
		
		Jokalari irabazlea=pJZ.irabazlea();
		
		for (Pokemon p : getPokemonak().getEzAhulduak().getLista()) {
			if (irabazlea==null) {
				
				ArrayList<Object> mugimendua=InteligentziaArtifiziala.getIA().mugimenduHoberena(p, this, IAmaila); //IA deia
				
				Mota erasoMota = (Mota)mugimendua.get(0);
				Jokalari erasoJ = (Jokalari)mugimendua.get(1);
				Pokemon erasoPok= (Pokemon)mugimendua.get(2);
				
			
				System.out.println(p.getId() + " pokemonarekin hurrengoari erasotuko diot");
				System.out.println(erasoJ.getIzena() + " jokalariari");
				System.out.println(erasoPok.getId() + " pokemonari");

				MK.setJokErasotzaile(this);
				MK.setPokErasotzaile(p);
				MK.setMotaAtk(erasoMota);
				MK.setJokErasotua(erasoJ);
				MK.setPokErasotua(erasoPok);

				irabazlea = MK.eraso();	
			}
			
		}
	}
	
	
	/*
	Jokalari erasoJ = getJokalaria(pJZ);
	Pokemon erasoPok = getAtkPok(erasoJ.getPokemonak().getEzAhulduak());

	System.out.println(p.getId() + " pokemonarekin hurrengoari erasotuko diot");
	System.out.println(erasoJ.getIzena() + " jokalariari");
	System.out.println(erasoPok.getId() + " pokemonari");

	MK.setJokErasotzaile(this);
	MK.setPokErasotzaile(p);
	Random r = new Random();
	int i = r.nextInt(2);
	if(p.getMota2()!=null && i==1) {
		System.out.println("Eraso egingo diot " + p.getMota2().toString() + " atakearekin");
		MK.setMotaAtk(p.getMota2());
	}
	else {
		System.out.println("Eraso egingo diot " + p.getMota1().toString() + " atakearekin");
		MK.setMotaAtk(p.getMota1());
	}

	MK.setJokErasotua(erasoJ);
	MK.setPokErasotua(erasoPok);
	

	irabazlea = MK.eraso();	
	
	*/
	
	
	
	
}