package Pokemon.Model;

import java.util.Random;
import java.util.Observable;

public class Pokemon extends Observable{

	private int atk;
	private int def;
	private int hp;
	private String izena;
	private String mota;
	private boolean ahulduta;

	
	//BUILDER
	public Pokemon(String pIzena, String pMota) {
		this.izena = pIzena;
		this.mota = pMota;
		estatistikakKalkulatu();
	}
	
	
	
	//SET/GET
	public String getIzena() {
		return izena;
	}
	
	public void estatistikakKalkulatu() {
		Random r=new Random();
		this.atk = 11 + r.nextInt(1, 7);
		this.def = 3 + r.nextInt(1, 4);
		this.hp = 200 + r.nextInt(1, 20);
	}
	
	public int getAtk(){
		return this.atk;
	}

	
	
	//EXTRAS
	public void atakeaKudeatu(int pAtk) {
		int mina = minaKalkulatu(pAtk);
		hpKudeatu(mina);
		
		eguneratuEgoera();
	}
	
	
	private int minaKalkulatu(int pAtk) {
		int mina = pAtk - this.def;
		if (mina < 0) mina = 0;
		return mina;
	}
	
	private void hpKudeatu(int pMina) {
		this.hp = this.hp - pMina;
		if (this.hp <= 0) setAhulduta(true);
	}
	
	public boolean getAhulduta(){
		return this.ahulduta;
	}
	
	private void setAhulduta(boolean pAhulduta) {
		this.ahulduta = pAhulduta;
	}
	
	
	
	
	//SCREEN
	public void eguneratuEgoera() {
		setChanged();
	}
	

}