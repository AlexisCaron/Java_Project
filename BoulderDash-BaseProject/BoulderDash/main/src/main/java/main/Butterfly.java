package main;

import java.awt.Image;

import javax.swing.ImageIcon;
/**
 * 
 * @author dimitri,anthony,alexis,florian
 *
 */
public class Butterfly {
	/**
	 * Attribute private Static MovementButterfly
	 */
private static int MovementButterfly;
/**
 * Getter Move
 * @return MovementButterfly
 */
	public static int getMove(){
		return MovementButterfly;
	}
	/**
	 * Setter Move
	 * @param move 
	 */
	public static void setMove(int move){
		MovementButterfly = (move);	
	}
	/**
	 * Attribute private Butterfly
	 */
	private Image Butterfly;
	/**
	 * Attribute private for the position of Butterfly on the map
	 */
	private int caseA, caseE;
	/**
	 * Constructor
	 */
public Butterfly(){
	/**
	 * Write the way to open the Butterfly's sprite
	 */
	ImageIcon img = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Butterfly.png");
	Butterfly = img.getImage();
	/**
	 * Position in the map of Butterfly
	 */
	caseA = 21;
	caseE = 5;
}

/**
 * Getter Butterfly
 * @return Butterfly
 */

	public Image getButterfly(){
		return Butterfly;
	}
	/**
	 * Getter to take caseX
	 * @return CaseA positionX
	 */
	public int getCaseA(){
		return caseA;
	}
	/**
	 * Getter to take positionY
	 * @return CaseE positionY
	 */
	public int getCaseE(){
		return caseE;
	}
	/**
	 * The movement of the butterfly on the map
	 */
public void move(int aa, int ee){
	
	caseA += aa;
	caseE += ee;
}
/**
 * Behaviour of the butterfly with condition that the butterfly move on the dirt and stop when the game is 
 * finished and when the character die the butterfly stop to move
 */
public void IA(){
	if(Map.getMap(caseA-1,caseE).equals("T") && Pannel.endGame != 0 && Pannel.die != 0){
		move(-1,0);
		
	}



	else if(Map.getMap(caseA,caseE-1).equals("T") && Pannel.endGame != 0 && Pannel.die != 0){
		move(0,-1);
		
	}

	else if(Map.getMap(caseA,caseE+1).equals("T") && Pannel.endGame != 0 && Pannel.die != 0){
		move(0,1);
		
	}

	else if(Map.getMap(caseA+1,caseE).equals("T") && Pannel.endGame != 0 && Pannel.die != 0){
		move(1,0);
		
	}
}}

