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
	private int tileX, tileY;
	
	private Image player,playerup, playerdown, playerleft, playerright; 
	
	public Player(){
	
	
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
	

	public int getTileX(){
		return tileX;
	}
	public int getTileY(){
		return tileY;
	}
	
	
	
	
	public void move(int dx, int dy){
	
		
		tileX += dx;
		tileY += dy;
		setMove(1);

	}
}
