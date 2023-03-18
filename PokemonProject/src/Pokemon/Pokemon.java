package Pokemon;

import java.util.Random;

public class Pokemon {

	private int atk;
	private int def;
	private int hp;
	private String izena;
	private String mota;
	private int euphoriaMax;

	public Pokemon(String pIzena, String pMota) {
		this.izena = pIzena;
		this.mota = pMota;
		
	}
	
	public String getIzena() {
		return izena;
	}
	
	public void estatistikakKalkulatu() {
		Random r=new Random();
		this.atk = 11 + r.nextInt(1, 7);
		this.def = 3 + r.nextInt(1, 4);
		this.hp = 200 + r.nextInt(1, 20);
		this.euphoriaMax = r.nextInt(3, 7);
	}

}