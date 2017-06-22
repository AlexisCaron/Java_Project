package Game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {
	
	private static int Move;

	public static int getMove() {
		return Move;
	}

	public static void setMove(int move) {
		Move = move;
	}




	private int tileX, tileY;
	
	private Image player; 
	
	public Player(){
		
		
		ImageIcon img = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Character.png");
		player = img.getImage();
		
		
	
		tileX = 1;
		tileY = 1;
		
		
	}
	
	public Image getPlayer(){
		return player;
		
	}

	public int getTileX(){
		return tileX;
	}
	public int getTileY(){
		return tileY;
	}
	
	
	
	
	public void move(int dx, int dy){

		
		tileX += dx;
		tileY += dy;
		setMove(1);
		
	}
}
