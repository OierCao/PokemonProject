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
	private JProgressBar progressBar;
	private JLabel lblNewLabel;
	private JTextPane textPane;
	
	private Jokalari jok;
	private Pokemon pok;
	private int maxHP;

	/**
	 * Create the panel.
	 */
	public PokemonPanela(Jokalari pJok, Pokemon pPok) {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		add(getProgressBar(), BorderLayout.SOUTH);
		add(getLblNewLabel(), BorderLayout.CENTER);
		add(getTextPane_1(), BorderLayout.NORTH);
		jok=pJok;
		pok=PokemonKatalogoa.getPK().getLista().getRandomEzAhulduta();//pPok;
		maxHP=pok.getHP();
	}

	private JProgressBar getProgressBar() {
		if (this.progressBar == null) {
		      this.progressBar = new JProgressBar();
		      progressBar.setEnabled(false);
		      this.progressBar.setStringPainted(true);
		      this.progressBar.setString("BIZIA");
		      this.progressBar.setForeground(new Color(138, 226, 52));
		      this.progressBar.setValue(100);
		    } 
		    return this.progressBar;
	}
	
	private JTextPane getTextPane_1() {
		if (textPane == null) {
			textPane = new JTextPane();
			textPane.setBounds(0, 0, 100, 100);
			textPane.setFont(new Font("Tahoma", Font.PLAIN, 12));
			textPane.setBackground(Color.WHITE);
			textPane.setText("\nEraso: " + pok.getAtk() + "" +  "\n"
					+ "Defentsa: " + pok.getDef() + "\n"
					+ "Bizaia: " + pok.getHP() + "/" + maxHP + "\n"
					+ "Mota: " + pok.getMota());
		}
		return textPane;
	}
	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBackground(Color.WHITE);
			String pokemon = "/Images/" + 0 + pok.getIzena() + ".png";
			lblNewLabel.setIcon(new ImageIcon(PokemonPanela.class.getResource(pokemon)));
		}
		return lblNewLabel;
	}
}
