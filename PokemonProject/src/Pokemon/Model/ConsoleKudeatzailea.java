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

		
		//AUDIO
		if (pCommand.startsWith("/play")) {
			String balioa=this.getWord(pCommand);
			boolean aldaketa=AudioKudeatzailea.getAudioKudeatzailea().playAudio(balioa);
			if (aldaketa) {sysOut="musica aldatu egin da";}
			else {sysOut="musica ez izan da aldatu";}
			
		}
		
		else if (pCommand.equals("/pause")) {
			AudioKudeatzailea.getAudioKudeatzailea().pauseMusic();
			sysOut="musica gelditu egin da";
		}
		
		else if (pCommand.equals("/resume")) {
			AudioKudeatzailea.getAudioKudeatzailea().resumeMusic();
			sysOut="musica berriro jarri da";
		}
		
		else if (pCommand.equals("/mute")) {
			AudioKudeatzailea.getAudioKudeatzailea().mute();
			sysOut="musica mute-n jarri da";
		}
		
		else if (pCommand.startsWith("/changevolume")) {
			String balioaStr=this.getWord(pCommand);
			
			if (balioaStr!=null && this.zenbakiaDa(balioaStr)){
				int balioa=Integer.parseInt(balioaStr);
				if (balioa>=0 && balioa <=100) {
					AudioKudeatzailea.getAudioKudeatzailea().setVol((float)balioa);
					sysOut="musikaren bolumena eguneratu da";
				}
			}	
			else {sysOut="ezin izan da musikaren bolumena eguneratu sartu 0-100 arteko balio bat";}	
		}

		//update
		txt=sysOut;	
		eguneratuConsoleScreen();
		return sysOut;		
	}
			
		
	
	
	private String getWord(String pCommand) 
	{
		String balioaStr=null;
		if(pCommand.contains(" ")) {
			int pos = pCommand.indexOf(" ") + 1;
			balioaStr = pCommand.substring(pos);
		}
		return balioaStr;
	}
	
	private boolean zenbakiaDa(String pStr) {
		try {
			int balioa=Integer.parseInt(pStr);
			return true;
		}
		
		catch(NumberFormatException e) {
			return false;
		}
	}
	
	
	private void eguneratuConsoleScreen() {
		setChanged();
		notifyObservers(txt);
		
	}
	
	
	
}
