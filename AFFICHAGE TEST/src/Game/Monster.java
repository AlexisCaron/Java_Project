package Game;


import java.awt.*;
import javax.swing.*;


public class Monster {
	
	private static int Movement;
	
	
	
	public static int getMovement(){
		return Movement;
	}

	public static void setMove(int move){
		Movement=move;
	}
	
	private Image monsterone;
	
	private int caseX, caseY;

public Monster(){
	
	ImageIcon img = new ImageIcon("D://Antho//monster.png");
	monsterone = img.getImage();
	
	
	caseX = 1;
	caseY = 1;
	
				}

	public int getCaseX(){
		return caseX;
	}
	
	public int getCaseY(){
		return caseY;
	}
	
	
	public void move(int xx, int dd){
		caseX += xx;
		caseY += dd;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

