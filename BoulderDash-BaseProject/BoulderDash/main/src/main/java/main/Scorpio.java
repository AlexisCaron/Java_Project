package main;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * 
 * @author dimitri,anthony,alexis,florian
 *
 */
public class Scorpio {
	/**
	 * private attribute Static MovementScorpio
	 */
	private static int MovementScorpio;
	/**
	 * Getter Move
	 * @return MovementScorpio
	 */
	public static int getMove() {
		return MovementScorpio;
	}
	/**
	 * Setter Move
	 * @param move 
	 */
	public static void setMove(int move) {
		MovementScorpio = move;
	}
	/**
	 * Attribute private Scorpio
	 */
	private Image Scorpio;
	
	/**
	 * Attribute private for the position of Scorpio on the map
	 */
	private int caseX, caseY;
	/**
	 * Constructor
	 */
public Scorpio(){
	/**
	 * Write the way to open the Scorpio's sprite
	 */
	ImageIcon img = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Scorpio.png");
	Scorpio = img.getImage();
	/**
	 * Position of the scorpio in the map
	 */
	caseX = 6;
	caseY = 25;
}
/**
 * Getter Monster 
 * @return Scorpio
 */
	public Image getMonster(){
		return Scorpio;
	}
	/**
	 * Getter for take positionX
	 * @return CaseX positionX
	 */
	public int getCaseX(){
		return caseX;
	}
	/**
	 * Getter for take caseY
	 * @return CaseY positionY
	 */
	public int getCaseY(){
		return caseY;
	}
	/**
	 * The movement of the Scorpio on the map
	 */
public void move(int xx, int yy){
		
	caseX += xx;
	caseY += yy;
}
/**
 * Behaviour of the scorpio with condition that the scorpio move on the dirt and stop when the game is 
 * finished and when the character die the scorpio stop to move
 */
public void IA(){

				if(Map.getMap(caseX+1,caseY).equals("T") && Pannel.endGame != 0 && Pannel.die != 0){
					move(1,0);
					
				}
			

	
				else if(Map.getMap(caseX,caseY-1).equals("T") && Pannel.endGame != 0 && Pannel.die != 0){
					move(0,-1);
					
				}
	
				else if(Map.getMap(caseX-1,caseY).equals("T") && Pannel.endGame != 0 && Pannel.die != 0){
					move(-1,0);
					
				}

				else if(Map.getMap(caseX,caseY+1).equals("T") && Pannel.endGame != 0 && Pannel.die != 0){
					move(0,1);
					
				}
			
			
			
		
	}
}