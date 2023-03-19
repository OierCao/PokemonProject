package Pokemon.Model;

public class Pertsona extends Jokalari {
	boolean jolasten;
	
	//BUILDER
	public Pertsona(int pJokNum)
	{
		super();
		izena = "this.getClass().getName()" + pJokNum;
		this.jolasten=false;
	}
	
	
	//SET/GET

	
	
	
	//EXTRAS
	public void jolastu() {
		this.jolasten = true;
		Jokalari erasotua = null;
		//LOOP mugimendu guztiak
		//{
		
		
		//nork eraso egin
		
		//nor erasotua
			//aukeratu bizirik dagoen norbait eta ahulduta ez dagoen pokemon bat
		
		this.eguneratuErasotua(erasotua);
		
		//}
		
		this.jolasten = false;
	}
	
	
}