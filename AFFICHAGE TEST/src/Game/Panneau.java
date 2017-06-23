package Game;
import java.awt.*;

import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;



public class Panneau extends JPanel implements ActionListener{
	private Timer timer;
	
	public Map m;
	private Player p;
	private Scorpio a;
	private Butterfly b;

	
	static int diamondRemaining = 7;
	static int diamondTaked = 0;
	static int diamondCount;
	static int endGame = 1;
	static int die = 1;
	
	public static int getDiamondTaked() {
		return diamondTaked;
	}



	public static void setDiamondTaked(int diamondTaked) {
		Panneau.diamondTaked = diamondTaked;
	}



	public static int getDiamondRemaining() {
		return diamondRemaining;
	}



	public static void setDiamondRemaining(int diamondRemaining) {
		Panneau.diamondRemaining = diamondRemaining;
	}

	String diamondMessage = "Diamonds Remaining :";
	String winMessage = "You have collected all the diamonds!";
	String looseMessage = "You are dead...";
	String diamondString;
	
	int previousCaseX;
	int previousCaseY;
	
	int nextCaseX;
	int nextCaseY;
	
	public Panneau(){
			
		m = new Map();
		p = new Player();
		a = new Scorpio();
		b = new Butterfly();
		
		
		addKeyListener(new Al());
		setFocusable(true);
		
			timer = new Timer(100, this);
			timer.start();
		}
	

	
	 public void actionPerformed(ActionEvent e){
		repaint();
	}

		
		public void paint(Graphics g){
			super.paint(g);
			
			
			for(int x = 0; x < 30; x++){		
				for(int y = 0; y < 30; y++){
					
					if(Map.getMap(x, y).equals("S")){
						g.drawImage(m.getTerre(), x * 32, y * 32,32,32, null);
					}
					if(Map.getMap(x, y).equals("C")){
						g.drawImage(m.getMur(), x * 32, y * 32,32,32, null);
					}
					if(Map.getMap(x, y).equals("D")){
						g.drawImage(m.getDiam(), x * 32, y * 32,32,32, null);
						if(Map.getMap(x, y+1).equals("T")){
							Map.setMap(x, y+1, "D");
							Map.setMap(x, y, "T");}
					}
					if(Map.getMap(x, y).equals("R")){
						g.drawImage(m.getBol(), x * 32, y * 32,32,32, null);
						
						if(Map.getMap(x, y+1).equals("T")){
							Map.setMap(x, y+1, "R");
							Map.setMap(x, y, "T");
						}
					}
					if(Map.getMap(x, y).equals("T")){
						g.drawImage(m.getDirt(), x * 32, y * 32,32,32, null);
						
					}
				
					
				
					}

					if(Player.getMove() == 1){
						
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						
						Map.setMap(previousCaseX,previousCaseY,"T");
						
						Player.setMove(0);

				}
				
			
			}
			g.setFont(new Font("Calibri", Font.BOLD, 25));
			g.setColor(Color.BLACK);
			g.drawString(diamondMessage, 0,  980);
			
			diamondCount = diamondRemaining - diamondTaked;
			
			diamondString = String.valueOf(diamondCount);
			
			g.drawString(diamondString, 235, 980);
			
			if(diamondCount == 0){
				g.setFont(new Font("Calibri", Font.BOLD, 50));
				g.setColor(Color.WHITE);
				g.drawString(winMessage, 110,  450);
				
				endGame = 0;
			}
			
			g.drawImage(p.getPlayer(), p.getTileX() * 32, p.getTileY() * 32,32,32, null);
			
			g.drawImage(a.getMonster(), a.getCaseX() * 32, a.getCaseY() * 32,32,32, null);
			g.drawImage(b.getButterfly(), b.getCaseA() * 32, b.getCaseE() * 32,32,32, null);
			a.IA();
			b.IA();

		}
		
		public class Al extends KeyAdapter{
			public void keyPressed(KeyEvent e){
				int keycode = e.getKeyCode();
				repaint();
				if(keycode == KeyEvent.VK_UP){
					if(!Map.getMap(p.getTileX(), p.getTileY() - 1).equals("C") && !Map.getMap(p.getTileX(), p.getTileY() - 1).equals("R") && endGame != 0){
						
						//repaint();
						
						if(Map.getMap((p.getTileX()), (p.getTileY() - 1)).equals("D")) {
							diamondTaked ++;
						}
						
						
						p.move(0, -1);
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						p.p=1;
					}
				}
				else if(keycode == KeyEvent.VK_DOWN){
					if(!Map.getMap(p.getTileX(), p.getTileY() + 1).equals("C") && !Map.getMap(p.getTileX(), p.getTileY() + 1).equals("R") && endGame != 0){
						
						//repaint();
						
						
						if(Map.getMap((p.getTileX()), (p.getTileY() + 1)).equals("D")) {
							diamondTaked ++;
						}
						
						p.move(0, 1);
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						p.p=2;
					}
				}
				else if(keycode == KeyEvent.VK_LEFT){
					if(!Map.getMap(p.getTileX() - 1, p.getTileY()).equals("C") && endGame != 0){
						
						nextCaseX = (p.getTileX() - 2);
						nextCaseY = (p.getTileY());
						
						//repaint();
						
						if(Map.getMap((p.getTileX() - 1), (p.getTileY())).equals("D")) {
							diamondTaked ++;
						}
						
						if(Map.getMap((p.getTileX() - 1), (p.getTileY())).equals("R")) {
							if(Map.getMap(nextCaseX, nextCaseY).equals("T")) {
							
								Map.setMap((p.getTileX() - 1), (p.getTileY()), "T");
								Map.setMap((p.getTileX() - 2), (p.getTileY()), "R");
						}
										
						}
						if(!Map.getMap(p.getTileX() - 1, p.getTileY()).equals("R")){
						p.move(-1, 0);
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						p.p=3;
						}
					}
				}
				else if(keycode == KeyEvent.VK_RIGHT){
					if(!Map.getMap(p.getTileX() + 1, p.getTileY()).equals("C") && endGame != 0){
						
						nextCaseX = (p.getTileX() + 2);
						nextCaseY = (p.getTileY());
						
					//	repaint();
						
						if(Map.getMap((p.getTileX() + 1), (p.getTileY())).equals("D")) {
							diamondTaked ++;
						}
						
						if(Map.getMap((p.getTileX() + 1), (p.getTileY())).equals("R")) {
							if(Map.getMap(nextCaseX, nextCaseY).equals("T")) {
							
								Map.setMap((p.getTileX() + 1), (p.getTileY()), "T");
								Map.setMap((p.getTileX() + 2), (p.getTileY()), "R");
						}}
						
						if(!Map.getMap(p.getTileX() + 1, p.getTileY()).equals("R")){
						p.move(1, 0);
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						p.p=4;
						}
					}
				}	
			}
		}
	}

