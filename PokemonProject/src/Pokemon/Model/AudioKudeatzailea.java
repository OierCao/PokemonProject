package Pokemon.Model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioKudeatzailea {
	private static AudioKudeatzailea nAK=null;
	private Long oraingoms;
	
	FloatControl fc;
	FloatControl fcFx;
	float prevVol = -15f;
	float cVol = -15f;
	boolean mute = false;
	float prevVolFx = -10f;
	float cVolFx = -10f;
	boolean muteFx = false;
	
	
	private Clip effectClip = null;
	private Clip musicClip = null;
	
	private AudioInputStream musicSoinuInput;
	private AudioInputStream effectSoinuInput;
	
	private String egoera;
	private String egoeraFx;
	
	private String musikaFitx;
	
	private ArrayList<String> musikaAukeraLista = new ArrayList<String>();
	private ArrayList<String> musikaLista;
	
	
	//Eraikitzailea
	private AudioKudeatzailea() {
		musikaAukeraLista.add("blackwhite");
		musikaAukeraLista.add("oras");
		musikaAukeraLista.add("platinum");
		musikaAukeraLista.add("xy");
		
		musikaLista=(ArrayList<String>) musikaAukeraLista.clone();
		musikaLista.add("advanced battle");
		musikaLista.add("champion");
		
	}
	public static AudioKudeatzailea getAudioKudeatzailea()
	{
		if (nAK == null) {
			nAK = new AudioKudeatzailea();
		}
		return nAK;
	}
	

	
	//PLAY
	public synchronized void playEffect(String pFx) {
		if (this.effectClip != null) 
	     {
	       this.effectClip.stop();
	       this.effectClip.flush();
	       this.effectClip.close();
	     }  
		pFx= "/AudioFx/" + pFx + ".wav";
	     try {
	      this.effectSoinuInput = AudioSystem.getAudioInputStream(getClass().getResource(pFx));
	      this.effectClip = AudioSystem.getClip();
	      this.effectClip.open(this.effectSoinuInput);
	      
	      fcFx = (FloatControl) effectClip.getControl(FloatControl.Type.MASTER_GAIN);
	      cVolFx = prevVolFx;
          fcFx.setValue(cVolFx);
	      
	      this.effectClip.start();
	       this.effectClip.wait();
	     } catch (Exception exception) {}
	     
	}
	 
	 
	public synchronized boolean playAudio(String pAudioIzena) {
	     boolean aldaketa=this.setAudioFitx(pAudioIzena);
	     
	     if (aldaketa) {
		     if (this.musicClip != null) {
			      this.musicClip.stop();
			       this.musicClip.flush();
			       this.musicClip.close();
			     } 
	    	 try {
		    	 System.out.println("musikafitx=" + musikaFitx);
		      this.musicSoinuInput = AudioSystem.getAudioInputStream(getClass().getResource(musikaFitx));
		       this.musicClip = AudioSystem.getClip();
		       this.musicClip.open(this.musicSoinuInput);
		       this.musicClip.loop(-1);
		       fc = (FloatControl) musicClip.getControl(FloatControl.Type.MASTER_GAIN);
		       cVol = prevVol;
	           fc.setValue(cVol);
		       
		       this.playMusic();
		     }
		     catch (Exception e) {
		      e.printStackTrace();
		     } 
	     }
	     return aldaketa;
	     
	   }

	private boolean setAudioFitx(String pAudioIzena) {
		boolean changed=true;
		 if (pAudioIzena.equals("random")) {
	    	 Random rand = new Random(); 
	    	 System.out.println("size=" +musikaAukeraLista.size());
	         int random = rand.nextInt(musikaAukeraLista.size()-1); 
	         pAudioIzena=musikaAukeraLista.get(random);
	         System.out.println("random song=" + random);
	         this.musikaFitx="/Audio/" + pAudioIzena + ".wav";
		 }
	        
		 else {
			 if (musikaLista.contains(pAudioIzena)) {
				 this.musikaFitx="/Audio/" + pAudioIzena + ".wav";
			 }
			 else {
				 changed=false;
			 }
		 }
		 return changed;
	}
	
	
	//MUSIC
    public void playMusic() 
    {
    	System.out.println("play music");
        musicClip.start();
        egoera = "play";
    }
      
    public void pauseAudio(){
    	if (egoera.equals("pause")) {
    		System.out.println("Musika pause-n dago jada");
    		return;
    		}
    	else {
    		this.oraingoms = this.musicClip.getMicrosecondPosition();
    		musicClip.stop();
    		egoera = "pause";
    		}
    	}

    public void resumeMusic()
    {
        if (egoera.equals("play")) 
        {
            System.out.println("play-an dago jada");
            return;
        }
        musicClip.close();
        resetAudio();
        musicClip.setMicrosecondPosition(oraingoms);
        this.playMusic();
    }
      
    public void restart() throws UnsupportedAudioFileException, IOException,
    LineUnavailableException 
    {
    	musicClip.stop();
    	musicClip.close();
        resetAudio();
        oraingoms = 0L;
        musicClip.setMicrosecondPosition(0);
        this.playMusic();;
    }
      
    public void stop() throws UnsupportedAudioFileException, IOException,
    LineUnavailableException 
    {
        oraingoms = 0L;
        musicClip.stop();
        musicClip.close();
    }
    
    public void resetAudio()
    {
    	try {
    	musicSoinuInput = AudioSystem.getAudioInputStream(getClass().getResource(musikaFitx));
        musicClip.open(musicSoinuInput);
        musicClip.loop(Clip.LOOP_CONTINUOUSLY);
    	}
    	catch (Exception e) {
  	      e.printStackTrace();
  	     } 
    	
    }
    
    //VOLUME
    public void volUp(String pChannel) {
        cVol += 1.0f;
        System.out.println("up");
        if(cVol > 6.0f) {
            cVol = 6.0f;
        }
        fc.setValue(cVol);
    }
    public void volDown() {
        cVol -= 1.0f;
        if(cVol > -80.0f) {
            cVol = -80.0f;
        }
        fc.setValue(cVol);  
    }
    
    public void setVol(float pVol) //-80f<x<6f
    {
    	System.out.println(pVol + "pVol");
    	Float calcVol=(86f/100f);
    	calcVol=calcVol*pVol;
    	//Float calcVol=((86/100) * pVol);
    	calcVol=calcVol-80;
    	System.out.println(calcVol);
    	
    	if(calcVol >= -80.0f && calcVol <= 6f) {
    		this.cVol=calcVol;
        	fc.setValue(cVol);
    	}
    }
    
    public void mute() {
        if(mute == false) {
            prevVol = cVol;
            cVol = -80.0f;
            fc.setValue(cVol);
            mute = true;
        }
        else if(mute == true) {
            cVol = prevVol;
            fc.setValue(cVol);
            mute = false;   
        }
    }
	
    
    
    

}
