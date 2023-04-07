package Pokemon.Interface;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

import Pokemon.Model.Bot;
import Pokemon.Model.JokalariKatalogoa;
import Pokemon.Model.Pokemon;
import Pokemon.Model.MugimenduKudeatzailea;

import javax.swing.JTextPane;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class PokemonPanela extends JPanel implements Observer{
	private JLabel pokeSprite;
	private JTextPane pokeInfoPanel;
	private Sagua sagua=null;

	private int jokPos;
	private int pokPos;
	private JPanel barrakPanel;
	private JProgressBar healthBar;
	private JProgressBar euforiaBar;

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
			pokeInfoPanel.setText("\nEraso: " + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getAtk() + "" +  "\n"
					+ "Defentsa: " + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getDef() + "\n"
					+ "Bizia: " + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getHP() + "/" + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMaxHP() + "\n"
					+ "Mota: " + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMota());
		}
		return pokeInfoPanel;
	}
	
	private JPanel getBarrakPanel() {
		if (barrakPanel == null) {
			barrakPanel = new JPanel();
			barrakPanel.setLayout(new GridLayout(2, 1, 0, 0));
			barrakPanel.add(getHealthBar());
			barrakPanel.add(getEuforiaBar());
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
			String pokemon = "/Images/" + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getMota().toString().toLowerCase() + "_0_0.png";
			pokeSprite.setIcon(new ImageIcon(PokemonPanela.class.getResource(pokemon)));
			pokeSprite.addMouseListener(getSagua());
		}
		return pokeSprite;
	}
	
	public void aktibatuSprite() {
		if(!JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getAhulduta()) {
			pokeSprite.setEnabled(true);
		}
	}
	
	//Sagua
	private class Sagua implements MouseListener {
		
		public void mouseClicked(MouseEvent e) {
			if (e.getSource().equals(getPokeSprite()) && pokeSprite.isEnabled() && JokalariKatalogoa.getJK().getJokPos(jokPos).getTxanda() && MugimenduKudeatzailea.getMK().getPokErasotzaile()==null && !(JokalariKatalogoa.getJK().getJokPos(jokPos) instanceof Bot)) {
				MugimenduKudeatzailea.getMK().setJokErasotzaile(JokalariKatalogoa.getJK().getJokPos(jokPos));
				MugimenduKudeatzailea.getMK().setPokErasotzaile(JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos));
				pokeSprite.setEnabled(false);
			}
			else if(getPokeSprite().isEnabled() && !JokalariKatalogoa.getJK().getJokPos(jokPos).getTxanda()) {
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

	//Eguneraketa
	@Override
	public void update(Observable arg0, Object arg1) {
		pokeInfoPanel.setText("\nEraso: " + ((Pokemon)arg0).getAtk() + "" +  "\n"
				+ "Defentsa: " + ((Pokemon)arg0).getDef() + "\n"
				+ "Bizia: " + ((Pokemon)arg0).getHP() + "/" + ((Pokemon)arg0).getMaxHP() + "\n"
				+ "Mota: " + ((Pokemon)arg0).getMota());
		float bizia = (((Pokemon)arg0).getHP()*100)/((Pokemon)arg0).getMaxHP();
		healthBar.setValue((int)bizia);
		float euforia = (((Pokemon)arg0).getEgoeraI()*100)/((Pokemon)arg0).getEgoeraIMax();
		
		if (((Pokemon)arg0).getHP()==0) { //bizia 0 bada, euforia 0 izango da ere
			pokeSprite.setEnabled(false);
			euforia = 0.0f;
		}
		euforiaBar.setValue((int)euforia);
		
		
		if (bizia <= 50) {
			this.healthBar.setForeground(Color.ORANGE);
		}   
		if (bizia <= 15) {
			this.healthBar.setForeground(Color.RED);
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
		
		String pokemon = "/Images/" + ((Pokemon)arg0).getMota().toString().toLowerCase() + "_0_" + ((Pokemon)arg0).getEboluzioZenb() + ".png";
		pokeSprite.setIcon(new ImageIcon(PokemonPanela.class.getResource(pokemon)));
	}
	
}