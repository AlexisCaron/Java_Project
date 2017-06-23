package main;

import java.awt.Image;

import javax.swing.ImageIcon;
/**
 * @author dimitri,anthony,alexis,florian
 *
 */
public class Player {
	/**
	 * Private static attribute type integer for movement 
	 */
	private static int Move;
	/** 
	 * Getter to take the movement of the player
	 * @return Move 
	 */
	public static int getMove() {
		return Move;
	}
	/**
	 *  Setter to modify the movement
	 * @param move Movement player
	 */
	public static void setMove(int move) {
		Move = move;
	}
	 /**
     * Public avariable type integer initialized at 0 for the default sprite of the character
     */
	public int p = 0;
	/**
	 * Private attribute type Image for the differents sprites of the movement of the Character
	 */
	private Image player,playerup, playerdown, playerleft, playerright; 
	/**
	 * Private attribute type integer for position player
	 */

	private int posPlayerX, posPlayerY;
	/**
	 * Constructor of the class 
	 */
	public Player(){
		
		/**
		 * Write the way to open the sprite of the character 
		 */
		ImageIcon img = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Character.png");
		player = img.getImage();
		 /**
		 * Write the way to open the sprite of the character when he go up 
		 */
		img = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//playerup.png");
		playerup = img.getImage();
		/**
		 * Write the way to open the sprite of the character when he go down 
		 */
		img = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//playerdown.png");
		playerdown = img.getImage();
		/**
		 * Write the way to open the sprite of the character when he go to the left
		 */
		img = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//playerleft.png");
		playerleft = img.getImage();
		/**
		 * Write the way to open the sprite of the character when he go to the right
		 */
		img = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//playerright.png");
		playerright = img.getImage();
	
		
		/**
	     * Position of the Player in the map 
	     */
	
		posPlayerX = 1;
		posPlayerY = 1;
		
		
	}
	/**
	 * If you go up you show the sprite playerup etc 
	 * @return player sprite
	 */
	public Image getPlayer(){
		
		if(p==1){
			return playerup;
		}else if(p==2){
			return playerdown;
		}else if(p==3){
			return playerleft;
		}else if(p==4){
			return playerright;
		}else{
		return player;
		}
	}
	
	  /**
     * Getter to show the position in the map of the character
     * @return posPlayerX positionX of the character 
     */
	public int getPosPlayerX(){
		return posPlayerX;
	}
	/**
     * Getter to show the position in the map of the character
     * @return posPlayerY positionY of the character 
     */
	public int getPosPlayerY(){
		return posPlayerY;
	}
	
	
	
	/**
	 * Initialize move for the character moving 
	 * @param dx move x
	 * @param dy move y
	 */
	public void move(int dx, int dy){
		
		posPlayerX += dx;
		posPlayerY += dy;
		setMove(1);
	}
}
