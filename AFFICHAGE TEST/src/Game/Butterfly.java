package Game;

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
	ImageIcon img = new ImageIcon("D://Antho//Butterfly.png");
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
	if(Map.getMap(caseA-1,caseE+1).equals("T") && Panneau.endGame != 0){
		move(-1,0);
		System.out.println("il marche");
		
	}



	else if(Map.getMap(caseA,caseE+1).equals("T") && Panneau.endGame != 0){
		move(0,1);
		
	}

	else if(Map.getMap(caseA,caseE-1).equals("T") && Panneau.endGame != 0){
		move(0,-1);
		
	}

	else if(Map.getMap(caseA+1,caseE).equals("T") && Panneau.endGame != 0){
		move(1,0);
		
	}

}
	
	
	
	
	
	
	
	
}
