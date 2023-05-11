package Pokemon.Model;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Observable;

public class Pokemon extends Observable{

	private String izena;
	private int atk;
	private int def;
	private int hp;
	private int maxHP;
	private int id;
	private ArrayList<Mota> mota;
	private boolean ahulduta;
	private Eboluzioa eboluzioa;
	private Egoera egoera;
	private int egoeraI;
	private int egoeraIMax;

	
	//Eraikitzaile
	public Pokemon(Mota pMota) {
		mota = new ArrayList<Mota>();
		mota.add(pMota);
		estatistikakKalkulatu();
		this.ahulduta=false;
		eboluzioa = new Eboluzio0(this);
		egoera = new EgoeraNormal(this, true);
	}
	
	//Setter eta getter
	private void estatistikakKalkulatu() {
		Random r=new Random();
		this.atk = 11 + r.nextInt(6) + 1;
		this.def = 3 + r.nextInt(3) + 1;
		this.hp = 200 + r.nextInt(19) + 1;
		this.maxHP = this.hp;
		this.egoeraI = 0;
		this.egoeraIMax = 3 + r.nextInt(5);
		int iMota = Arrays.asList(Mota.values()).indexOf(mota.get(0));
		int randomBalio;
		if(iMota==2 || iMota==4 || iMota==16 || iMota==11) {
			randomBalio=10;
		}
		else if(iMota==0 || iMota==6 || iMota==9 || iMota==15) {
			randomBalio=20;
		}
		else if(iMota==17) {
			randomBalio=21;
		}
		
		else {
			randomBalio=13;
		}

		this.id = r.nextInt(randomBalio);
	}
	
	public int getId() {return id;}
	
	public String getIzena() {return this.izena;}

	public int getAtk(){return this.atk;}
	
	public int getDef(){return this.def;}
	
	public int getHP(){return this.hp;}
	
	public void setIzena(String pIzena) {this.izena=pIzena;}
	
	public Mota getMota1(){return this.mota.get(0);}
	public Mota getMota2() {if(mota.size()==1) {return null;} else{return mota.get(1);}}
	
	public ArrayList<Mota> getMotak(){
		return this.mota;
	}
	
	public int getMaxHP() {return this.maxHP;}
	
	public boolean getAhulduta(){return this.ahulduta;}
	
	private void setAhulduta(boolean pAhulduta) {this.ahulduta = pAhulduta;}
	
	public Egoera getEgoera() {return this.egoera;}
	
	public int getEgoeraI() {return this.egoeraI;}
	
	public int getEgoeraIMax() {return this.egoeraIMax;}

	
	
	
	//Beste metodoak
	public void atakeaKudeatu(int pAtk, float efikazia) {
		if(egoera instanceof EgoeraNormal) {
			egoeraI = egoeraI + 1;
		}
		float mina = minaKalkulatu(pAtk, efikazia);
		hpKudeatu((int)mina);
		eboluzioKudeatu();
		euforiaKudeatu();
		System.out.println(getEboluzioZenb());
		eguneratuEgoera();
	}
	
	private float minaKalkulatu(int pAtk, float efikazia) {
		float mina;
		mina = pAtk*efikazia - this.def;
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
	
	public void gehituMota(Mota pMota) {
		mota.add(pMota);
	}
	
	public void aldatuMota(Mota pMota) {
		if(getMota2()!=null) {
			mota.remove(getMota2());
			mota.add(pMota);
		}
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
		if(egoeraI==egoeraIMax && !(egoera instanceof EgoeraEuforia) && hp!=0) {
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