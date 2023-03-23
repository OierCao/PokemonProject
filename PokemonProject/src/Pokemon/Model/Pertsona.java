package Pokemon.Model;

public class Pertsona extends Jokalari {
	boolean jolasten;
	
	//BUILDER
	public Pertsona(int pJokNum,int pPokKop)
	{
		super(pPokKop);
		izena = "this.getClass().getName()" + pJokNum;
		this.jolasten=false;
	}
	
	
	
	//SET/GET
	public boolean getJolasten() {
		return this.jolasten;
	}
	
	
	
	//EXTRAS
	public void jolastu() {
		this.jolasten = true;
		Jokalari erasotua = null;
		//LOOP mugimendu guztiak
		//{
		
		
		//nork eraso egin
		
		//nor erasotua
			//aukeratu bizirik dagoen norbait eta ahulduta ez dagoen pokemon bat
		
		//this.eguneratuErasotua(erasotua);
		
		//}
		
		this.jolasten = false;
	}
	
	
}