package Game;

import javax.swing.*;



public class Main {

	public static void main(String[] args) {
		new Main();
		
	}
		public Main(){
		JFrame fenetre = new  JFrame("BoulerDash");
		fenetre.add(new Panneau());
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(1080, 1080);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setVisible(true);
	}

}
