package Game;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * 
 * @author dimitri,anthony,alexis,florian
 *
 */
public class Player {
	
	/**
	 * Private static attribute type integer for movement 
	 */
	private static int Move;

	/** 
	 * Getter for take the movement of the player
	 * @return Move 
	 */
	public static int getMove() {
		return Move;
	}
/**
 *  Setter for modify the movement
 * @param move Movement player
 */
	public static void setMove(int move) {
		Move = move;
	}
    /**
     * Public attribute type integer initialized at 0
     */
	public int p = 0;
	
	/**
	 * Private attribute type Image for different sprite of movement Character
	 */
	private Image player,playerup, playerdown, playerleft, playerright; 

	/**
	 * Private attribute type integer for position player
	 */

	private int tileX, tileY;
	
	/**
	 * Constructor of the class 
	 */
	public Player(){
		
		/**
		 * Write the way for open the sprite for the character 
		 */
		ImageIcon img = new ImageIcon("C://Users/Asus/Documents/A1 Bis/Projet/ProjetJava/personnage ne pas bouger.png");
		player = img.getImage();
        /**
         * 
		 * Write the way for open the sprite for the characterup 
		 */
         
		img = new ImageIcon("C://Users//Asus//Documents//A1 Bis//Projet//ProjetJava//personnage quand il monte 1.png");
		playerup = img.getImage();
		/**
		 * Write the way for open the sprite for the characterdown 
		 */
		img = new ImageIcon("C://Users//Asus//Documents//A1 Bis//Projet//ProjetJava//personnage quand il descend 1.png");
		playerdown = img.getImage();
        /**
         * 
		 * Write the way for open the sprite for the characterleft
		 */
         
		img = new ImageIcon("C://Users//Asus//Documents//A1 Bis//Projet//ProjetJava//personnage tourner à gauche 1.png");
		playerleft = img.getImage();

		/**
		 * 
		 * Write the way for open the sprite for the characterright
		 */
		 
		img = new ImageIcon("C://Users//Asus//Documents//A1 Bis//Projet//ProjetJava//personnage tourner à droite 1.png");
		playerright = img.getImage();
	
		
		
	    /**
	     * Position of the Player in the map (top,left )
	     */
		tileX = 1;
		tileY = 1;
		
		
	}
	/**
	 * If you push 1 you show the sprite playerup etc 
	 * @return player
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
     * Getter for show the position in the map of the character
     * @return tileX positionX of the character 
     */
	public int getTileX(){
		return tileX;
	}
	 /**
     * Getter for show the position in the map of the character
     * @return tileY positionY of the character 
     */
	
	public int getTileY(){
		return tileY;
	}
	
	
	
	/**
	 * Initialize move for the character moving 
	 * @param dx move x
	 * @param dy move y
	 */
	public void move(int dx, int dy){

		
		tileX += dx;
		tileY += dy;
		setMove(1);
		
	}
}
