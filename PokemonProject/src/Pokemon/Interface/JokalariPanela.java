package Pokemon.Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Pokemon.Model.Borroka;
import Pokemon.Model.Jokalari;
import Pokemon.Model.Pokemon;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.GridLayout;

public class JokalariPanela extends JFrame implements Observer{

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
		
		jok=pJok;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getTrainerPanel(), BorderLayout.WEST);
		contentPane.add(getPokeTeamPanel(), BorderLayout.CENTER);
		
		pokemonPanelak = new ArrayList<PokemonPanela>();
		System.out.println("Que aproveche");
		for (Pokemon p: jok.getTalde().getLista()) {
			System.out.println(p.getIzena());
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
			skipButton = new JButton("");
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

	@Override
	public void update(Observable o, Object arg) {
		Jokalari j = (Jokalari)arg;
		System.out.println("Ha llegado");
		if (Borroka.getBorroka().getIrabazale()==null) {
			if (!j.getBizirik()) {
				skipButton.setText("Defeated");
			}
			else if (j.getTxanda()) {
				skipButton.setText("Jokatu!");
			}
			else {
				skipButton.setText("Wait");
			}
		}
		else {
			if (Borroka.getBorroka().getIrabazale().equals(j)) {
				skipButton.setText("Irabazlea!!!");
			}
		}
		
		
	}
	public JPanel getPokeTeamPanel() {
		if (pokeTeamPanel == null) {
			pokeTeamPanel = new JPanel();
			pokeTeamPanel.setLayout(new GridLayout(1, jok.getTalde().getPokKop() , 0, 0));  //(w,x,y,z) w=rows, x=collums, y=hgap, z=ygap,
		}
		return pokeTeamPanel;
	}
}
