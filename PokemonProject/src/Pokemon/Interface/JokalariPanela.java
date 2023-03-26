package Pokemon.Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Pokemon.Model.Jokalari;
import Pokemon.Model.Pokemon;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.CardLayout;

public class JokalariPanela extends JFrame {

	private ArrayList<PokemonPanela> pokemonPanelak;
	private Jokalari jok;
	
	private JPanel contentPane;
	private JPanel trainerPanel;
	private JButton skipButton;
	private JLabel trainerSprite;
	private JPanel pokeTeamPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JokalariPanela frame = new JokalariPanela(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JokalariPanela(Jokalari pJok) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getTrainerPanel(), BorderLayout.WEST);
		contentPane.add(getPokeTeamPanel(), BorderLayout.CENTER);
		
		jok=pJok;
		pokemonPanelak = new ArrayList<PokemonPanela>();
		for (Pokemon p: jok.getTalde().getLista()) {
			PokemonPanela PP = new PokemonPanela(jok, p);
			pokemonPanelak.add(PP);
			getPokeTeamPanel().add(PP);
		}
	}
	private JPanel getTrainerPanel() {
		if (trainerPanel == null) {
			trainerPanel = new JPanel();
			trainerPanel.setBackground(Color.WHITE);
			trainerPanel.setLayout(new BorderLayout(0, 0));
			trainerPanel.add(getSkipButton(), BorderLayout.NORTH);
			trainerPanel.add(getTrainerSprite(), BorderLayout.CENTER);
		}
		return trainerPanel;
	}
	private JButton getSkipButton() {
		if (skipButton == null) {
			skipButton = new JButton("SKIP TURN");
		}
		return skipButton;
	}
	private JLabel getTrainerSprite() {
		if (trainerSprite == null) {
			trainerSprite = new JLabel("");
			Random r = new Random();
			trainerSprite.setIcon(new ImageIcon(JokalariPanela.class.getResource("/Images/trainer" + r.nextInt(5) + ".png")));
		}
		return trainerSprite;
	}
	private JPanel getPokeTeamPanel() {
		if (pokeTeamPanel == null) {
			pokeTeamPanel = new JPanel();
			pokeTeamPanel.setLayout(new CardLayout(0, 0));
		}
		return pokeTeamPanel;
	}
}
