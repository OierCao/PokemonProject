package Pokemon.Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class HasieraPantalla extends JFrame {
	private JPanel panel;
	private JPanel panel_1;
	private JLabel ImgHas;
	private JPanel panel_2_1;
	private JLabel PlayerKopLabel;
	private JLabel BotKopLabel;
	private JTextField BotKopText;
	private JLabel PokemonKopLabel;
	private JTextField PokemonKopText;
	private JLabel MillisLabel;
	private JTextField MillisText;
	private JPanel panel_4_1;
	private JLabel Hutsik1;
	private JTextField PlayerKopText;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

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
		setBounds(100, 100, 649, 348);
		getContentPane().add(getPanel(), BorderLayout.EAST);
		getContentPane().add(getPanel_1(), BorderLayout.CENTER);
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(200, 362));
			panel.setLayout(new GridLayout(0, 1, 0, 0));
			panel.add(getPanel_2_1());
			panel.add(getPanel_4_1());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBackground(SystemColor.text);
			panel_1.setLayout(null);
			panel_1.add(getImgHas());
		}
		return panel_1;
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
	private JPanel getPanel_2_1() {
		if (panel_2_1 == null) {
			panel_2_1 = new JPanel();
			panel_2_1.setBackground(Color.WHITE);
			GridBagLayout gbl_panel_2_1 = new GridBagLayout();
			gbl_panel_2_1.columnWidths = new int[]{2, 0, 0};
			gbl_panel_2_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
			gbl_panel_2_1.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
			gbl_panel_2_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel_2_1.setLayout(gbl_panel_2_1);
			GridBagConstraints gbc_Hutsik1 = new GridBagConstraints();
			gbc_Hutsik1.insets = new Insets(0, 0, 5, 5);
			gbc_Hutsik1.gridx = 0;
			gbc_Hutsik1.gridy = 0;
			panel_2_1.add(getHutsik1(), gbc_Hutsik1);
			GridBagConstraints gbc_PlayerKopLabel = new GridBagConstraints();
			gbc_PlayerKopLabel.anchor = GridBagConstraints.EAST;
			gbc_PlayerKopLabel.insets = new Insets(0, 0, 5, 5);
			gbc_PlayerKopLabel.gridx = 0;
			gbc_PlayerKopLabel.gridy = 1;
			panel_2_1.add(getPlayerKopLabel(), gbc_PlayerKopLabel);
			GridBagConstraints gbc_PlayerKopText = new GridBagConstraints();
			gbc_PlayerKopText.insets = new Insets(0, 0, 5, 0);
			gbc_PlayerKopText.fill = GridBagConstraints.HORIZONTAL;
			gbc_PlayerKopText.gridx = 1;
			gbc_PlayerKopText.gridy = 1;
			panel_2_1.add(getPlayerKopText(), gbc_PlayerKopText);
			GridBagConstraints gbc_BotKopLabel = new GridBagConstraints();
			gbc_BotKopLabel.anchor = GridBagConstraints.EAST;
			gbc_BotKopLabel.insets = new Insets(0, 0, 5, 5);
			gbc_BotKopLabel.gridx = 0;
			gbc_BotKopLabel.gridy = 2;
			panel_2_1.add(getBotKopLabel(), gbc_BotKopLabel);
			GridBagConstraints gbc_BotKopText = new GridBagConstraints();
			gbc_BotKopText.fill = GridBagConstraints.HORIZONTAL;
			gbc_BotKopText.insets = new Insets(0, 0, 5, 0);
			gbc_BotKopText.gridx = 1;
			gbc_BotKopText.gridy = 2;
			panel_2_1.add(getBotKopText(), gbc_BotKopText);
			GridBagConstraints gbc_PokemonKopLabel = new GridBagConstraints();
			gbc_PokemonKopLabel.anchor = GridBagConstraints.EAST;
			gbc_PokemonKopLabel.insets = new Insets(0, 0, 5, 5);
			gbc_PokemonKopLabel.gridx = 0;
			gbc_PokemonKopLabel.gridy = 3;
			panel_2_1.add(getPokemonKopLabel(), gbc_PokemonKopLabel);
			GridBagConstraints gbc_PokemonKopText = new GridBagConstraints();
			gbc_PokemonKopText.fill = GridBagConstraints.HORIZONTAL;
			gbc_PokemonKopText.insets = new Insets(0, 0, 5, 0);
			gbc_PokemonKopText.gridx = 1;
			gbc_PokemonKopText.gridy = 3;
			panel_2_1.add(getPokemonKopText(), gbc_PokemonKopText);
			GridBagConstraints gbc_MillisLabel = new GridBagConstraints();
			gbc_MillisLabel.anchor = GridBagConstraints.EAST;
			gbc_MillisLabel.insets = new Insets(0, 0, 5, 5);
			gbc_MillisLabel.gridx = 0;
			gbc_MillisLabel.gridy = 4;
			panel_2_1.add(getMillisLabel(), gbc_MillisLabel);
			GridBagConstraints gbc_MillisText = new GridBagConstraints();
			gbc_MillisText.insets = new Insets(0, 0, 5, 0);
			gbc_MillisText.fill = GridBagConstraints.HORIZONTAL;
			gbc_MillisText.gridx = 1;
			gbc_MillisText.gridy = 4;
			panel_2_1.add(getMillisText(), gbc_MillisText);
		}
		return panel_2_1;
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
			BotKopLabel = new JLabel("Bot");
			BotKopLabel.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return BotKopLabel;
	}
	private JTextField getBotKopText() {
		if (BotKopText == null) {
			BotKopText = new JTextField();
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
			MillisText.setColumns(10);
		}
		return MillisText;
	}
	private JPanel getPanel_4_1() {
		if (panel_4_1 == null) {
			panel_4_1 = new JPanel();
			panel_4_1.setLayout(null);
			panel_4_1.setBackground(Color.WHITE);
			panel_4_1.add(getBtnNewButton());
			panel_4_1.add(getBtnNewButton_1());
		}
		return panel_4_1;
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
			PlayerKopText.setColumns(10);
		}
		return PlayerKopText;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Readme");
			btnNewButton.setBounds(50, 48, 100, 21);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("PLAY!");
			btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNewButton_1.setBounds(50, 79, 100, 33);
		}
		return btnNewButton_1;
	}
}
