package main;

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
	 * Create a windows with name "BoulderDash" , with a size of 1080x1080 , and button for Close the window 
	 */
		public Main(){
		JFrame screen = new  JFrame("BoulderDash");
		screen.add(new Pannel());
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen.setSize(1080, 1080);
		screen.setLocationRelativeTo(null);
		screen.setResizable(false);
		screen.setVisible(true);
	}

}
