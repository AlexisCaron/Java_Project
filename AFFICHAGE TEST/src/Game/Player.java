package Game;

import java.awt.*;
import javax.swing.*;

public class Player {
	
	private static int Move;

	public static int getMove() {
		return Move;
	}

	public static void setMove(int move) {
		Move = move;
	}

	//on définit
	public int p = 0;
	
	//on définit
	private Image player,playerup, playerdown, playerleft, playerright; 

	//on définit
	private int tileX, tileY;
	
	public Player(){
		
		// image à aller chercher dans le code source
		ImageIcon img = new ImageIcon("D://Antho//CDM.png");
		player = img.getImage();

		img = new ImageIcon("D://Antho//playerup.png");
		playerup = img.getImage();

		img = new ImageIcon("D://Antho//playerdown.png");
		playerdown = img.getImage();

		img = new ImageIcon("D://Antho//playerleft.png");
		playerleft = img.getImage();

		img = new ImageIcon("D://Antho//playerright.png");
		playerright = img.getImage();
	
		
		
	
		tileX = 1;
		tileY = 1;
		
		
	}
	
	//permet de savoir quelle image utiliser quand l'utilisateur
	//appuie sur une touche
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
	
	//retourner la position
	public int getTileX(){
		return tileX;
	}
	//retourner la position
	public int getTileY(){
		return tileY;
	}
	
	
	
	
	public void move(int dx, int dy){

		
		tileX += dx;
		tileY += dy;
		setMove(1);
		
	}
}
