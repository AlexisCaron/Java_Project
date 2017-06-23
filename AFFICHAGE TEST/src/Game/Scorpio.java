package Game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Scorpio {
	
	private static int MovementScorpio;

	public static int getMove() {
		return MovementScorpio;
	}
	public static void setMove(int move) {
		MovementScorpio = move;
	}
	private Image Scorpio;
	
	private int caseX, caseY;

public Scorpio(){
	
	ImageIcon img = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Scorpio.png");
	Scorpio = img.getImage();
	
	caseX = 6;
	caseY = 25;
}

	public Image getMonster(){
		return Scorpio;
	}

	public int getCaseX(){
		return caseX;
	}
	public int getCaseY(){
		return caseY;
	}
	
public void move(int xx, int yy){
		
	caseX += xx;
	caseY += yy;
}
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