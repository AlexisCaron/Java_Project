package main;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Butterfly {
	
private static int MovementButterfly;

	public static int getMove(){
		return MovementButterfly;
	}
	
	public static void setMove(int move){
		MovementButterfly = (move);	
	}
	private Image Butterfly;
	
	private int caseA, caseE;
	
public Butterfly(){
	ImageIcon img = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Butterfly.png");
	Butterfly = img.getImage();
	
	caseA = 21;
	caseE = 5;
}
	
	public Image getButterfly(){
		return Butterfly;
	}
	
	public int getCaseA(){
		return caseA;
	}
	
	public int getCaseE(){
		return caseE;
	}
	
public void move(int aa, int ee){
	
	caseA += aa;
	caseE += ee;
}
	
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

