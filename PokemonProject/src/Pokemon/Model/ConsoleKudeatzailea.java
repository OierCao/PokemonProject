package Pokemon.Model;

import java.util.Observable;

public class ConsoleKudeatzailea extends Observable{
	private static ConsoleKudeatzailea nCK=null;
	private String txt;
	
	private ConsoleKudeatzailea() {}
	
	public static ConsoleKudeatzailea getCK() {
		if (nCK==null) {
			nCK = new ConsoleKudeatzailea();
		}
		return nCK;
	}
	
	
	private void setTxt(String txt) {
		this.txt=txt;
	}
	
	private void addTxt(String addTxt) {
		this.txt=txt + addTxt;
	}
	
	
	public String runCommand(String pCommand) {
		String sysOut="Comandoa ez da aurkitu";
		
		sysOut=pCommand; //Prueba
		
		
		txt=sysOut;
		eguneratuConsoleScreen();
		return sysOut;
	}
	
	
	
	private void eguneratuConsoleScreen() {
		setChanged();
		notifyObservers(txt);
		
	}
	
	
	
}
