import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;


public class Boutons extends JButton 
{
	//private String couleur;
	private int width;
	private int height;
	
	Boutons(String color)
	{
		//this.couleur=color;
		this.width=100;
		this.height=100;
		this.setPreferredSize(new Dimension(width, height));
		this.setBackground(Color.decode(color));
	}
}
