package Pokemon.Model;

import java.io.File;
import java.io.IOException;

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
	float prevVol = -25f;
	float cVol = -25f;
	boolean mute = false;
	
	private Clip effectClip = null;
	private Clip musicClip = null;
	
	private AudioInputStream musicSoinuInput;
	private AudioInputStream effectSoinuInput;
	
	private String egoera;
	
	private String fitxategiPath = "/Audio/Pokemon_Theme_Song.wav";
	
	
	public static AudioKudeatzailea getAudioKudeatzailea()
	{
		if (nAK == null) {
			nAK = new AudioKudeatzailea();
		}
		return nAK;
	}
	

	
	//
	public synchronized void playEffect(int pSound) {
		if (this.effectClip != null) 
	     {
	       this.effectClip.stop();
	       this.effectClip.flush();
	       this.effectClip.close();
	     }  
	    String pFile = "";
	    if (pSound == 0) {
	      pFile = "/Audio/virtual.wav";
	     }

	     try {
	      this.effectSoinuInput = AudioSystem.getAudioInputStream(getClass().getResource(pFile));
	      this.effectClip = AudioSystem.getClip();
	      this.effectClip.open(this.effectSoinuInput);
	      
	      this.effectClip.start();
	       this.effectClip.wait();
	     } catch (Exception exception) {}
	     
	}
	 
	 
	public synchronized void playAudio(int pSound) {
	     if (this.musicClip != null) {
	      this.musicClip.stop();
	       this.musicClip.flush();
	       this.musicClip.close();
	    } 
	     String pFile = "";
	     if (pSound == 0) {
	       pFile = "/Audio/Pokemon_Theme_Song.wav";
	     }
	     if (pSound == 1) {
	       pFile = "";
	     }
	     if (pSound == 2) {
	      pFile = "";
	     }
	     
	     try {
	      this.musicSoinuInput = AudioSystem.getAudioInputStream(getClass().getResource(pFile));
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


	//SET/GET
	public void setFitxategiPath(String path) {
	}
	
	public void changeSong(int pSongId) {
		
	}
	
	
	//MUSIC
    public void playMusic() 
    {
        musicClip.start();
        egoera = "play";
    }
      
    public void pauseMusic()
    {
        if (egoera.equals("pause")) 
        {
            System.out.println("pause-n dago jada");
            return;
        }
        this.oraingoms = this.musicClip.getMicrosecondPosition();
        musicClip.stop();
        egoera = "pause";
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
    	String pFile = "/Audio/Pokemon_Theme_Song.wav";
    	
    	try {
    	musicSoinuInput = AudioSystem.getAudioInputStream(getClass().getResource(pFile));
        musicClip.open(musicSoinuInput);
        musicClip.loop(Clip.LOOP_CONTINUOUSLY);
    	}
    	catch (Exception e) {
  	      e.printStackTrace();
  	     } 
    	
    }
    
    //VOLUME
    public void volUp() {
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
