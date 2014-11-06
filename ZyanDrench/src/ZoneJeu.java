import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;


public class ZoneJeu extends JPanel {
	
	private ArrayList<ArrayList<JButton>> tabPani = new ArrayList<ArrayList<JButton>>();
	private ArrayList<JButton> tabPanj = new ArrayList<JButton>();
	private int compteur=0;
	
	public ZoneJeu() {
		this.setLayout(new GridLayout(15, 15));
		this.setPreferredSize(new Dimension(300, 300));
		
		for(int i=0; i<15; i++){
			for(int j=0; j<15; j++){
				tabPanj.add(new caseZD(compteur));
				compteur++;
			}
			System.out.println("\n");
			tabPani.add(tabPanj);
		}
		
		for(int i=0; i<15; i++){
			for(int j=0; j<15; j++){
				this.add((tabPani.get(i)).get(j));
				System.out.print(i+"  -  ");
				System.out.println(j);
			}
		}
		this.setVisible(true);
	}
}
