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

	public int p = 0;
	
	private Image player,playerup, playerdown, playerleft, playerright; 


	private int posPlayerX, posPlayerY;
	
	public Player(){
		
		
		ImageIcon img = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Character.png");
		player = img.getImage();

		img = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//playerup.png");
		playerup = img.getImage();

		img = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//playerdown.png");
		playerdown = img.getImage();

		img = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//playerleft.png");
		playerleft = img.getImage();

		img = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//playerright.png");
		playerright = img.getImage();
	
		
		
	
		posPlayerX = 1;
		posPlayerY = 1;
		
		
	}
	
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
	

	public int getPosPlayerX(){
		return posPlayerX;
	}
	public int getPosPlayerY(){
		return posPlayerY;
	}
	
	
	
	
	public void move(int dx, int dy){
		
		posPlayerX += dx;
		posPlayerY += dy;
		setMove(1);
	}
}
