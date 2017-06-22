package Game;
import java.awt.*;

import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;



public class Panneau extends JPanel implements ActionListener{
	private Timer timer;
	
	private Map m;
	private Player p;
	
	static int diamondRemaining = 7;
	static int diamondTaked = 0;
	static int diamondCount;
	
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
	
	String diamondString;
	
	int previousCaseX;
	int previousCaseY;
	
	int nextCaseX;
	int nextCaseY;
	
	public Panneau(){
			
		m = new Map();
		p = new Player();
		addKeyListener(new Al());
		setFocusable(true);
		
			timer = new Timer(15, this);
			timer.start();
		}
	

	
	 public void actionPerformed(ActionEvent e){
		repaint();
	}

		
		public void paint(Graphics g){
			super.paint(g);
			
			
			for(int x = 0; x < 30; x++){		
				for(int y = 0; y < 30; y++){
					
					if(m.getMap(x, y).equals("S")){
						g.drawImage(m.getTerre(), x * 32, y * 32,32,32, null);
					}
					if(m.getMap(x, y).equals("C")){
						g.drawImage(m.getMur(), x * 32, y * 32,32,32, null);
					}
					if(m.getMap(x, y).equals("D")){
						g.drawImage(m.getDiam(), x * 32, y * 32,32,32, null);
						
					}
					if(m.getMap(x, y).equals("R")){
						g.drawImage(m.getBol(), x * 32, y * 32,32,32, null);
					}
					if(m.getMap(x, y).equals("T")){
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
			
			
			g.drawImage(p.getPlayer(), p.getTileX() * 32, p.getTileY() * 32,32,32, null);
		

		}
		
		public class Al extends KeyAdapter{
			public void keyPressed(KeyEvent e){
				int keycode = e.getKeyCode();
				
				if(keycode == KeyEvent.VK_UP){
					if(!m.getMap(p.getTileX(), p.getTileY() - 1).equals("C") && !m.getMap(p.getTileX(), p.getTileY() - 1).equals("R")){
						
						nextCaseX = (p.getTileX());
						nextCaseY = (p.getTileY() - 1);
						
						if(m.getMap(nextCaseX, nextCaseY).equals("D")) {
							diamondTaked ++;
						}
						
						p.move(0, -1);
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						p.p=1;
					}
				}
				else if(keycode == KeyEvent.VK_DOWN){
					if(!m.getMap(p.getTileX(), p.getTileY() + 1).equals("C") && !m.getMap(p.getTileX(), p.getTileY() + 1).equals("R")){
						
						nextCaseX = (p.getTileX());
						nextCaseY = (p.getTileY() + 1);
						
						
						if(m.getMap(nextCaseX, nextCaseY).equals("D")) {
							diamondTaked ++;
						}
						
						p.move(0, 1);
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						p.p=2;
					}
				}
				else if(keycode == KeyEvent.VK_LEFT){
					if(!m.getMap(p.getTileX() - 1, p.getTileY()).equals("C") && !m.getMap(p.getTileX() - 1, p.getTileY()).equals("R")){
						
						nextCaseX = (p.getTileX() - 1);
						nextCaseY = (p.getTileY());
						
						if(m.getMap(nextCaseX, nextCaseY).equals("D")) {
							diamondTaked ++;
						}
						
						p.move(-1, 0);
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						p.p=3;
					}
				}
				else if(keycode == KeyEvent.VK_RIGHT){
					if(!m.getMap(p.getTileX() + 1, p.getTileY()).equals("C") && !m.getMap(p.getTileX() + 1, p.getTileY()).equals("R")){
						
						nextCaseX = (p.getTileX() + 1);
						nextCaseY = (p.getTileY());
						
						if(m.getMap(nextCaseX, nextCaseY).equals("D")) {
							diamondTaked ++;
						}
						
						p.move(1, 0);
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						p.p=4;

					}
				}	}

					
				
				
			
			
			
		}
		
		
		
		}

