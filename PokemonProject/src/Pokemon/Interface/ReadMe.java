package Pokemon.Interface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class ReadMe extends JFrame {
	private static ReadMe frame = null;
  private JPanel contentPane;
  
  private JTextPane txtpnFreeallAllVersus;
  
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
    setFont(new Font("Ubuntu Mono", 0, 12));
    setBackground(Color.LIGHT_GRAY);
    setTitle("readMe");
    setBounds(100, 100, 428, 586);
    this.contentPane = new JPanel();
    this.contentPane.setBackground(Color.LIGHT_GRAY);
    this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    this.contentPane.setLayout(new BorderLayout(0, 0));
    setContentPane(this.contentPane);
    this.contentPane.add(getTxtpnFreeallAllVersus(), "Center");
  }
  
  private JTextPane getTxtpnFreeallAllVersus() {
    if (this.txtpnFreeallAllVersus == null) {
      this.txtpnFreeallAllVersus = new JTextPane();
      this.txtpnFreeallAllVersus.setFont(new Font("Liberation Sans", 0, 12));
      this.txtpnFreeallAllVersus.setForeground(Color.DARK_GRAY);
      this.txtpnFreeallAllVersus.setBackground(Color.WHITE);
      this.txtpnFreeallAllVersus.setText(" PoK-Battle Arena-\n\n* free4all: all versus all game\n  * (x) players using (y) pokeach\n* pokeMons stats and types are assigned at random\n  * pokeMon types and effects\n\t* fire extra damage to grass/bug\n\t* grass extra damage to rock/water\n\t* water extra damage to fire/rock\n\t* electric extra damage to water/flying\n\t* bug extra damage to grass/phychic\n\t* psychic extra damage to fighting\n\t* fighting extra damage to rock\n\t* rock extra damage to electric/bug/fire\n\t* ghost extra damage to ghost/psychic\n\t* dragon extra damage to dragon\n\t* flying extra damage to bug/fighting/grass\n\n  * stats\n\t* att: base damage with normal attack (10-13)\n\t* def: base defense (5-9)\n\t* health: pokhealth (80-100)\n\n* wait until your turn (random across players)\n   there is a posibility to play 2,3,4 turns in a row\n   each turn you can:\n   * attack foreach of your pokeMon\n\t* damage = att*effect - def\n* evolutions\n  * your pokwill evolve at health %50 and %20 repectively\n\t   each evolution step will boost pokstats\n* charged attack\n  * pokemon will perform a charged attack when itrecieves a\n\t   determined amount of attacks \n  * when charged, pokwill gain +100 att +100 def until it\n\t   performs the charged attack\n* all attacks are executed at the moment\n* once you are done click on g@! and wait until your next turn\n\n\n");
    } 
    return this.txtpnFreeallAllVersus;
  }
}

