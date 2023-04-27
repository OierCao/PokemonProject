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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

@SuppressWarnings("serial")
public class PokemonPanela extends JPanel implements Observer{
	private JLabel pokeSprite;
	private Sagua sagua=null;
	private Kontroladore kontroladore;

	private int jokPos;
	private int pokPos;
	private JPanel barrakPanel;
	private JProgressBar healthBar;
	private JProgressBar euforiaBar;
	private JButton atk1;
	private JButton atk2;
	private JLabel separadore;
	private JPanel panel;
	private JLabel motakText;
	private JLabel izenaText;
	private JLabel erasoImg;
	private JLabel hpText;
	private JLabel erasoText;
	private JLabel defentsaText;
	private JLabel defentsaImg;
	private JLabel mota1Img;
	private JLabel mota2Img;
	private JLabel hpImg;

	/**
	 * Create the panel.
	 */
	public PokemonPanela(int pJokPos, int pPokPos) {
		jokPos=pJokPos;
		pokPos=pPokPos;
		setBackground(Color.WHITE);
		setBounds(0, 0, 150, 200);
		setLayout(new BorderLayout(0, 0));
		add(getPokeSprite(), BorderLayout.CENTER);
		add(getBarrakPanel(), BorderLayout.SOUTH);
		add(getPanel(), BorderLayout.NORTH);
	}
	
	private JPanel getBarrakPanel() {
		if (barrakPanel == null) {
			barrakPanel = new JPanel();
			barrakPanel.setLayout(new GridLayout(5, 1, 0, 0));
			barrakPanel.add(getHealthBar());
			barrakPanel.add(getEuforiaBar());
			barrakPanel.add(getSeparadore());
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
		izenaText.setText(((Pokemon)arg0).getIzena());
		if (((Pokemon)arg0).getMota2()==null) {
			erasoText.setText(((Pokemon)arg0).getAtk() + "");
			defentsaText.setText(((Pokemon)arg0).getDef() + "");
			hpText.setText(((Pokemon)arg0).getHP() + " / " + ((Pokemon)arg0).getMaxHP());
		}
		else{
			atk2.setEnabled(true);
			atk2.addActionListener(getKontroladore());
			atk2.setText(((Pokemon)arg0).getMota2().toString());
			botoiKolorea(atk2, ((Pokemon)arg0).getMota2());
			erasoText.setText(((Pokemon)arg0).getAtk() + "");
			defentsaText.setText(((Pokemon)arg0).getDef() + "");
			hpText.setText(((Pokemon)arg0).getHP() + " / " + ((Pokemon)arg0).getMaxHP());
			String icon;
			icon = "/Icons/" + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMota2().toString().toLowerCase() + ".png";
			mota2Img.setIcon(new ImageIcon(PokemonPanela.class.getResource(icon)));
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
			erasoText.setForeground(Color.RED);
			defentsaText.setForeground(Color.RED);
			hpText.setForeground(Color.RED);
			motakText.setForeground(Color.RED);
		}
		if (euforia < 100) {
			erasoText.setForeground(Color.BLACK);
			defentsaText.setForeground(Color.BLACK);
			hpText.setForeground(Color.BLACK);
			motakText.setForeground(Color.BLACK);
		}
		if (!pokeSprite.isEnabled()) {
			atk1.setEnabled(false);
			atk2.setEnabled(false);
		}
	}
	private JLabel getSeparadore() {
		if (separadore == null) {
			separadore = new JLabel("");
			separadore.setBackground(Color.WHITE);
		}
		return separadore;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(Color.WHITE);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			GridBagConstraints gbc_izenaText = new GridBagConstraints();
			gbc_izenaText.gridwidth = 4;
			gbc_izenaText.insets = new Insets(0, 0, 5, 0);
			gbc_izenaText.gridx = 0;
			gbc_izenaText.gridy = 0;
			panel.add(getIzenaText(), gbc_izenaText);
			GridBagConstraints gbc_erasoImg = new GridBagConstraints();
			gbc_erasoImg.insets = new Insets(0, 0, 5, 5);
			gbc_erasoImg.gridx = 0;
			gbc_erasoImg.gridy = 1;
			panel.add(getErasoImg(), gbc_erasoImg);
			GridBagConstraints gbc_erasoText = new GridBagConstraints();
			gbc_erasoText.insets = new Insets(0, 0, 5, 5);
			gbc_erasoText.gridx = 1;
			gbc_erasoText.gridy = 1;
			panel.add(getErasoText(), gbc_erasoText);
			GridBagConstraints gbc_defentsaImg = new GridBagConstraints();
			gbc_defentsaImg.insets = new Insets(0, 0, 5, 5);
			gbc_defentsaImg.gridx = 2;
			gbc_defentsaImg.gridy = 1;
			panel.add(getDefentsaImg(), gbc_defentsaImg);
			GridBagConstraints gbc_defentsaText = new GridBagConstraints();
			gbc_defentsaText.insets = new Insets(0, 0, 5, 0);
			gbc_defentsaText.gridx = 3;
			gbc_defentsaText.gridy = 1;
			panel.add(getDefentsaText(), gbc_defentsaText);
			GridBagConstraints gbc_hpImg = new GridBagConstraints();
			gbc_hpImg.insets = new Insets(0, 0, 5, 5);
			gbc_hpImg.gridx = 0;
			gbc_hpImg.gridy = 2;
			panel.add(getHpImg(), gbc_hpImg);
			GridBagConstraints gbc_hpText = new GridBagConstraints();
			gbc_hpText.gridwidth = 3;
			gbc_hpText.insets = new Insets(0, 0, 5, 0);
			gbc_hpText.gridx = 1;
			gbc_hpText.gridy = 2;
			panel.add(getHpText(), gbc_hpText);
			GridBagConstraints gbc_motakText = new GridBagConstraints();
			gbc_motakText.gridwidth = 2;
			gbc_motakText.insets = new Insets(0, 0, 0, 5);
			gbc_motakText.gridx = 0;
			gbc_motakText.gridy = 3;
			panel.add(getMotakText(), gbc_motakText);
			GridBagConstraints gbc_mota1Img = new GridBagConstraints();
			gbc_mota1Img.insets = new Insets(0, 0, 0, 5);
			gbc_mota1Img.gridx = 2;
			gbc_mota1Img.gridy = 3;
			panel.add(getMota1Img(), gbc_mota1Img);
			GridBagConstraints gbc_mota2Img = new GridBagConstraints();
			gbc_mota2Img.gridx = 3;
			gbc_mota2Img.gridy = 3;
			panel.add(getMota2Img(), gbc_mota2Img);
		}
		return panel;
	}
	private JLabel getIzenaText() {
		if (izenaText == null) {
			izenaText = new JLabel();
			izenaText.setHorizontalAlignment(SwingConstants.CENTER);
			izenaText.setText(JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getIzena());
		}
		return izenaText;
	}

