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
	
	public void setNull() {
		jokErasotua=null;
		pokErasotua=null;
		pokErasotzaile=null;
		jokErasotzaile=null;
	}
	
	
	
	//EXTRAS
	public void eraso() {
		int erasoAtk= pokErasotzaile.getAtk();
		boolean eraginkor = false;
		if(pokErasotzaile.getMota().equals("Fire") && pokErasotua.getMota().equals("Grass")) {
			eraginkor =true;
		}
		else if(pokErasotzaile.getMota().equals("Water") && pokErasotua.getMota().equals("Fire")) {
			eraginkor =true;
		}
		else if(pokErasotzaile.getMota().equals("Electric") && pokErasotua.getMota().equals("Water")) {
			eraginkor =true;
		}
		else if(pokErasotzaile.getMota().equals("Grass") && pokErasotua.getMota().equals("Electric")) {
			eraginkor =true;
		}
		
		pokErasotua.atakeaKudeatu(erasoAtk, eraginkor);
		jokErasotua.eguneratuEgoera();
	}
	
	
}
