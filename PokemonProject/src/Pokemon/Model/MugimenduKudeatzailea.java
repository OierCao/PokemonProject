package Pokemon.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Observable;

public class MugimenduKudeatzailea extends Observable{
	private static MugimenduKudeatzailea nMK = null;
	//erasotzaile
	private Jokalari jokErasotzaile;
	private Pokemon pokErasotzaile;
	//erasotua
	private Jokalari jokErasotua;
	private Pokemon pokErasotua;
	private float[][] motaTabla;
	private Mota motaAtk;
	
	
	//BUILDER
	private MugimenduKudeatzailea() {
		motaTabla = new float[18][18];
		motaTablaOsatu();
		setNull();
	}
	
	private void motaTablaOsatu() {
		for (int i = 0; i < 18; i++) {
		    for (int j = 0; j < 18; j++) {
		        motaTabla[i][j] = 1.0f;
		    }
		}
		//BUG
		motaTabla[0][1] = 2.0f;
		motaTabla[0][9] = 2.0f;
		motaTabla[0][14] = 2.0f;
		
		motaTabla[0][4] = 0.5f;
		motaTabla[0][5] = 0.5f;
		motaTabla[0][6] = 0.5f;
		motaTabla[0][7] = 0.5f;
		motaTabla[0][8] = 0.5f;
		motaTabla[0][13] = 0.5f;
		motaTabla[0][16] = 0.5f;
		
		//DARK
		motaTabla[1][8] = 2.0f;
		motaTabla[1][14] = 2.0f;
		
		motaTabla[1][1] = 0.5f;
		motaTabla[1][4] = 0.5f;
		motaTabla[1][5] = 0.5f;
		
		//DRAGON
		motaTabla[2][2] = 2.0f;
		
		motaTabla[2][16] = 0.5f;
		
		motaTabla[2][4] = 0.0f;
		
		//ELECTRIC
		motaTabla[3][7] = 2.0f;
		motaTabla[3][17] = 2.0f;
		
		motaTabla[3][2] = 0.5f;
		motaTabla[3][3] = 0.5f;
		motaTabla[3][9] = 0.5f;
		
		motaTabla[3][10] = 0.0f;
		
		//FAIRY
		motaTabla[4][1] = 2.0f;
		motaTabla[4][2] = 2.0f;
		motaTabla[4][5] = 2.0f;
		
		motaTabla[4][6] = 0.5f;
		motaTabla[4][13] = 0.5f;
		motaTabla[4][16] = 0.5f;
		
		//FIGHT
		motaTabla[5][1] = 2.0f;
		motaTabla[5][11] = 2.0f;
		motaTabla[5][12] = 2.0f;
		motaTabla[5][15] = 2.0f;
		motaTabla[5][16] = 2.0f;
		
		motaTabla[5][0] = 0.5f;
		motaTabla[5][4] = 0.5f;
		motaTabla[5][7] = 0.5f;
		motaTabla[5][13] = 0.5f;
		motaTabla[5][14] = 0.5f;
		
		motaTabla[5][8] = 0.0f;
		
		//FIRE
		motaTabla[6][0] = 2.0f;
		motaTabla[6][9] = 2.0f;
		motaTabla[6][11] = 2.0f;
		motaTabla[6][16] = 2.0f;
		
		motaTabla[6][2] = 0.5f;
		motaTabla[6][6] = 0.5f;
		motaTabla[6][15] = 0.5f;
		motaTabla[6][17] = 0.5f;
		
		//FLYING
		motaTabla[7][0] = 2.0f;
		motaTabla[7][5] = 2.0f;
		motaTabla[7][9] = 2.0f;
		
		motaTabla[7][3] = 0.5f;
		motaTabla[7][15] = 0.5f;
		motaTabla[7][16] = 0.5f;
		
		//GHOST
		motaTabla[8][8] = 2.0f;
		motaTabla[8][14] = 2.0f;
		
		motaTabla[8][1] = 0.5f;

		motaTabla[8][12] = 0.0f;
		
		//GRASS
		motaTabla[9][10] = 2.0f;
		motaTabla[9][15] = 2.0f;
		motaTabla[9][17] = 2.0f;
		
		motaTabla[9][0] = 0.5f;
		motaTabla[9][2] = 0.5f;
		motaTabla[9][6] = 0.5f;
		motaTabla[9][7] = 0.5f;
		motaTabla[9][9] = 0.5f;
		motaTabla[9][13] = 0.5f;
		motaTabla[9][16] = 0.5f;
		
		//GROUND
		motaTabla[10][3] = 2.0f;
		motaTabla[10][6] = 2.0f;
		motaTabla[10][13] = 2.0f;
		motaTabla[10][15] = 2.0f;
		motaTabla[10][16] = 2.0f;
		
		motaTabla[10][0] = 0.5f;
		motaTabla[10][9] = 0.5f;
		
		motaTabla[10][7] = 0.0f;
		
		//ICE
		motaTabla[11][2] = 2.0f;
		motaTabla[11][7] = 2.0f;
		motaTabla[11][9] = 2.0f;
		motaTabla[11][10] = 2.0f;
		
		motaTabla[11][6] = 0.5f;
		motaTabla[11][11] = 0.5f;
		motaTabla[11][16] = 0.5f;
		motaTabla[11][17] = 0.5f;
		
		//NORMAL
		motaTabla[12][15] = 0.5f;
		motaTabla[12][16] = 0.5f;
		
		motaTabla[12][8] = 0.0f;
		
		//POISON
		motaTabla[13][4] = 2.0f;
		motaTabla[13][9] = 2.0f;
		
		motaTabla[13][8] = 0.5f;
		motaTabla[13][10] = 0.5f;
		motaTabla[13][13] = 0.5f;
		motaTabla[13][15] = 0.5f;
		
		motaTabla[13][16] = 0.0f;
		
		//PSYCHIC
		motaTabla[14][5] = 2.0f;
		motaTabla[14][13] = 2.0f;
		
		motaTabla[14][14] = 0.5f;
		motaTabla[14][16] = 0.5f;
		
		motaTabla[14][1] = 0.0f;
		
		//ROCK
		motaTabla[15][0] = 2.0f;
		motaTabla[15][6] = 2.0f;
		motaTabla[15][7] = 2.0f;
		motaTabla[15][11] = 2.0f;
		
		motaTabla[15][5] = 0.5f;
		motaTabla[15][10] = 0.5f;
		motaTabla[15][16] = 0.5f;
		
		//STEEL
		motaTabla[16][4] = 2.0f;
		motaTabla[16][11] = 2.0f;
		motaTabla[16][15] = 2.0f;
		
		motaTabla[16][3] = 0.5f;
		motaTabla[16][6] = 0.5f;
		motaTabla[16][16] = 0.5f;
		motaTabla[16][17] = 0.5f;
		
		//WATER
		motaTabla[17][6] = 2.0f;
		motaTabla[17][10] = 2.0f;
		motaTabla[17][15] = 2.0f;
		
		motaTabla[17][2] = 0.5f;
		motaTabla[17][9] = 0.5f;
		motaTabla[17][17] = 0.5f;

	}

