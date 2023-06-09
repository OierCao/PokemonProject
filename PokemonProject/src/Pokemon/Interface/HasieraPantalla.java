package Pokemon.Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Pokemon.Model.AudioKudeatzailea;
import Pokemon.Model.Borroka;
import Pokemon.Model.JokalariKatalogoa;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class HasieraPantalla extends JFrame implements Observer {
	private Kontroladore kontroladore=null;
	
	private JPanel panelRight;
	private JPanel panelImg;
	private JLabel ImgHas;
	private JPanel panelInfo;
	private JLabel PlayerKopLabel;
	private JLabel BotKopLabel;
	private JTextField BotKopText;
	private JLabel PokemonKopLabel;
	private JTextField PokemonKopText;
	private JLabel MillisLabel;
	private JTextField MillisText;
	private JPanel panelBottons;
	private JLabel Hutsik1;
	private JTextField PlayerKopText;
	private JButton ReadmeButton;
	private JButton PlayButton;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField BotKopMedText;
	private JTextField BotKopHardText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HasieraPantalla frame = new HasieraPantalla();
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
	public HasieraPantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 400);
		getContentPane().add(getPanelRight(), BorderLayout.EAST);
		getContentPane().add(getPanelImg(), BorderLayout.CENTER);
		Borroka.getBorroka().addObserver(this);
		setTitle("Hasiera Pantalla");
		AudioKudeatzailea.getAudioKudeatzailea().playAudio("advanced battle");
	}
	
	private JPanel getPanelRight() {
		if (panelRight == null) {
			panelRight = new JPanel();
			panelRight.setPreferredSize(new Dimension(200, 362));
			panelRight.setLayout(new GridLayout(0, 1, 0, 0));
			panelRight.add(getPanelInfo());
			panelRight.add(getPanelBottons());
		}
		return panelRight;
	}
	private JPanel getPanelImg() {
		if (panelImg == null) {
			panelImg = new JPanel();
			panelImg.setBackground(SystemColor.text);
			panelImg.setLayout(null);
			panelImg.add(getImgHas());
		}
		return panelImg;
	}
	private JLabel getImgHas() {
		if (ImgHas == null) {
			ImgHas = new JLabel("");
			ImgHas.setBounds(29, 32, 372, 248);
			ImgHas.setVerticalAlignment(SwingConstants.BOTTOM);
			ImgHas.setIcon(new ImageIcon(HasieraPantalla.class.getResource("/Images/main.png")));
		}
		return ImgHas;
	}
	private JPanel getPanelInfo() {
		if (panelInfo == null) {
			panelInfo = new JPanel();
			panelInfo.setBackground(Color.WHITE);
			GridBagLayout gbl_panelInfo = new GridBagLayout();
			gbl_panelInfo.columnWidths = new int[]{2, 0, 0};
			gbl_panelInfo.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panelInfo.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
			gbl_panelInfo.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panelInfo.setLayout(gbl_panelInfo);
			GridBagConstraints gbc_Hutsik1 = new GridBagConstraints();
			gbc_Hutsik1.insets = new Insets(0, 0, 5, 5);
			gbc_Hutsik1.gridx = 0;
			gbc_Hutsik1.gridy = 0;
			panelInfo.add(getHutsik1(), gbc_Hutsik1);
			GridBagConstraints gbc_PlayerKopLabel = new GridBagConstraints();
			gbc_PlayerKopLabel.anchor = GridBagConstraints.EAST;
			gbc_PlayerKopLabel.insets = new Insets(0, 0, 5, 5);
			gbc_PlayerKopLabel.gridx = 0;
			gbc_PlayerKopLabel.gridy = 1;
			panelInfo.add(getPlayerKopLabel(), gbc_PlayerKopLabel);
			GridBagConstraints gbc_PlayerKopText = new GridBagConstraints();
			gbc_PlayerKopText.insets = new Insets(0, 0, 5, 0);
			gbc_PlayerKopText.fill = GridBagConstraints.HORIZONTAL;
			gbc_PlayerKopText.gridx = 1;
			gbc_PlayerKopText.gridy = 1;
			panelInfo.add(getPlayerKopText(), gbc_PlayerKopText);
			GridBagConstraints gbc_BotKopLabel = new GridBagConstraints();
			gbc_BotKopLabel.anchor = GridBagConstraints.EAST;
			gbc_BotKopLabel.insets = new Insets(0, 0, 5, 5);
			gbc_BotKopLabel.gridx = 0;
			gbc_BotKopLabel.gridy = 2;
			panelInfo.add(getBotKopLabel(), gbc_BotKopLabel);
			GridBagConstraints gbc_BotKopText = new GridBagConstraints();
			gbc_BotKopText.fill = GridBagConstraints.HORIZONTAL;
			gbc_BotKopText.insets = new Insets(0, 0, 5, 0);
			gbc_BotKopText.gridx = 1;
			gbc_BotKopText.gridy = 2;
			panelInfo.add(getBotKopText(), gbc_BotKopText);
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 0;
			gbc_lblNewLabel.gridy = 3;
			panelInfo.add(getLblNewLabel(), gbc_lblNewLabel);
			GridBagConstraints gbc_BotKopMedText = new GridBagConstraints();
			gbc_BotKopMedText.insets = new Insets(0, 0, 5, 0);
			gbc_BotKopMedText.fill = GridBagConstraints.HORIZONTAL;
			gbc_BotKopMedText.gridx = 1;
			gbc_BotKopMedText.gridy = 3;
			panelInfo.add(getBotKopMedText(), gbc_BotKopMedText);
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_1.gridx = 0;
			gbc_lblNewLabel_1.gridy = 4;
			panelInfo.add(getLblNewLabel_1(), gbc_lblNewLabel_1);
			GridBagConstraints gbc_BotKopHardText = new GridBagConstraints();
			gbc_BotKopHardText.insets = new Insets(0, 0, 5, 0);
			gbc_BotKopHardText.fill = GridBagConstraints.HORIZONTAL;
			gbc_BotKopHardText.gridx = 1;
			gbc_BotKopHardText.gridy = 4;
			panelInfo.add(getBotKopHardText(), gbc_BotKopHardText);
			GridBagConstraints gbc_PokemonKopLabel = new GridBagConstraints();
			gbc_PokemonKopLabel.anchor = GridBagConstraints.EAST;
			gbc_PokemonKopLabel.insets = new Insets(0, 0, 5, 5);
			gbc_PokemonKopLabel.gridx = 0;
			gbc_PokemonKopLabel.gridy = 5;
			panelInfo.add(getPokemonKopLabel(), gbc_PokemonKopLabel);
			GridBagConstraints gbc_PokemonKopText = new GridBagConstraints();
			gbc_PokemonKopText.fill = GridBagConstraints.HORIZONTAL;
			gbc_PokemonKopText.insets = new Insets(0, 0, 5, 0);
			gbc_PokemonKopText.gridx = 1;
			gbc_PokemonKopText.gridy = 5;
			panelInfo.add(getPokemonKopText(), gbc_PokemonKopText);
			GridBagConstraints gbc_MillisLabel = new GridBagConstraints();
			gbc_MillisLabel.anchor = GridBagConstraints.EAST;
			gbc_MillisLabel.insets = new Insets(0, 0, 0, 5);
			gbc_MillisLabel.gridx = 0;
			gbc_MillisLabel.gridy = 6;
			panelInfo.add(getMillisLabel(), gbc_MillisLabel);
			GridBagConstraints gbc_MillisText = new GridBagConstraints();
			gbc_MillisText.fill = GridBagConstraints.HORIZONTAL;
			gbc_MillisText.gridx = 1;
			gbc_MillisText.gridy = 6;
			panelInfo.add(getMillisText(), gbc_MillisText);
		}
		return panelInfo;
	}
	private JLabel getPlayerKopLabel() {
		if (PlayerKopLabel == null) {
			PlayerKopLabel = new JLabel("Players");
			PlayerKopLabel.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return PlayerKopLabel;
	}
	private JLabel getBotKopLabel() {
		if (BotKopLabel == null) {
			BotKopLabel = new JLabel("Bot (easy)");
			BotKopLabel.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return BotKopLabel;
	}
	private JTextField getBotKopText() {
		if (BotKopText == null) {
			BotKopText = new JTextField();
			BotKopText.setText("1");
			BotKopText.setColumns(10);
		}
		return BotKopText;
	}
	private JLabel getPokemonKopLabel() {
		if (PokemonKopLabel == null) {
			PokemonKopLabel = new JLabel("Pokemon");
			PokemonKopLabel.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return PokemonKopLabel;
	}
	private JTextField getPokemonKopText() {
		if (PokemonKopText == null) {
			PokemonKopText = new JTextField();
			PokemonKopText.setText("3");
			PokemonKopText.setColumns(10);
		}
		return PokemonKopText;
	}
	private JLabel getMillisLabel() {
		if (MillisLabel == null) {
			MillisLabel = new JLabel("Denbora (ms)");
			MillisLabel.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return MillisLabel;
	}
	private JTextField getMillisText() {
		if (MillisText == null) {
			MillisText = new JTextField();
			MillisText.setText("2000");
			MillisText.setColumns(10);
		}
		return MillisText;
	}
	private JPanel getPanelBottons() {
		if (panelBottons == null) {
			panelBottons = new JPanel();
			panelBottons.setLayout(null);
			panelBottons.setBackground(Color.WHITE);
			panelBottons.add(getReadmeButton());
			panelBottons.add(getPlayButton());
		}
		return panelBottons;
	}
	private JLabel getHutsik1() {
		if (Hutsik1 == null) {
			Hutsik1 = new JLabel("Hutsik");
			Hutsik1.setForeground(SystemColor.text);
		}
		return Hutsik1;
	}
	private JTextField getPlayerKopText() {
		if (PlayerKopText == null) {
			PlayerKopText = new JTextField();
			PlayerKopText.setText("1");
			PlayerKopText.setColumns(10);
		}
		return PlayerKopText;
	}
	private JButton getReadmeButton() {
		if (ReadmeButton == null) {
			ReadmeButton = new JButton("Readme");
			ReadmeButton.setBounds(50, 48, 100, 21);
			ReadmeButton.addActionListener(getKontroladore());
		}
		return ReadmeButton;
	}
	private JButton getPlayButton() {
		if (PlayButton == null) {
			PlayButton = new JButton("PLAY!");
			PlayButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
			PlayButton.setBounds(50, 79, 100, 33);
			PlayButton.addActionListener(getKontroladore());
		}
		return PlayButton;
	}
	
	//Kontroladorea
	private class Kontroladore implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(PlayButton)) {
				Borroka.getBorroka().hasieraketak(Integer.parseInt(PlayerKopText.getText()), Integer.parseInt(BotKopText.getText()), Integer.parseInt(BotKopMedText.getText()), Integer.parseInt(BotKopHardText.getText()), Integer.parseInt(PokemonKopText.getText()), Integer.parseInt(MillisText.getText()) );
				setVisible(false);
				new Console().setVisible(true);
				AudioKudeatzailea.getAudioKudeatzailea().playEffect("button");
				AudioKudeatzailea.getAudioKudeatzailea().playAudio("random");
			}
			else {
				new ReadMe().setVisible(true);
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
	public void update(Observable arg0, Object arg1) {
		if ((int)arg1!=-1) {
			JokalariPanela jp = new JokalariPanela((int)arg1);
			JokalariKatalogoa.getJK().getJokPos((int)arg1).addObserver(jp);
			jp.setVisible(true);
		}
	
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Bot (medium)");
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Bot (hard)");
		}
		return lblNewLabel_1;
	}
	private JTextField getBotKopMedText() {
		if (BotKopMedText == null) {
			BotKopMedText = new JTextField();
			BotKopMedText.setText("0");
			BotKopMedText.setColumns(10);
		}
		return BotKopMedText;
	}
	private JTextField getBotKopHardText() {
		if (BotKopHardText == null) {
			BotKopHardText = new JTextField();
			BotKopHardText.setText("0");
			BotKopHardText.setColumns(10);
		}
		return BotKopHardText;
	}
}
