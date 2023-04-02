package Pokemon.Model;

public class MugimenduKudeatzailea {
	private static MugimenduKudeatzailea nMK = null;
	//erasotzaile
	private Jokalari jokErasotzaile;
	private Pokemon pokErasotzaile;
	//erasotua
	private Jokalari jokErasotua;
	private Pokemon pokErasotua;
	
	
	
	//BUILDER
	private MugimenduKudeatzailea() {
		setNull();
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
	
	private void setNull() {
		jokErasotua=null;
		pokErasotua=null;
		pokErasotzaile=null;
		jokErasotzaile=null;
	}
	
	//Beste metodoak
	public Jokalari eraso() {
		System.out.println("Erasoa egingo da");
		int erasoAtk= pokErasotzaile.getAtk();
	
		pokErasotua.atakeaKudeatu(erasoAtk);
		System.out.println("Erasoa kudeatu da");
				
		jokErasotua.eguneratuEgoera();
		jokErasotzaile.eguneratuEgoera();
				
		Jokalari irabazlea = JokalariKatalogoa.getJK().getLista().irabazlea();
		if(jokErasotzaile.equals(irabazlea)) {
			Borroka.getBorroka().setIrabazle(jokErasotzaile);
			jokErasotzaile.eguneratuEgoera();
		}
		setNull();
		return irabazlea;
	}

	public void prestEraso() {
		if(!(jokErasotzaile==null || jokErasotua==null || pokErasotzaile==null || pokErasotua==null)) {
			eraso();
		}
		
	}
	
	
}