	private JLabel getErasoImg() {
		if (erasoImg == null) {
			erasoImg = new JLabel();
			String icon;
			icon = "/Icons/eraso_icon.png";
			erasoImg.setIcon(new ImageIcon(PokemonPanela.class.getResource(icon)));
		}
		return erasoImg;
	}

	private JLabel getErasoText() {
		if (erasoText == null) {
			erasoText = new JLabel();
			erasoText.setText(JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getAtk() + "");
		}
		return erasoText;
	}

	private JLabel getDefentsaImg() {
		if (defentsaImg == null) {
			defentsaImg = new JLabel();
			String icon;
			icon = "/Icons/defentsa_icon.png";
			defentsaImg.setIcon(new ImageIcon(PokemonPanela.class.getResource(icon)));
		}
		return defentsaImg;
	}

	private JLabel getDefentsaText() {
		if (defentsaText == null) {
			defentsaText = new JLabel();
			defentsaText.setText(JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getDef() + "");
		}
		return defentsaText;
	}

	private JLabel getHpImg() {
		if (hpImg == null) {
			hpImg = new JLabel();
			String icon;
			icon = "/Icons/health_icon.png";
			hpImg.setIcon(new ImageIcon(PokemonPanela.class.getResource(icon)));
		}
		return hpImg;
	}

	private JLabel getHpText() {
		if (hpText == null) {
			hpText = new JLabel();
			hpText.setHorizontalAlignment(SwingConstants.LEFT);
			hpText.setText(JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getHP() + " / " + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMaxHP());

		}
		return hpText;
	}

	private JLabel getMotakText() {
		if (motakText == null) {
			motakText = new JLabel("Motak:");
			motakText.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return motakText;
	}
	private JLabel getMota1Img() {
		if (mota1Img == null) {
			mota1Img = new JLabel();
			String icon;
			icon = "/Icons/" + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMota1().toString().toLowerCase() + ".png";
			mota1Img.setIcon(new ImageIcon(PokemonPanela.class.getResource(icon)));
		}
		return mota1Img;
	}
	private JLabel getMota2Img() {
		if (mota2Img == null) {
			mota2Img = new JLabel();
			if(JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMota2()!=null) {
				String icon;
				icon = "/Icons/" + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMota2().toString().toLowerCase() + ".png";
				mota2Img.setIcon(new ImageIcon(PokemonPanela.class.getResource(icon)));
			}
		}
		return mota2Img;
	}
}