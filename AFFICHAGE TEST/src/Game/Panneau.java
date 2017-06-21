package Game;
import java.awt.*;

import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;



public class Panneau extends JPanel implements ActionListener{
	private Timer timer;
	
	private Map m;
	private Player p;

	
	
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
			
			
			for(int y = 0; y < 30; y++){
				for(int x = 0; x < 30; x++){
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

					int sableX[] = {17,17};
					int sableY[] = {18,22};
					for (int i=0; i<2; i++){                                           //NE MARCHERA PAS CAR SEULEMENT POUR UNE MAP

						if(sableX[i] != p.getTileX() || sableY[i] != p.getTileY() ) {
							
							//System.out.println("dirt");
							g.drawImage(m.getDirt(), p.getTileX() * 32, p.getTileY() * 32,32,32, null);
						}
				}
				}
				
				
			}
			
			
				
				
			
			
			
			

			
			g.drawImage(p.getPlayer(), p.getTileX() * 32, p.getTileY() * 32,32,32, null);
			System.out.println(p.getTileX());
		}
		
		public class Al extends KeyAdapter{
			public void keyPressed(KeyEvent e){
				int keycode = e.getKeyCode();
				
				if(keycode == KeyEvent.VK_Z){
					if(!m.getMap(p.getTileX(), p.getTileY() - 1).equals("C")){
					p.move(0, -1);
					}
				}
				if(keycode == KeyEvent.VK_S){
					if(!m.getMap(p.getTileX(), p.getTileY() + 1).equals("C")){
					p.move(0, 1);
					
					}
				}
				if(keycode == KeyEvent.VK_Q){
					if(!m.getMap(p.getTileX() - 1, p.getTileY()).equals("C")){
					p.move(-1, 0);
					}
				}
				if(keycode == KeyEvent.VK_D){
					if(!m.getMap(p.getTileX() + 1, p.getTileY()).equals("C")){
					p.move(1, 0);
					}
				}	}

					
				
				
			
			
			
		}
		
		
		
		}

