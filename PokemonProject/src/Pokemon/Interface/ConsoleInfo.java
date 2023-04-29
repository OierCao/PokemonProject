package Pokemon.Interface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class ConsoleInfo extends JFrame {
  private JPanel readMePanel;
  
  private JTextPane readMeText;
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
          public void run() {
            try {
              ConsoleInfo frame = new ConsoleInfo();
              frame.setVisible(true);
            } catch (Exception e) {
              e.printStackTrace();
            } 
          }
        });
  }
  
  public ConsoleInfo() {
    setFont(new Font("Centaur", Font.PLAIN, 12));
    setBackground(Color.WHITE);
    setTitle("readMe");
    setBounds(200, 200,559, 600);
    this.readMePanel = new JPanel();
    this.readMePanel.setBackground(Color.WHITE);
    this.readMePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(this.readMePanel);
    readMePanel.setLayout(new BorderLayout(0, 0));
    this.readMePanel.add(getReadMeText());
    setTitle("ReadMe");
  }
  
  private JTextPane getReadMeText() {
    if (this.readMeText == null) {
      this.readMeText = new JTextPane();
      this.readMeText.setFont(new Font("Cambria", Font.PLAIN, 15));
      this.readMeText.setForeground(Color.DARK_GRAY);
      this.readMeText.setBackground(Color.WHITE);
      this.readMeText.setText("Consola erabiliz partidari buruzko informazio zehatzagoa lortu ahal duzu, gainera beheko hutsunea erabiliz komandoak exekutatu ditzakezu\n\n"
      		+ "CONSOLAKO KOMANDOAK:\n"
      		+ "INFORMAZIOA: \n"
      		+ "/weak <type> \n"
      		+ "/effective <type> \n"
      		+ "\n"
      		+ "AUDIO \n"
      		+ "/play <song>\n"
      		+ "/pause\n"
      		+ "/resume\n"
      		+ "/changevolume <0-100>\n"
      		+ "/changevolumeFx <0-100>\n"
      		+ "/mute (muteatu edo desmuteatzen du)"
      		+ "\n\n\n"
      		+ "AUKERATU DAITEZKEEN MUSIKAK:\n"
      		+ "advanced battle\n"
      		+ "blackwhite\n"
      		+ "champion\n"
      		+ "oras\n"
      		+ "platinum\n"
      		+ "xy\n"
      		
    		  );
      this.readMeText.setEditable(false);
    } 
    return this.readMeText;
  }
}
