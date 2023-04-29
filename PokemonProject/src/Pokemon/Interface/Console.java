package Pokemon.Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Pokemon.Model.Borroka;
import Pokemon.Model.ConsoleKudeatzailea;
import Pokemon.Model.MugimenduKudeatzailea;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import java.awt.Font;

public class Console extends JFrame implements Observer{
	private KontroladoreConsole nKontroladoreConsole=null;
	
	private JPanel contentPane;
	private JPanel panel_north;
	private JPanel panel_mid;
	private JLabel lblNewLabel;
	private JLabel Terminal_icon;
	private JPanel panel_south;
	private JButton exButton;
	private JTextField commandTextField;
	private JButton InfoButton;
	private JPanel spacePanel;
	private JTextArea textArea;
	private JPanel panel;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Console frame = new Console();
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
	public Console() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel_north(), BorderLayout.NORTH);
		contentPane.add(getPanel_mid(), BorderLayout.CENTER);
		contentPane.add(getPanel_1_1(), BorderLayout.SOUTH);
		
		ConsoleKudeatzailea.getCK().addObserver(this);
		MugimenduKudeatzailea.getMK().addObserver(this);
		Borroka.getBorroka().addObserver(this);
	}

	private JPanel getPanel_north() {
		if (panel_north == null) {
			panel_north = new JPanel();
			GridBagLayout gbl_panel_north = new GridBagLayout();
			gbl_panel_north.columnWidths = new int[]{32, 32, 32, 32, 0, 32, 32, 0, 32, 0, 0, 32, 0, 0, 0};
			gbl_panel_north.rowHeights = new int[]{25, 0};
			gbl_panel_north.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel_north.rowWeights = new double[]{1.0, Double.MIN_VALUE};
			panel_north.setLayout(gbl_panel_north);
			GridBagConstraints gbc_spacePanel = new GridBagConstraints();
			gbc_spacePanel.fill = GridBagConstraints.BOTH;
			gbc_spacePanel.insets = new Insets(0, 0, 0, 5);
			gbc_spacePanel.gridx = 2;
			gbc_spacePanel.gridy = 0;
			panel_north.add(getSpacePanel(), gbc_spacePanel);
			GridBagConstraints gbc_Terminal_icon = new GridBagConstraints();
			gbc_Terminal_icon.fill = GridBagConstraints.BOTH;
			gbc_Terminal_icon.insets = new Insets(0, 0, 0, 5);
			gbc_Terminal_icon.gridx = 6;
			gbc_Terminal_icon.gridy = 0;
			panel_north.add(getTerminal_icon(), gbc_Terminal_icon);
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
			gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
			gbc_lblNewLabel.gridx = 7;
			gbc_lblNewLabel.gridy = 0;
			panel_north.add(getLblNewLabel(), gbc_lblNewLabel);
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.insets = new Insets(0, 0, 0, 5);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 10;
			gbc_panel.gridy = 0;
			panel_north.add(getPanel(), gbc_panel);
			GridBagConstraints gbc_InfoButton = new GridBagConstraints();
			gbc_InfoButton.fill = GridBagConstraints.BOTH;
			gbc_InfoButton.gridx = 13;
			gbc_InfoButton.gridy = 0;
			panel_north.add(getInfoButton(), gbc_InfoButton);
		}
		return panel_north;
	}
	private JPanel getPanel_mid() {
		if (panel_mid == null) {
			panel_mid = new JPanel();
			panel_mid.setLayout(new BorderLayout(0, 0));
			panel_mid.add(getTextArea(), BorderLayout.CENTER);
		}
		return panel_mid;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Console");
			lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 11));
		}
		return lblNewLabel;
	}
	private JLabel getTerminal_icon() {
		if (Terminal_icon == null) {
			Terminal_icon = new JLabel("");
			Terminal_icon.setIcon(new ImageIcon(Console.class.getResource("/Images/console_icon_mini.png")));
		}
		return Terminal_icon;
	}
	private JPanel getPanel_1_1() {
		if (panel_south == null) {
			panel_south = new JPanel();
			GridBagLayout gbl_panel_south = new GridBagLayout();
			gbl_panel_south.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panel_south.rowHeights = new int[]{0, 0};
			gbl_panel_south.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel_south.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panel_south.setLayout(gbl_panel_south);
			GridBagConstraints gbc_commandTextField = new GridBagConstraints();
			gbc_commandTextField.gridwidth = 12;
			gbc_commandTextField.insets = new Insets(0, 0, 0, 5);
			gbc_commandTextField.fill = GridBagConstraints.HORIZONTAL;
			gbc_commandTextField.gridx = 0;
			gbc_commandTextField.gridy = 0;
			panel_south.add(getCommandTextField(), gbc_commandTextField);
			GridBagConstraints gbc_exButton = new GridBagConstraints();
			gbc_exButton.anchor = GridBagConstraints.EAST;
			gbc_exButton.gridx = 12;
			gbc_exButton.gridy = 0;
			panel_south.add(getExButton(), gbc_exButton);
		}
		return panel_south;
	}
	private JButton getExButton() {
		if (exButton == null) {
			exButton = new JButton("Ex");
			exButton.addActionListener(getKontroladore());
		}
		return exButton;
	}
	private JTextField getCommandTextField() {
		if (commandTextField == null) {
			commandTextField = new JTextField();
			commandTextField.setColumns(10);
		}
		return commandTextField;
	}
		
	private JButton getInfoButton() {
		if (InfoButton == null) {
			InfoButton = new JButton("?");
			InfoButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			InfoButton.addActionListener(getKontroladore());
		}
		return InfoButton;
	}
	
	private JPanel getSpacePanel() {
		if (spacePanel == null) {
			spacePanel = new JPanel();
		}
		return spacePanel;
	}
	
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setFont(new Font("Consolas", Font.PLAIN, 11));
		}
		return textArea;
	}
	
	
	//Kontroladorea
	private class KontroladoreConsole implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(exButton)) {
				if (commandTextField.getText().startsWith("/")) {
					if(commandTextField.getText().equals("/clear")) {textArea.setText("");}
					else {
						ConsoleKudeatzailea.getCK().runCommand(commandTextField.getText());
					}
					
				}
				else { addScreenText(commandTextField.getText()); }
				
				}
			else {
				new ConsoleInfo().setVisible(true);
			}
		}
	}
	private KontroladoreConsole getKontroladore() {
		if (nKontroladoreConsole == null) {
			nKontroladoreConsole = new KontroladoreConsole();
		}
		return nKontroladoreConsole;
	}
	
	
	private void addScreenText(String pText) {
		String[] lines = pText.split("\n");
		int pTextLerroKop=lines.length;
		textArea.append(pText + "\n");
		System.out.println(textArea.getLineCount());
		while(textArea.getLineCount()>=25) {
			String newText=textArea.getText().substring(textArea.getText().indexOf("\n")+ pTextLerroKop);
			textArea.setText(newText);
			}
			
		}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof MugimenduKudeatzailea){
			this.addScreenText(((MugimenduKudeatzailea)o).getPokErasotzaile().getIzena() + " pokemonarekin " + arg.toString() + " dmg egin dio " + ((MugimenduKudeatzailea)o).getJokErasotua().getIzena() + "-ren " + ((MugimenduKudeatzailea)o).getPokErasotua().getIzena() + "-ri");
		}
		else if (o instanceof ConsoleKudeatzailea) {
			if(arg!=null) {
				addScreenText(arg.toString());
				System.out.println("Update");
			}
		}
		else if (o instanceof Borroka) {
			this.addScreenText("\n" + Borroka.getBorroka().getOraingoJok().getIzena() + ":");
		}
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
		}
		return panel;
	}
}


	
