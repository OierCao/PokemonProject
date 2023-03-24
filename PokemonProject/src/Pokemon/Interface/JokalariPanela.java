package Pokemon.Interface;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Pokemon.Model.Jokalari;
import Pokemon.Model.Pokemon;

public class JokalariPanela extends JFrame {

	private ArrayList<PokemonPanela> pokemonPanelak;
	private Jokalari jokalari;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JokalariPanela frame = new JokalariPanela();
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
	public JokalariPanela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		pokemonPanelak = new ArrayList<PokemonPanela>();
		for (Pokemon p: jokalari.getTalde().getLista()) {
			pokemonPanelak.add(new PokemonPanela(jokalari, p));
		}
	}

}
