package Pokemon.Interface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

@SuppressWarnings("serial")
public class ReadMe extends JFrame {
  private JPanel readMePanel;
  
  private JTextPane readMeText;
  private JLabel tablaTiposImg;
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
          public void run() {
            try {
              ReadMe frame = new ReadMe();
              frame.setVisible(true);
            } catch (Exception e) {
              e.printStackTrace();
            } 
          }
        });
  }
  
  public ReadMe() {
    setFont(new Font("Centaur", Font.PLAIN, 12));
    setBackground(Color.WHITE);
    setTitle("readMe");
    setBounds(200, 200,539, 670);
    this.readMePanel = new JPanel();
    this.readMePanel.setBackground(Color.WHITE);
    this.readMePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(this.readMePanel);
    GridBagLayout gbl_readMePanel = new GridBagLayout();
    gbl_readMePanel.columnWidths = new int[]{515, 0};
    gbl_readMePanel.rowHeights = new int[]{204, 311, 0};
    gbl_readMePanel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
    gbl_readMePanel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
    readMePanel.setLayout(gbl_readMePanel);
    GridBagConstraints gbc_readMeText = new GridBagConstraints();
    gbc_readMeText.fill = GridBagConstraints.BOTH;
    gbc_readMeText.insets = new Insets(0, 0, 5, 0);
    gbc_readMeText.gridx = 0;
    gbc_readMeText.gridy = 0;
    this.readMePanel.add(getReadMeText(), gbc_readMeText);
    GridBagConstraints gbc_tablaTiposImg = new GridBagConstraints();
    gbc_tablaTiposImg.fill = GridBagConstraints.BOTH;
    gbc_tablaTiposImg.gridx = 0;
    gbc_tablaTiposImg.gridy = 1;
    readMePanel.add(getTablaTiposImg(), gbc_tablaTiposImg);
    setTitle("ReadMe");
  }
  
  private JTextPane getReadMeText() {
    if (this.readMeText == null) {
      this.readMeText = new JTextPane();
      this.readMeText.setFont(new Font("Cambria", Font.PLAIN, 15));
      this.readMeText.setForeground(Color.DARK_GRAY);
      this.readMeText.setBackground(Color.WHITE);
      this.readMeText.setText("Ongi etorri gure jokura!\r\n\r\nHasteko jakin beharreko batzuk:\r\n\r\n\u00B7Jokalari bakoitzaren pokemonak eta hauen atributuak ausaz aukeratuko dira.\r\n\u00B7Pokemonen atributuak:\r\n\t\u00B7Bizia: 200-220\r\n\t\u00B7Eraso: 12-18\r\n\t\u00B7Defentsa: 4-7\r\n\u00B7Pokemon moten tabla:");
      this.readMeText.setEditable(false);
    } 
    return this.readMeText;
  }
	private JLabel getTablaTiposImg() {
		if (tablaTiposImg == null) {
			tablaTiposImg = new JLabel("");
			tablaTiposImg.setIcon(new ImageIcon(ReadMe.class.getResource("/Images/TablaTiposPokemon.png")));
		}
		return tablaTiposImg;
	}
}

