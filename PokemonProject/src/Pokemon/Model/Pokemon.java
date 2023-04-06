package Pokemon.Model;

import java.util.Random;
import java.util.Observable;

public class Pokemon extends Observable{

	private int atk;
	private int def;
	private int hp;
	private int maxHP;
	private String izena;
	private Mota mota;
	private boolean ahulduta;
	private Eboluzioa eboluzioa;
	private Egoera egoera;
	private int egoeraI;
	private int egoeraIMax;

	
	//Eraikitzaile
	public Pokemon(Mota pMota) {
		this.mota = pMota;
		this.ahulduta=false;
		eboluzioa = new Eboluzio0();
		egoera = new EgoeraNormal();
	}
	
	//Setter eta getter
	public void estatistikakKalkulatu() {
		Random r=new Random();
		this.atk = 11 + r.nextInt(6) + 1;
		this.def = 3 + r.nextInt(3) + 1;
		this.hp = 200 + r.nextInt(19) + 1;
		this.maxHP = this.hp;
		this.egoeraI = 0;
		this.egoeraIMax = 3 + r.nextInt(4);
	}
	
	public String getIzena() {return izena;}
	
	public int getAtk(){return this.atk;}
	
	public int getDef(){return this.def;}
	
	public int getHP(){return this.hp;}
	
	public Mota getMota(){return this.mota;}
	
	public int getMaxHP() {return this.maxHP;}
	
	public boolean getAhulduta(){return this.ahulduta;}
	
	private void setAhulduta(boolean pAhulduta) {this.ahulduta = pAhulduta;}
	
	public int getEgoeraI() {return this.egoeraI;}
	
	public int getEgoeraIMax() {return this.egoeraIMax;}

	//Beste metodoak
	public void atakeaKudeatu(int pAtk, float bider) {
		if(egoera instanceof EgoeraNormal) {
			egoeraI = egoeraI + 1;
		}
		float mina = minaKalkulatu(pAtk, bider);
		hpKudeatu((int)mina);
		eboluzioKudeatu();
		euforiaKudeatu();
		eguneratuEgoera();
	}
	
	private float minaKalkulatu(int pAtk, float bider) {
		float mina;
		mina = pAtk*bider - this.def;
			
		if (mina < 0) {
			mina = 0;
		}
		return mina;
	}
	
	private void hpKudeatu(int pMina) {
		this.hp = this.hp - pMina;
		if (this.hp <= 0) {
			hp=0;
			setAhulduta(true);
		}
	}
	
	public void gehituAtributuak(int pAtk, int pDef) {
		atk = atk+pAtk;
		def = def+pDef;
	}
	
	//Eboluzioa (STATE)
	
	public void setEboluzio(Eboluzioa pEboluzio) {
		eboluzioa = pEboluzio;
	}
	
	public void eboluzionatu() {
		eboluzioa.eboluzionatu(this);
	}
	
	public int getEboluzioZenb() {
		int eboZenb = 0;
		if(eboluzioa instanceof Eboluzio1) {
			eboZenb = 1;
		}
		else if(eboluzioa instanceof Eboluzio2) {
			eboZenb = 2;
		}
		return eboZenb;
	}
	
	public void eboluzioKudeatu() {
		System.out.println("Ebo kudeatu");
		System.out.println(((hp*100)/maxHP));
		if((((hp*100)/maxHP)<=50) && eboluzioa instanceof Eboluzio0) {
			System.out.println("1 evo");
			eboluzionatu();
		}
		if((((hp*100)/maxHP)<=20) && eboluzioa instanceof Eboluzio1) {
			System.out.println("2 evo");
			eboluzionatu();
		}
	}
	
	
	//Egoera
	public void setEgoera(Egoera pEgoera) {
		egoera = pEgoera;
	}
	public void egoeraAldatu() {
		egoera.egoeraAldatu(this);
	}
	
	public void euforiaKudeatu() {
		if(egoeraI==egoeraIMax && !(egoera instanceof EgoeraEuforia)) {
			egoeraAldatu();
		}
	}
	
	public void euforiaKendu() {
		if(egoera instanceof EgoeraEuforia) {
			egoeraI = 0;
			egoeraAldatu();
			eguneratuEgoera();
		}
		
	}
	
	//Pantalla
	public void eguneratuEgoera() {
		setChanged();
		notifyObservers();
	}

}