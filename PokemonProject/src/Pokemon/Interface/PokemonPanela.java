package Pokemon.Interface;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

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

@SuppressWarnings("serial")
public class PokemonPanela extends JPanel implements Observer{
	private JProgressBar healthBar;
	private JLabel pokeSprite;
	private JTextPane pokeInfoPanel;
	private Sagua sagua=null;

	private int jokPos;
	private int pokPos;

	/**
	 * Create the panel.
	 */
	public PokemonPanela(int pJokPos, int pPokPos) {
		jokPos=pJokPos;
		pokPos=pPokPos;
		
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		add(getHealthBar(), BorderLayout.SOUTH);
		add(getPokeSprite(), BorderLayout.CENTER);
		add(getPokeInfoPanel(), BorderLayout.NORTH);
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

	private JLabel getPokeSprite() {
		if (pokeSprite == null) {
			pokeSprite = new JLabel("");
			pokeSprite.setHorizontalAlignment(SwingConstants.CENTER);
			pokeSprite.setBackground(Color.WHITE);
			String pokemon = "/Images/0" + JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().get(pokPos).getIzena().toLowerCase() + ".png";
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
			if (e.getSource().equals(getPokeSprite()) && pokeSprite.isEnabled() && JokalariKatalogoa.getJK().getJokPos(jokPos).getTxanda() && MugimenduKudeatzailea.getMK().getPokErasotzaile()==null) {
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
		int bizia = (int) (((Pokemon)arg0).getHP()*100)/((Pokemon)arg0).getMaxHP();
		healthBar.setValue(bizia);
		if (bizia <= 50) {
			this.healthBar.setForeground(Color.ORANGE);
		}   
		if (bizia <= 15) {
			this.healthBar.setForeground(Color.RED);
		}
		if (bizia==0) {
			pokeSprite.setEnabled(false);
		}
	}
}