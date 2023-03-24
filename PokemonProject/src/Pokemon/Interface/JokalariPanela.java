package Pokemon.Interface;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Pokemon.Model.Jokalari;
import Pokemon.Model.Pokemon;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class JokalariPanela extends JFrame {

	private ArrayList<PokemonPanela> pokemonPanelak;
	private Jokalari jokalari;
	
	private JPanel contentPane;
	private JPanel Jokalaria;
	private JPanel PokemonakPanel;
	private JButton btnNewButton;
	private JPanel JokalariArgazkiaPanel;
	private JLabel lblNewLabel;
	
	private Jokalari jok;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JokalariPanela frame = new JokalariPanela(null); //ValorRandom
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
	public JokalariPanela(Jokalari j) {
		jok=j;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getJokalaria(), BorderLayout.WEST);
		contentPane.add(getPokemonakPanel(), BorderLayout.CENTER);
		
		pokemonPanelak = new ArrayList<PokemonPanela>();
		for (Pokemon p: jokalari.getTalde().getLista()) {
			PokemonPanela PP = new PokemonPanela(jokalari, p);
			pokemonPanelak.add(PP);
			getPokemonakPanel().add(PP);
		}
	}

	private JPanel getJokalaria() {
		if (Jokalaria == null) {
			Jokalaria = new JPanel();
			Jokalaria.setLayout(new BoxLayout(Jokalaria, BoxLayout.Y_AXIS));
			Jokalaria.add(getBtnNewButton());
			Jokalaria.add(getPanel_2());
		}
		return Jokalaria;
	}
	private JPanel getPokemonakPanel() {
		if (PokemonakPanel == null) {
			PokemonakPanel = new JPanel();
			PokemonakPanel.setLayout(new GridLayout(1, jok.getTalde().getPokKop() , 0, 0));  //(w,x,y,z) w=rows, x=collums, y=hgap, z=ygap,
		}
		return PokemonakPanel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("GO");
		}
		return btnNewButton;
	}
	private JPanel getPanel_2() {
		if (JokalariArgazkiaPanel == null) {
			JokalariArgazkiaPanel = new JPanel();
			JokalariArgazkiaPanel.add(jokalariArgazkiPanel());
		}
		return JokalariArgazkiaPanel;
	}
	private JLabel jokalariArgazkiPanel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
		}
		return lblNewLabel;
	}
}
