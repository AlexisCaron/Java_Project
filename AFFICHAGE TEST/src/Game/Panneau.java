package Game;
import java.awt.*;

import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;



public class Panneau extends JPanel implements ActionListener{
	private Timer timer;
	
	private Map m;
	private Player p;
	
	int diamondRemaining = 0;
	String diamondMessage = "Diamonds Remaining :";
	
	
	int previousCaseX;
	int previousCaseY;
	
	public Panneau(){
			
		m = new Map();
		p = new Player();
		addKeyListener(new Al());
		setFocusable(true);
		
			timer = new Timer(25, this);
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
						diamondRemaining ++;
						System.out.print(diamondRemaining);
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
						
						System.out.print(previousCaseX);
						System.out.print(previousCaseY);
						
						Map.setMap(previousCaseX,previousCaseY,"T");
						
						Player.setMove(0);

				}
				
			
			}
			
			

			
			
			
			g.drawImage(p.getPlayer(), p.getTileX() * 32, p.getTileY() * 32,32,32, null);
		

		}
		
		public class Al extends KeyAdapter{
			
			public void keyPressed(KeyEvent e){
				int keycode = e.getKeyCode();
				
			/*	repaint();     */
				if(keycode == KeyEvent.VK_UP){
					if(!m.getMap(p.getTileX(), p.getTileY() - 1).equals("C") && !m.getMap(p.getTileX(), p.getTileY() - 1).equals("R")){
					p.move(0, -1);
					previousCaseX = p.getTileX();
					previousCaseY = p.getTileY();
					
										
					
					}
				}
				if(keycode == KeyEvent.VK_DOWN){
					if(!m.getMap(p.getTileX(), p.getTileY() + 1).equals("C") && !m.getMap(p.getTileX(), p.getTileY() + 1).equals("R")){
						p.move(0, 1);
					
					
					previousCaseX = p.getTileX();
					previousCaseY = p.getTileY();
					
					}
				}
				if(keycode == KeyEvent.VK_LEFT){
					if(!m.getMap(p.getTileX() - 1, p.getTileY()).equals("C") && !m.getMap(p.getTileX() - 1 , p.getTileY()).equals("R")){
					p.move(-1, 0);
					
					previousCaseX = p.getTileX();
					previousCaseY = p.getTileY();

					}
				}
				if(keycode == KeyEvent.VK_RIGHT){
					if(!m.getMap(p.getTileX() + 1, p.getTileY()).equals("C") && !m.getMap(p.getTileX() + 1 , p.getTileY()).equals("R")){
					p.move(1, 0);
					
					previousCaseX = p.getTileX();
					previousCaseY = p.getTileY();

					}
				}	}

					
				
				
			
			
			
		}
		
		
		
		}

