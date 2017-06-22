package Game;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



public class Panneau extends JPanel implements ActionListener{
	private Timer timer;
	
	private Map m;
	private Player p;
	
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
				
				}
				
				
			}
			if(Player.getMove() == 1){
				
				
				previousCaseX = p.getTileX();
				previousCaseY = p.getTileY();
				
				System.out.println(previousCaseX);
				System.out.println(previousCaseY);
				
				System.out.println(g.drawImage(m.getDirt(), previousCaseX * 32, previousCaseY * 32,32,32, null));
				
				
				g.drawImage(m.getDirt(), previousCaseX * 32, previousCaseY * 32,32,32, null);
				
				Player.setMove(0);

		}

			
			g.drawImage(p.getPlayer(), p.getTileX() * 32, p.getTileY() * 32,32,32, null);
			//System.out.println(p.getTileX());
		}
		
		public class Al extends KeyAdapter{
			public void keyPressed(KeyEvent e){
				int keycode = e.getKeyCode();
				//super.paint(g);
				repaint();
				
				if(keycode == KeyEvent.VK_UP){
					if(!m.getMap(p.getTileX(), p.getTileY() - 1).equals("C")){
						p.move(0, -1);
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						p.p=1;
					}
				}
				else if(keycode == KeyEvent.VK_DOWN){
					if(!m.getMap(p.getTileX(), p.getTileY() + 1).equals("C")){
						p.move(0, 1);
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						p.p=2;
					}
				}
				else if(keycode == KeyEvent.VK_LEFT){
					if(!m.getMap(p.getTileX() - 1, p.getTileY()).equals("C")){
						p.move(-1, 0);
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						p.p=3;
					}
				}
				else if(keycode == KeyEvent.VK_RIGHT){
					if(!m.getMap(p.getTileX() + 1, p.getTileY()).equals("C")){
						p.move(1, 0);
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						p.p=4;
						//g.drawImage(m.getDirt(), x * 32, y * 32,32,32, null);
					}
				}

			}
			/*public void KeyReleased(KeyEvent e){
				p.p=0;
				System.out.println("cela marche");
			}*/
	
		}
}

