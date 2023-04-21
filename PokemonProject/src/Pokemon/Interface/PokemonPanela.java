package Pokemon.Interface;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Pokemon.Model.Bot;
import Pokemon.Model.JokalariKatalogoa;
import Pokemon.Model.Mota;
import Pokemon.Model.Pokemon;
import Pokemon.Model.MugimenduKudeatzailea;

import javax.swing.JTextPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class PokemonPanela extends JPanel implements Observer{
	private JLabel pokeSprite;
	private JTextPane pokeInfoPanel;
	private Sagua sagua=null;
	private Kontroladore kontroladore;

	private int jokPos;
	private int pokPos;
	private JPanel barrakPanel;
	private JProgressBar healthBar;
	private JProgressBar euforiaBar;
	private JButton atk1;
	private JButton atk2;
	private JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	public PokemonPanela(int pJokPos, int pPokPos) {
		jokPos=pJokPos;
		pokPos=pPokPos;
		setBackground(Color.WHITE);
		setBounds(0, 0, 140, 140);
		setLayout(new BorderLayout(0, 0));
		add(getPokeSprite(), BorderLayout.CENTER);
		add(getPokeInfoPanel(), BorderLayout.NORTH);
		add(getBarrakPanel(), BorderLayout.SOUTH);
	}

	private JTextPane getPokeInfoPanel() {
		if (pokeInfoPanel == null) {
			pokeInfoPanel = new JTextPane();
			pokeInfoPanel.setBounds(0, 0, 100, 100);
			pokeInfoPanel.setFont(new Font("Tahoma", Font.PLAIN, 12));
			pokeInfoPanel.setBackground(Color.WHITE);
			if (JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMota2()==null) {
				pokeInfoPanel.setText("\nEraso: " + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getAtk() + "" +  "\n"
						+ "Defentsa: " + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getDef() + "\n"
						+ "Bizia: " + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getHP() + "/" + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMaxHP() + "\n"
						+ "Mota: " + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMota1());
			}
			else{
				pokeInfoPanel.setText("\nEraso: " + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getAtk() + "" +  "\n"
						+ "Defentsa: " + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getDef() + "\n"
						+ "Bizia: " + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getHP() + "/" + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMaxHP() + "\n"
						+ "Mota: " + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMota1() + "/" + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMota2());
			}
		}
		return pokeInfoPanel;
	}
	
	private JPanel getBarrakPanel() {
		if (barrakPanel == null) {
			barrakPanel = new JPanel();
			barrakPanel.setLayout(new GridLayout(5, 1, 0, 0));
			barrakPanel.add(getHealthBar());
			barrakPanel.add(getEuforiaBar());
			barrakPanel.add(getLblNewLabel());
			barrakPanel.add(getAtk1());
			barrakPanel.add(getAtk2());
		}
		return barrakPanel;
	}
	private JProgressBar getHealthBar() {
		if (this.healthBar == null) {
		      this.healthBar = new JProgressBar();
		      healthBar.setEnabled(false);
		      this.healthBar.setStringPainted(true);
		      this.healthBar.setString("BIZIA");
		      this.healthBar.setForeground(new Color(138, 226, 52));
		      this.healthBar.setValue(100);
		    } 
		return this.healthBar;
	}
	private JProgressBar getEuforiaBar() {
		if (euforiaBar == null) {
			euforiaBar = new JProgressBar();
			euforiaBar.setEnabled(false);
		    euforiaBar.setStringPainted(true);
		    euforiaBar.setString("EUFORIA");
		    euforiaBar.setForeground(Color.YELLOW);
		    euforiaBar.setValue(0);
		}
		return euforiaBar;
	}

	private JLabel getPokeSprite() {
		if (pokeSprite == null) {
			pokeSprite = new JLabel("");
			pokeSprite.setBounds(0, 0, 140, 140);
			pokeSprite.setHorizontalAlignment(SwingConstants.CENTER);
			pokeSprite.setBackground(Color.WHITE);
			String pokemon;
			pokemon = "/Images/" + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMota1().toString().toLowerCase() + "_" + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getId() + "_0.png";
			
			pokeSprite.setIcon(new ImageIcon(PokemonPanela.class.getResource(pokemon)));
			pokeSprite.addMouseListener(getSagua());
		}
		return pokeSprite;
	}
	
	private JButton getAtk1() {
		if (atk1 == null) {
			atk1 = new JButton();
			atk1.setText(JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMota1().toString());
			atk1.addActionListener(getKontroladore());
			atk1.setBackground(Color.WHITE);
			botoiKolorea(atk1, JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMota1());
		}
		return atk1;
	}

	private JButton getAtk2() {
		if (atk2 == null) {
			atk2 = new JButton();
			if(JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMota2()!=null) {
				atk2.setText(JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMota2().toString());
				botoiKolorea(atk2, JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMota2());
				atk2.addActionListener(getKontroladore());
			}
			else {
				atk2.setEnabled(false);
			}
		}
		return atk2;
	}

	private void botoiKolorea(JButton btn, Mota mota) {
		btn.setForeground(Color.WHITE);
		if(mota.equals(Mota.Bug)) {
			btn.setBackground(new Color(143, 255, 56));
		}
		else if(mota.equals(Mota.Dark)) {
			btn.setBackground(new Color(78, 83, 74));
		}
		else if(mota.equals(Mota.Dragon)) {
			btn.setBackground(new Color(128, 0, 255));
		}
		else if(mota.equals(Mota.Electric)) {
			btn.setBackground(new Color(255, 247, 0));
		}
		else if(mota.equals(Mota.Fairy)) {
			btn.setBackground(new Color(255, 153, 255));
		}
		else if(mota.equals(Mota.Fight)) {
			btn.setBackground(new Color(111, 42, 42));
			btn.setForeground(Color.WHITE);
		}
		else if(mota.equals(Mota.Fire)) {
			btn.setBackground(new Color(255, 24, 24));
		}
		else if(mota.equals(Mota.Flying)) {
			btn.setBackground(new Color(190, 223, 255));
		}
		else if(mota.equals(Mota.Ghost)) {
			btn.setBackground(new Color(72, 0, 116));
			btn.setForeground(Color.WHITE);
		}
		else if(mota.equals(Mota.Grass)) {
			btn.setBackground(new Color(0, 185, 14));
		}
		else if(mota.equals(Mota.Ground)) {
			btn.setBackground(new Color(202, 130, 0));
		}
		else if(mota.equals(Mota.Ice)) {
			btn.setBackground(new Color(0, 255, 240));
		}
		else if(mota.equals(Mota.Normal)) {
			btn.setBackground(new Color(187, 184, 189));
		}
		else if(mota.equals(Mota.Poison)) {
			btn.setBackground(new Color(186, 72, 255));
		}
		else if(mota.equals(Mota.Psychic)) {
			btn.setBackground(new Color(255, 0, 162));
		}
		else if(mota.equals(Mota.Rock)) {
			btn.setBackground(new Color(160, 143, 4));
		}
		else if(mota.equals(Mota.Steel)) {
			btn.setBackground(new Color(128, 128, 128));
		}
		else if(mota.equals(Mota.Water)) {
			btn.setBackground(new Color(61, 129, 255));
		}
		
	}

	public void aktibatuSprite() {
		if(!JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getAhulduta()) {
			pokeSprite.setEnabled(true);
		}
	}
	
	public void aktibatuBotoiak() {
		if(!JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getAhulduta()) {
			atk1.setEnabled(true);
			if(JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMota2()!=null) {
				atk2.setEnabled(true);
			}
		}
	}
	
	//Controladore
	private class Kontroladore implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(atk1) && atk1.isEnabled() && JokalariKatalogoa.getJK().getJokPos(jokPos).getTxanda() && MugimenduKudeatzailea.getMK().getPokErasotzaile()==null && !(JokalariKatalogoa.getJK().getJokPos(jokPos) instanceof Bot)) {
				MugimenduKudeatzailea.getMK().setJokErasotzaile(JokalariKatalogoa.getJK().getJokPos(jokPos));
				MugimenduKudeatzailea.getMK().setPokErasotzaile(JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos));
				MugimenduKudeatzailea.getMK().setMotaAtk(JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMota1());
				atk1.setEnabled(false);
				pokeSprite.setEnabled(false);
			}
			else if(e.getSource().equals(atk2) && atk2.isEnabled() && JokalariKatalogoa.getJK().getJokPos(jokPos).getTxanda() && MugimenduKudeatzailea.getMK().getPokErasotzaile()==null && !(JokalariKatalogoa.getJK().getJokPos(jokPos) instanceof Bot)) {
				MugimenduKudeatzailea.getMK().setJokErasotzaile(JokalariKatalogoa.getJK().getJokPos(jokPos));
				MugimenduKudeatzailea.getMK().setPokErasotzaile(JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos));
				MugimenduKudeatzailea.getMK().setMotaAtk(JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMota2());
				atk2.setEnabled(false);
				pokeSprite.setEnabled(false);
			}
			else if(e.getSource().equals(atk1) && atk1.isEnabled() && JokalariKatalogoa.getJK().getJokPos(jokPos).getTxanda() && MugimenduKudeatzailea.getMK().getPokErasotzaile().equals(JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos)) && !(JokalariKatalogoa.getJK().getJokPos(jokPos) instanceof Bot)) {
				MugimenduKudeatzailea.getMK().setJokErasotzaile(JokalariKatalogoa.getJK().getJokPos(jokPos));
				MugimenduKudeatzailea.getMK().setPokErasotzaile(JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos));
				MugimenduKudeatzailea.getMK().setMotaAtk(JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMota1());
				atk1.setEnabled(false);
				if(!atk2.isEnabled()) {
					atk2.setEnabled(true);
				}
				pokeSprite.setEnabled(false);
			}
			else if(e.getSource().equals(atk2) && atk2.isEnabled() && JokalariKatalogoa.getJK().getJokPos(jokPos).getTxanda() && MugimenduKudeatzailea.getMK().getPokErasotzaile().equals(JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos)) && !(JokalariKatalogoa.getJK().getJokPos(jokPos) instanceof Bot)) {
				MugimenduKudeatzailea.getMK().setJokErasotzaile(JokalariKatalogoa.getJK().getJokPos(jokPos));
				MugimenduKudeatzailea.getMK().setPokErasotzaile(JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos));
				MugimenduKudeatzailea.getMK().setMotaAtk(JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMota2());
				atk2.setEnabled(false);
				if(!atk1.isEnabled()) {
					atk1.setEnabled(true);
				}
				pokeSprite.setEnabled(false);
			}
						
		}
		
	}
	private class Sagua implements MouseListener {
		
		public void mouseClicked(MouseEvent e) {
			if(getPokeSprite().isEnabled() && !JokalariKatalogoa.getJK().getJokPos(jokPos).getTxanda()) {
				MugimenduKudeatzailea.getMK().setJokErasotua(JokalariKatalogoa.getJK().getJokPos(jokPos));
				MugimenduKudeatzailea.getMK().setPokErasotua(JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos));
				MugimenduKudeatzailea.getMK().prestEraso();
			}
		}

		public void mouseEntered(MouseEvent e) {	}

		public void mouseExited(MouseEvent e) {		}

		public void mousePressed(MouseEvent e) {	}

		public void mouseReleased(MouseEvent e) {	}
	}
	
	private Sagua getSagua() {
		if (sagua == null) {
			sagua = new Sagua();
		}
		return sagua;
	}
	private Kontroladore getKontroladore() {
		if (kontroladore == null) {
			kontroladore = new Kontroladore();
		}
		return kontroladore;
	}

	//Eguneraketa
	@Override
	public void update(Observable arg0, Object arg1) {
		String pokemon;
		if (((Pokemon)arg0).getMota2()==null) {
			pokeInfoPanel.setText("\nEraso: " + ((Pokemon)arg0).getAtk() + "" +  "\n"
					+ "Defentsa: " + ((Pokemon)arg0).getDef() + "\n"
					+ "Bizia: " + ((Pokemon)arg0).getHP() + "/" + ((Pokemon)arg0).getMaxHP() + "\n"
					+ "Mota: " + ((Pokemon)arg0).getMota1());
		}
		else{
			atk2.setEnabled(true);
			atk2.addActionListener(getKontroladore());
			atk2.setText(((Pokemon)arg0).getMota2().toString());
			botoiKolorea(atk2, ((Pokemon)arg0).getMota2());
			pokeInfoPanel.setText("\nEraso: " + ((Pokemon)arg0).getAtk() + "" +  "\n"
				+ "Defentsa: " + ((Pokemon)arg0).getDef() + "\n"
				+ "Bizia: " + ((Pokemon)arg0).getHP() + "/" + ((Pokemon)arg0).getMaxHP() + "\n"
				+ "Mota: " + ((Pokemon)arg0).getMota1() + "/" + ((Pokemon)arg0).getMota2());
		}	
		pokemon = "/Images/" +  ((Pokemon)arg0).getMota1().toString().toLowerCase() + "_" + ((Pokemon)arg0).getId() + "_" + ((Pokemon)arg0).getEboluzioZenb() +".png";
		
		
		pokeSprite.setIcon(new ImageIcon(PokemonPanela.class.getResource(pokemon)));
		
		float bizia = (((Pokemon)arg0).getHP()*100)/((Pokemon)arg0).getMaxHP();
		healthBar.setValue((int)bizia);
		float euforia = (((Pokemon)arg0).getEgoeraI()*100)/((Pokemon)arg0).getEgoeraIMax();
		euforiaBar.setValue((int)euforia);
		
		
		if (bizia <= 50) {
			this.healthBar.setForeground(Color.ORANGE);
		}   
		if (bizia <= 15) {
			this.healthBar.setForeground(Color.RED);
		}
		if (((Pokemon)arg0).getHP()==0) { //bizia 0 bada, euforia 0 izango da ere
			pokeSprite.setEnabled(false);
			euforia=0.0f;
			euforiaBar.setValue(0);
		}
		if (euforia <=0) {
			euforiaBar.setForeground(Color.YELLOW);
		}
		if (euforia >= 50) {
			euforiaBar.setForeground(Color.ORANGE);
		}   
		if (euforia == 100) {
			euforiaBar.setForeground(Color.RED);
			pokeInfoPanel.setForeground(Color.RED);
		}
		if (euforia < 100) {
			pokeInfoPanel.setForeground(Color.BLACK);
		}
		if (!pokeSprite.isEnabled()) {
			atk1.setEnabled(false);
			atk2.setEnabled(false);
		}
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setBackground(Color.WHITE);
		}
		return lblNewLabel;
	}
}