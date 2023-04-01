package Pokemon.Interface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class ReadMe extends JFrame {
  private JPanel readMePanel;
  
  private JTextPane readMeText;
  
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
    setBounds(200, 200,559, 326);
    this.readMePanel = new JPanel();
    this.readMePanel.setBackground(Color.WHITE);
    this.readMePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
    this.readMePanel.setLayout(new BorderLayout(0, 0));
    setContentPane(this.readMePanel);
    this.readMePanel.add(getReadMeText(), "Center");
    setTitle("ReadMe");
  }
  
  private JTextPane getReadMeText() {
    if (this.readMeText == null) {
      this.readMeText = new JTextPane();
      this.readMeText.setFont(new Font("Cambria", Font.PLAIN, 15));
      this.readMeText.setForeground(Color.DARK_GRAY);
      this.readMeText.setBackground(Color.WHITE);
      this.readMeText.setText("Ongi etorri gure jokura!\n\n"
      		+ "Hasteko jakin beharreko batzuk:\n\n"
      		+ "·Jokalari bakoitzaren pokemonak eta hauen atributuak ausaz aukeratuko dira.\n"
      		+ "·Pokemonen atributuak:\n"
      		+ "	·Bizia: 200-220\n"
      		+ "	·Eraso: 12-18\n"
      		+ "	·Defentsa: 4-7\n"
      		+ "·Pokemon moten abantailak:\n"
      		+ "	·Sua min gehiago belarrari\n"
      		+ "	·Ura min gehiago suari\n"
      		+ "	·Elektrikoa min gehiago urari\n"
      		+ "	·Belarra min gehiago elektrikoari");
      this.readMeText.setEditable(false);
    } 
    return this.readMeText;
  }
}

