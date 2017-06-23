package Game;
import java.awt.*;

import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;
/**
 * @author dimitri,anthony,alexis,florian
 *
 */
public class Panneau extends JPanel implements ActionListener{
	/**
	 * Private Attribute type timer 
	 */
	private Timer timer;
	/**
	 * Private attribute type Map m 
	 */
	private Map m;
	/**
	 * Private attribute type Player p  
	 */
	private Player p;
	/**
	 * Variable initialize to 8
	 */
	int diamondRemaining = 8;
	/**
	 * Message on the bot of the JFrame
	 */
	String diamondMessage = "Diamonds Remaining :";
	
	/**
	 * Variable no-initialized for Dirt
	 */
	int previousCaseX;
	int previousCaseY;
	/**
	 * Constructor of the class
	 */
	public Panneau(){
			/**
			 * instantiation for call constructor
			 */
		m = new Map();
		p = new Player();
		addKeyListener(new Al());
		setFocusable(true);
		/**
		 * Timer for when the character move refresh the map 
		 */
			timer = new Timer(25, this);
			timer.start();
		}
	
	/**
	 * Method for repaint when the program have a action 
	 */
	 public void actionPerformed(ActionEvent e){
		repaint();
	}

		/**
		 * paint with the different element associate 
		 */
		public void paint(Graphics g){
			super.paint(g);
			
			/**
			 * loop with line of the map 
			 */
			for(int x = 0; x < 30; x++){		
				for(int y = 0; y < 30; y++){
				
					/**
					 * Place Dirt with the size in the map and verify with equals
					 */
					if(m.getMap(x, y).equals("S")){
						g.drawImage(m.getTerre(), x * 32, y * 32,32,32, null);
					}
					/**
					 * Place Wall with the size in the map and verify with equals
					 */
					if(m.getMap(x, y).equals("C")){
						g.drawImage(m.getMur(), x * 32, y * 32,32,32, null);
					}
					/**
					 * Place Diamond with the size in the map and verify with equals
					 */
					if(m.getMap(x, y).equals("D")){
						g.drawImage(m.getDiam(), x * 32, y * 32,32,32, null);
						diamondRemaining ++;
					}
					/**
					 * Place Dirt with the size in the map and verify with equals
					 */
					if(m.getMap(x, y).equals("R")){
						g.drawImage(m.getBol(), x * 32, y * 32,32,32, null);
					}
					/**
					 * Place Dirt with the size in the map and verify with equals
					 */
					if(m.getMap(x, y).equals("T")){
						g.drawImage(m.getDirt(), x * 32, y * 32,32,32, null);
						
					}
				
					
				
					}
                     /**
                      * WHen the character moove the sprite on the different position its change to dirt
                      */
					if(Player.getMove() == 1){
						
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						
						Map.setMap(previousCaseX,previousCaseY,"T");
						
						Player.setMove(1);

				}
				
			
			}
			
			

			g.drawString(diamondMessage, 29, 29);
			
			
			g.drawImage(p.getPlayer(), p.getTileX() * 32, p.getTileY() * 32,32,32, null);
		

		}
		/**
		 * 
		 * @author Asus dimitri,anthony,alexis,florian
		 *
		 */
		public class Al extends KeyAdapter{
			public void keyPressed(KeyEvent e){
				int keycode = e.getKeyCode();
				/**
				 * Transform physic push on virtual push when the user push up on the keyboard the character move up and he is blocked buy the wall and stone with sprite character up
				 */
				if(keycode == KeyEvent.VK_UP){
					if(!m.getMap(p.getTileX(), p.getTileY() - 1).equals("C") && !m.getMap(p.getTileX(), p.getTileY() - 1).equals("R")){
						p.move(0, -1);
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						p.p=1;
					}
				}
				/**
				 * Transform physic push on virtual push when the user push down on the keyboard the character move up and he is blocked buy the wall and stone with sprite character down
				 */
				else if(keycode == KeyEvent.VK_DOWN){
					if(!m.getMap(p.getTileX(), p.getTileY() + 1).equals("C") && !m.getMap(p.getTileX(), p.getTileY() + 1).equals("R")){
						p.move(0, 1);
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						p.p=2;
					}
				}
				/**
				 * Transform physic push on virtual push when the user push left on the keyboard the character move up and he is blocked buy the wall and stone with sprite character left
				 */
				else if(keycode == KeyEvent.VK_LEFT){
					if(!m.getMap(p.getTileX() - 1, p.getTileY()).equals("C") && !m.getMap(p.getTileX() - 1, p.getTileY()).equals("R")){
						p.move(-1, 0);
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						p.p=3;
					}
				}
				/**
				 * Transform physic push on virtual push when the user push right on the keyboard the character move up and he is blocked buy the wall and stone with sprite character right
				 */
				else if(keycode == KeyEvent.VK_RIGHT){
					if(!m.getMap(p.getTileX() + 1, p.getTileY()).equals("C") && !m.getMap(p.getTileX() + 1, p.getTileY()).equals("R")){
						p.move(1, 0);
						previousCaseX = p.getTileX();
						previousCaseY = p.getTileY();
						p.p=4;

				}
			}
		}		
	}
}

