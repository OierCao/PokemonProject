package Pokemon.Model;

import java.util.HashMap;
import java.util.Map;
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
	
	public String runCommand(String pCommand) {
		String sysOut="Comandoa ez da aurkitu";
		boolean success=false;

		
		//AUDIO
		if (pCommand.startsWith("/play")) {
			String balioa=this.getWord(pCommand);
			boolean aldaketa=AudioKudeatzailea.getAudioKudeatzailea().playAudio(balioa);
			if (aldaketa) {
				sysOut="musica aldatu egin da";
				success=true;
				}
			else {sysOut="musica ez izan da aldatu";}
			
		}
		
		else if (pCommand.equals("/pause")) {
			success=AudioKudeatzailea.getAudioKudeatzailea().pauseAudio();
			if (success) {
				sysOut="musica gelditu egin da";
			}
			else {
				sysOut="musica geldituta dago jada";
			}
		}
		
		else if (pCommand.equals("/resume")) {
			success=AudioKudeatzailea.getAudioKudeatzailea().resumeMusic();
			if (success) {
				sysOut="musica berriro jarri da";
			}
			else {
				sysOut="musica badago jada jarrita";
			}
		}
		
		else if (pCommand.equals("/mute")) {
			AudioKudeatzailea.getAudioKudeatzailea().mute();
			sysOut="musica mute-n jarri da";
			success=true;
		}
		
		else if (pCommand.startsWith("/changevolume")) {
			String balioaStr=this.getWord(pCommand);
			
			if (balioaStr!=null && this.zenbakiaDa(balioaStr)){
				int balioa=Integer.parseInt(balioaStr);
				if (balioa>=0 && balioa <=100) {
					
					if (pCommand.contains("/changevolumeFx")) {
						AudioKudeatzailea.getAudioKudeatzailea().setVol((float)balioa,"Fx");
						sysOut="efektuen bolumena eguneratu da";
						success=true;
					}
					else {
						AudioKudeatzailea.getAudioKudeatzailea().setVol((float)balioa,"Music");
						sysOut="musikaren bolumena eguneratu da";
						success=true;
					}

				}
				else {sysOut="mesedez sartu 0-100 arteko balio bat";}	
			}	
		}
		
		
		//INFO
		
		
		else if ((pCommand.startsWith("/weak"))) {
			String balioaStr=this.getWord(pCommand);
			if (balioaStr!=null){
				try {
					String Mayus=balioaStr.substring(0, 1).toUpperCase();
					balioaStr=Mayus + balioaStr.substring(1);
					Mota m=Mota.valueOf(balioaStr);
					sysOut="";
					HashMap<Mota,Float> lista=MugimenduKudeatzailea.getMK().weak(m);
					for ( Map.Entry<Mota, Float> entry : lista.entrySet() )
					{
						float weakValue=entry.getValue();
						Mota weakType=entry.getKey();
						
						sysOut=sysOut + "\n" + weakType.toString() + ": x" + weakValue;
					}		
					success=true;
				}
				catch(Exception e){
					sysOut="ez da mota aurkitu";
				}
				
			}
		}
		
		
		else if ((pCommand.startsWith("/effective"))) {
			String balioaStr=this.getWord(pCommand);
			if (balioaStr!=null){
				try {
					String Mayus=balioaStr.substring(0, 1).toUpperCase();
					balioaStr=Mayus + balioaStr.substring(1);
					Mota m=Mota.valueOf(balioaStr);
					sysOut="";
					HashMap<Mota,Float> lista=MugimenduKudeatzailea.getMK().effective(m);
					for ( Map.Entry<Mota, Float> entry : lista.entrySet() )
					{
						float weakValue=entry.getValue();
						Mota weakType=entry.getKey();
						
						sysOut=sysOut + "\n" + weakType.toString() + ": x" + weakValue;
					}		
					success=true;
				}
				catch(Exception e){
					sysOut="ez da mota aurkitu";
				}
				
			}
		}

		//update
		if (success==false) {
			AudioKudeatzailea.getAudioKudeatzailea().playEffect("wrong");
		}
		else {
			AudioKudeatzailea.getAudioKudeatzailea().playEffect("correct");
		}
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
			@SuppressWarnings("unused")
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
