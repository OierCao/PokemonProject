package Pokemon.Model;

import java.util.Random;
import java.util.Observable;

public class Pokemon extends Observable{

	private int atk;
	private int def;
	private int hp;
	private int maxHP;
	private String izena;
	private String mota;
	private boolean ahulduta;

	
	//BUILDER
	public Pokemon(String pIzena, String pMota) {
		this.izena = pIzena;
		this.mota = pMota;
		this.ahulduta=false;
	}
	
	
	
	//SET/GET
	public String getIzena() {
		return izena;
	}
	
	public void estatistikakKalkulatu() {
		Random r=new Random();
		this.atk = 11 + r.nextInt(6) + 1;
		this.def = 3 + r.nextInt(3) + 1;
		this.hp = 200 + r.nextInt(19) + 1;
		this.maxHP = this.hp;
	}
	
	public int getAtk(){
		return this.atk;
	}
	public int getDef(){
		return this.def;
	}
	public int getHP(){
		return this.hp;
	}
	public String getMota(){
		return this.mota;
	}
	public int getMaxHP() {
		return this.maxHP;
	}
	
	
	//EXTRAS
	public void atakeaKudeatu(int pAtk, boolean pEraginkor) {
		int mina = minaKalkulatu(pAtk, pEraginkor);
		hpKudeatu(mina);
		eguneratuEgoera();
	}
	
	
	private int minaKalkulatu(int pAtk, boolean pEraginkor) {
		int mina;
		if(pEraginkor) {
			mina = pAtk * 2 - this.def;
		}
		else {
			mina = pAtk - this.def;
		}
		
		if (mina < 0) mina = 0;
		return mina;
	}
	
	private void hpKudeatu(int pMina) {
		this.hp = this.hp - pMina;
		if (this.hp <= 0) {
			setAhulduta(true);
		}
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
		notifyObservers();
	}
	

}