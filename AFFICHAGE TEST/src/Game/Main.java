package Game;

import javax.swing.*;
/**
 * 
 * @author dimitri,anthony,alexis,florian
 *
 */


public class Main {
/**
 *  Start the program
 * @param args arguments
 */
	public static void main(String[] args) {
		/**
		 * Start the Method Main
		 */
		new Main();
		
	}
	/**
	 * Create a windows with name Game , size 1080 , and button for Close the window 
	 */
		public Main(){
		JFrame fenetre = new  JFrame("Jeu");
		fenetre.add(new Panneau());
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(1080, 1080);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setVisible(true);
		
	}

}