	public static MugimenduKudeatzailea getMK() {
		if (nMK==null) {
			nMK= new MugimenduKudeatzailea();
		}
		return nMK;
	}
	
	
	
	//SET/GET
	public Pokemon getPokErasotzaile() {
		return pokErasotzaile;
	}
	public Jokalari getJokErasotzaile() {
		return jokErasotzaile;
	}
	
	public Pokemon getPokErasotua() {
		return pokErasotua;
	}
	public Jokalari getJokErasotua() {
		return jokErasotua;
	}
	
	public void setJokErasotzaile(Jokalari pJErasotzaile) {
		jokErasotzaile = pJErasotzaile;
	}
	public void setPokErasotzaile(Pokemon pPErasotzaile) {
		pokErasotzaile = pPErasotzaile;
	}
	public void setJokErasotua(Jokalari pJErasotua) {
		jokErasotua = pJErasotua;
	}
	public void setPokErasotua(Pokemon pPErasotua) {
		pokErasotua = pPErasotua;
	}
	public void setMotaAtk(Mota pMotaAtk) {
		motaAtk = pMotaAtk;
	}
	
	public void setNull() {
		jokErasotua=null;
		pokErasotua=null;
		pokErasotzaile=null;
		jokErasotzaile=null;
	}
	
	//Beste metodoak
	public Jokalari eraso() {
		System.out.println("Erasoa egingo da");
		int prevHp = pokErasotua.getHP();
		int erasoAtk= pokErasotzaile.getAtk();

		pokErasotua.atakeaKudeatu(erasoAtk, efikaziaCalc(motaAtk,pokErasotua) );

		pokErasotzaile.euforiaKendu();
		pokErasotzaile.eguneratuEgoera();
		System.out.println("Erasoa kudeatu da");
				
		jokErasotua.eguneratuEgoera();
		jokErasotzaile.eguneratuEgoera();
		
		
		int Hp = pokErasotua.getHP();
		int hpLost = prevHp-Hp;
				
		Jokalari irabazlea = JokalariKatalogoa.getJK().getLista().irabazlea();
		if(jokErasotzaile.equals(irabazlea)) {
			Borroka.getBorroka().setIrabazle(jokErasotzaile);
			jokErasotzaile.eguneratuEgoera();
		}
		AudioKudeatzailea.getAudioKudeatzailea().playEffect(motaAtk.toString());
		eguneratuConsoleScreen(hpLost);
		setNull();
		return irabazlea;
	}
	
	
	public float efikaziaCalc(Mota pMota, Pokemon pPok) {
		float efikazia;

		int i = Arrays.asList(Mota.values()).indexOf(pMota);
		int j = Arrays.asList(Mota.values()).indexOf(pPok.getMota1());
		float bider = motaTabla[i][j];
		System.out.println("bider 1" + bider);
		
		if(pPok.getMota2()!=null) {
			int j2 = Arrays.asList(Mota.values()).indexOf(pPok.getMota2());
			float bider2 = motaTabla[i][j2];
			System.out.println("i" + i + "j2" + j2);
			System.out.println("bider 2" + bider2);
			efikazia=bider*bider2;
		}
		else {
			efikazia=bider;
		}
		System.out.println("efikazia" + efikazia);
		return efikazia;
	}
	
	
	public HashMap<Mota,Float> weak(Mota pMota){
		HashMap<Mota,Float> list= new HashMap<Mota,Float>();
		for (int i = 0; i < 18; i++) {
		    for (int j = 0; j < 18; j++) {
		    	if (pMota.equals(Mota.values()[j])) {
		    		Mota mota=Mota.values()[i];
			    	list.put(mota, motaTabla[i][j]);
		    	}	
		    }
		    }
		return list;
	}
	
	public HashMap<Mota,Float> effective(Mota pMota){
		HashMap<Mota,Float> list= new HashMap<Mota,Float>();
		for (int i = 0; i < 18; i++) {
		    for (int j = 0; j < 18; j++) {
		    	if (pMota.equals(Mota.values()[i])) {
		    		Mota mota=Mota.values()[j];
			    	list.put(mota, motaTabla[i][j]);
		    	}	
		    }
		    }
		return list;
	}
	
	
	

	public void prestEraso() {
		if(!(jokErasotzaile==null || jokErasotua==null || pokErasotzaile==null || pokErasotua==null)) {
			eraso();
		}
		
	}
	
	private void eguneratuConsoleScreen(int hpLost) { //actualizar la pantalla porque hay un nuevo jugador
		setChanged();
		notifyObservers(hpLost);
		
	}
	
	
}
