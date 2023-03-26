package Pokemon.Interface;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

import Pokemon.Model.Jokalari;
import Pokemon.Model.Pokemon;
import Pokemon.Model.PokemonKatalogoa;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class PokemonPanela extends JPanel {
	private JProgressBar healthBar;
	private JLabel pokeSprite;
	private JTextPane pokeInfoPanel;

	private Jokalari jok;
	private Pokemon pok;
	private int maxHP;

	/**
	 * Create the panel.
	 */
	public PokemonPanela(Jokalari pJok, Pokemon pPok) {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		add(getHealthBar(), BorderLayout.SOUTH);
		add(getPokeSprite(), BorderLayout.CENTER);
		add(getTextPane_1(), BorderLayout.NORTH);
		jok=pJok;
		pok=pPok;
		maxHP=pok.getHP();
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

	private JTextPane getTextPane_1() {
		if (pokeInfoPanel == null) {
			pokeInfoPanel = new JTextPane();
			pokeInfoPanel.setBounds(0, 0, 100, 100);
			pokeInfoPanel.setFont(new Font("Tahoma", Font.PLAIN, 12));
			pokeInfoPanel.setBackground(Color.WHITE);
			pokeInfoPanel.setText("\nEraso: " + pok.getAtk() + "" +  "\n"
					+ "Defentsa: " + pok.getDef() + "\n"
					+ "Bizaia: " + pok.getHP() + "/" + maxHP + "\n"
					+ "Mota: " + pok.getMota());
		}
		return pokeInfoPanel;
	}

	private JLabel getPokeSprite() {
		if (pokeSprite == null) {
			pokeSprite = new JLabel("");
			pokeSprite.setHorizontalAlignment(SwingConstants.CENTER);
			pokeSprite.setBackground(Color.WHITE);
			String pokemon = "/Images/0bulbasaur.png";
			pokeSprite.setIcon(new ImageIcon(PokemonPanela.class.getResource(pokemon)));
		}
		return pokeSprite;
	}
}