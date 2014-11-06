import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Fenetre extends JFrame 
{
	private ZoneJeu jeu = new ZoneJeu();
	private JPanel couleur = new JPanel(new GridLayout(2, 3));
	
	private JMenuBar menuBar = new JMenuBar();
	private JMenu partie = new JMenu("Partie");
	private JMenu about = new JMenu("?");

	private JMenuItem nouvellePartie = new JMenuItem("Nouvelle partie");
	private JMenuItem recommencer = new JMenuItem("Recommencer");
	private JMenuItem coups = new JMenuItem("Nombre de coups");
	private JMenuItem apropos = new JMenuItem("A propos");
	private JMenuItem contact = new JMenuItem("Contact");
	
	private Boutons rouge = new Boutons("0xDA4141");
	private Boutons orange = new Boutons("0xFF711A");
	private Boutons marron = new Boutons("0x825A46");
	private Boutons pistache = new Boutons("0x9DE0AD");
	private Boutons jaune = new Boutons("0xF5D130");
	private Boutons bleu = new Boutons("0x00A0B0");
	
	public Fenetre()
	{
		this.menuBar.add(partie);
		this.menuBar.add(about);
		
		this.partie.add(nouvellePartie);
		this.partie.add(recommencer);
		this.partie.add(coups);
		this.about.add(apropos);
		this.about.add(contact);
		
			//Appel fonction fermeture + confirmation
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				actionBoutonQuitter();
			}
		});
			//Zone de jeu
				//Affichage de la grille
		this.add(this.jeu,BorderLayout.CENTER);
		
				//Affichage des boutons
		this.add(this.couleur,BorderLayout.SOUTH);
		couleur.add(rouge);
		couleur.add(orange);
		couleur.add(marron);
		couleur.add(pistache);
		couleur.add(jaune);
		couleur.add(bleu);

		// Caractéristiques de la fenêtre
		this.pack();
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setJMenuBar(menuBar);
		this.setTitle("Zyan Drench - Adrien");
		this.setLocationRelativeTo(null);
		//this.setResizable(false);
		this.setVisible(true);
		
	}
	
		// Fonction fermeture + confirmation 
	public void actionBoutonQuitter() 
	{
		int option = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment arrêter de jouer ?", "Quitter", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (option == JOptionPane.YES_OPTION) 
		{
			System.exit(0);
		}

	}
}
