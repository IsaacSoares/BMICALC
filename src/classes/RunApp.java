package classes;

import java.awt.Color;

import javax.swing.JFrame;

public class RunApp {

	public static void main(String[] args) {
		
		Janela jn= new Janela(); 
		jn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jn.getContentPane().setBackground(Color.white);
		
		
		jn.setSize(275,360);
		jn.setLocationRelativeTo(null);
		jn.setResizable(false);
		jn.setVisible(true);

		
	}

}
