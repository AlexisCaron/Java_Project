package Game;

import javax.swing.*;



public class Main {

	public static void main(String[] args) {
		new Main();
		
	}
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
