package Pokemon.Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Pokemon.Model.Borroka;
import Pokemon.Model.Bot;
import Pokemon.Model.Jokalari;
import Pokemon.Model.JokalariKatalogoa;
import Pokemon.Model.MugimenduKudeatzailea;
import Pokemon.Model.Pokemon;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class JokalariPanela extends JFrame implements Observer{

	private Kontroladore kontroladore=null;
	private ArrayList<PokemonPanela> pokemonPanelak;
	private int jokPos;
	
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
					JokalariPanela frame = new JokalariPanela(0);
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
	public JokalariPanela(int pJokPos) {
		
		jokPos=pJokPos;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getTrainerPanel(), BorderLayout.WEST);
		contentPane.add(getPokeTeamPanel(), BorderLayout.CENTER);
		
		pokemonPanelak = new ArrayList<PokemonPanela>();
		int i=0;
		for (Pokemon p: JokalariKatalogoa.getJK().getJokPos(pJokPos).getTalde()) {
			PokemonPanela PP = new PokemonPanela(jokPos, i);
			pokemonPanelak.add(PP);
			getPokeTeamPanel().add(PP);
			p.addObserver(PP);
			i++;
		}
		setBounds(100, 100, 100+140*pokemonPanelak.size(), 450);
		setTitle(JokalariKatalogoa.getJK().getJokPos(pJokPos).getIzena());
	}
	public ArrayList<PokemonPanela> getPokePanelak(){
		return pokemonPanelak;
	}
	
	public JPanel getPokeTeamPanel() {
		if (pokeTeamPanel == null) {
			pokeTeamPanel = new JPanel();
			pokeTeamPanel.setLayout(new GridLayout(1, JokalariKatalogoa.getJK().getJokPos(jokPos).getTalde().size() , 0, 0));  //(w,x,y,z) w=rows, x=collums, y=hgap, z=ygap,
		}
		return pokeTeamPanel;
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
			skipButton.addActionListener(getKontroladore());
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
	
	private class Kontroladore implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(skipButton) && JokalariKatalogoa.getJK().getJokPos(jokPos).getTxanda() && !(JokalariKatalogoa.getJK().getJokPos(jokPos) instanceof Bot)) {
				for(PokemonPanela PP: pokemonPanelak) {
					PP.aktibatuSprite();
					PP.aktibatuBotoiak();
				}
				MugimenduKudeatzailea.getMK().setNull();
				Borroka.getBorroka().partida();
			}
		}
	}
	
	private Kontroladore getKontroladore() {
		if (kontroladore == null) {
			kontroladore = new Kontroladore();
		}
		return kontroladore;
	}

	//Eguneraketa
	@Override
	public void update(Observable arg0, Object arg) {
		if (Borroka.getBorroka().getIrabazale()==null) {
			if (!((Jokalari)arg0).getBizirik()) {
				skipButton.setText("Defeated.");
				skipButton.setBackground(Color.RED);
			}
			else if (((Jokalari)arg0).getTxanda()) {
				skipButton.setText("Jokatu!");
				skipButton.setBackground(Color.GREEN);
			}
			else {
				skipButton.setText("Wait.");
				skipButton.setBackground(Color.YELLOW);
			}
		}
		else {
			if (Borroka.getBorroka().getIrabazale().equals(((Jokalari)arg0))) {
				skipButton.setText("Irabazlea!!!");
				for(PokemonPanela PP: pokemonPanelak) {
					PP.aktibatuSprite();
					PP.aktibatuBotoiak();
				}
				skipButton.setBackground(Color.MAGENTA);
			}
		}
		
		
	}
	
}
