import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;


public class caseZD extends JButton {

	private ArrayList<String> couleurs = new ArrayList<String>(); 
	private int placeCouleur;
	
	public caseZD(int i) {
		super(i+"");
		couleurs.add("0xDA4141");
		couleurs.add("0xFF711A");
		couleurs.add("0x825A46");
		couleurs.add("0x9DE0AD");
		couleurs.add("0xF5D130");
		couleurs.add("0x00A0B0");

		Random r = new Random();
		this.placeCouleur = 1 + r.nextInt(6 - 1);
		System.out.print(placeCouleur + " - ");
		String couleurChoisi="0x"+couleurs.get(placeCouleur);
	}
	
}
