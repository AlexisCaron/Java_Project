package main;
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

/**
 * @author dimitri,anthony,alexis,florian
 *
 */

public class Pannel extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	/**
	 * Private Attribute 
	 */
	private Timer timer;
	private Map m;
	private Player p;
	private Scorpio s;
	private Butterfly b;
	/**
	 * Variables initialized
	 */
	
	static int diamondRemaining = 7;
	static int diamondTaked = 0;
	public static int diamondCount;
	public static int endGame = 1;
	public static int die = 1;
	
	/**
	 * Method static for the diamonds taked by the character
	 * @return diamondTaked 
	 */
	public static int getDiamondTaked() {
		return diamondTaked;
	}


	/**
	 * Setter for the Diamonds Taked by the character
	 * @param diamondTaked the diamondtaked
	 */
	public static void setDiamondTaked(int diamondTaked) {
		Pannel.diamondTaked = diamondTaked;
	}

	/**
	 * Method for the Diamonds Remaining on the map 
	 * @return diamondRemaining number of Diamond 
	 */
	public static int getDiamondRemaining() {
		return diamondRemaining;
	}


	/**
	 * Setter for the Diamonds Remaining on the map 
	 * @param diamondRemaining  the diamondRemaining
	 */
	public static void setDiamondRemaining(int diamondRemaining) {
		Pannel.diamondRemaining = diamondRemaining;
	}
	
	/**
	 * String : Message after the different action in the game
	 */
	String diamondMessage = "Diamonds Remaining :";
	String winMessage = "You have collected all the diamonds!";
	String looseMessage = "You are dead...";
	String diamondString;
	
	/**
	 * Variable to analyse the previous case
	 */
	
	int previousCaseX;
	int previousCaseY;
	
	/**
	 * Variable to analyse the next case
	 */

	int nextCaseX;
	int nextCaseY;
	
	/**
	 * Constructor
	 */
	public Pannel(){
		/**
		 * Instance of the class
		 */
		m = new Map();
		p = new Player();
		s = new Scorpio();
		b = new Butterfly();
		
		addKeyListener(new Action());
		setFocusable(true);
		
		/**
		 * Timer for the actions in the game
		 */
			timer = new Timer(100, this);
			timer.start();
		}
	

	 /**
	 * Method for repaint when the program have an action 
	 */
	 public void actionPerformed(ActionEvent e){
		repaint();
	}

	     /**
		 * paint with the different element in the .txt file 
		 */
		public void paint(Graphics g){
			super.paint(g);
			
			/**
			 * loop of the filling of the map 
			 */
			for(int x = 0; x < 30; x++){		
				for(int y = 0; y < 30; y++){
					
					if(Map.getMap(x, y).equals("S")){
						g.drawImage(m.getSand(), x * 32, y * 32,32,32, null);
					}
					if(Map.getMap(x, y).equals("C")){
						g.drawImage(m.getWall(), x * 32, y * 32,32,32, null);
					}
					if(Map.getMap(x, y).equals("D")){
						g.drawImage(m.getDiam(), x * 32, y * 32,32,32, null);
					/**
					 * gravity of the diamond
					 */
						
						if(Map.getMap(x, y+1).equals("T")){

	
							Map.setMap(x, y+1, "D");
							Map.setMap(x, y, "T");}
					}
					if(Map.getMap(x, y).equals("R")){
						g.drawImage(m.getRock(), x * 32, y * 32,32,32, null);
						
					/**
					* gravity of the rock
					**/
						if(Map.getMap(x, y+1).equals("T")){

							Map.setMap(x, y+1, "R");
							Map.setMap(x, y, "T");
						}
					}
					if(Map.getMap(x, y).equals("T")){
						g.drawImage(m.getDirt(), x * 32, y * 32,32,32, null);
						
					}
				
					
				
					}
				    /**
                     * When the character move on the map it change the case where he is in dirt
                     */
					if(Player.getMove() == 1){
						
						/**
	                     * Take the position of the character
	                     */
						
						previousCaseX = p.getPosPlayerX();
						previousCaseY = p.getPosPlayerY();
						
						/**
	                     * Replace the case by dirt
	                     */
						Map.setMap(previousCaseX,previousCaseY,"T");
						
						/**
	                     * Set the Move to 0 to stop the loop
	                     */
						
						Player.setMove(0);

				}
					/**
					 * Condition for the character to be killed
					 */
					if(Map.getMap(p.getPosPlayerX(), p.getPosPlayerY()).equals("R") || Map.getMap(p.getPosPlayerX(), p.getPosPlayerY()).equals("D")) {
						
						die = 0;
					}
			
			}
			/**
			 * Display the diamonds remaining
			 */
			g.setFont(new Font("Calibri", Font.BOLD, 25));
			g.setColor(Color.BLACK);
			g.drawString(diamondMessage, 0,  980);
			
			/**
			 * Count the number of diamond on the map
			 */
			diamondCount = diamondRemaining - diamondTaked;
			
			/**
			 * Convert the the int into a String
			 */
			
			diamondString = String.valueOf(diamondCount);
			
			g.drawString(diamondString, 235, 980);
			
			/**
			 * Display the win message and end the game
			 */
			
			if(diamondCount == 0){
				g.setFont(new Font("Calibri", Font.BOLD, 50));
				g.setColor(Color.WHITE);
				g.drawString(winMessage, 110,  450);
				
				endGame = 0;
			}
			
			/**
			 * if the character die by stone or diamond display a loose message and end the game
			 */
			if(die == 0){
				g.setFont(new Font("Calibri", Font.BOLD, 50));
				g.setColor(Color.WHITE);
				g.drawString(looseMessage, 330,  450);
			}
			
			/**
			 * spawn the character and the monsters on the map
			 */
			
			g.drawImage(p.getPlayer(), p.getPosPlayerX() * 32, p.getPosPlayerY() * 32,32,32, null);
			g.drawImage(s.getMonster(), s.getCaseX() * 32, s.getCaseY() * 32,32,32, null);
			g.drawImage(b.getButterfly(), b.getCaseA() * 32, b.getCaseE() * 32,32,32, null);
			/**
			 * call behaviour from the class of the different Monsters
			 */
			s.IA();
			b.IA();
			
		}
		
		public class Action extends KeyAdapter{
			public void keyPressed(KeyEvent e){
				int keycode = e.getKeyCode();
				/**
				 * Transform physic push into virtual push when the user push up on the keyboard the character move up and he is blocked by the wall and stone with sprite character up
				 */
				if(keycode == KeyEvent.VK_UP){
					if(!Map.getMap(p.getPosPlayerX(), p.getPosPlayerY() - 1).equals("C") && !Map.getMap(p.getPosPlayerX(), p.getPosPlayerY() - 1).equals("R") && endGame != 0 && die != 0){
						
						if(Map.getMap((p.getPosPlayerX()), (p.getPosPlayerY() - 1)).equals("D")) {
							diamondTaked ++;
						}
						
						
						p.move(0, -1);
						previousCaseX = p.getPosPlayerX();
						previousCaseY = p.getPosPlayerY();
						p.p=1;
					}
				}
				/**
				 * Transform physic push into virtual push when the user push down on the keyboard the character move down and he is blocked buy the wall and stone with sprite character down
				 */
				else if(keycode == KeyEvent.VK_DOWN){
					if(!Map.getMap(p.getPosPlayerX(), p.getPosPlayerY() + 1).equals("C") && !Map.getMap(p.getPosPlayerX(), p.getPosPlayerY() + 1).equals("R") && endGame != 0 && die != 0){

						
						
						if(Map.getMap((p.getPosPlayerX()), (p.getPosPlayerY() + 1)).equals("D")) {
							diamondTaked ++;
						}
						
						p.move(0, 1);
						previousCaseX = p.getPosPlayerX();
						previousCaseY = p.getPosPlayerY();
						p.p=2;
					}
				}
				/**
				 * Transform physic push into virtual push when the user push left on the keyboard the character move left and he is blocked buy the wall and stone with sprite character left
				 */
				else if(keycode == KeyEvent.VK_LEFT){
					if(!Map.getMap(p.getPosPlayerX() - 1, p.getPosPlayerY()).equals("C") && endGame != 0 && die != 0){
						
						nextCaseX = (p.getPosPlayerX() - 2);
						nextCaseY = (p.getPosPlayerY());

						
						if(Map.getMap((p.getPosPlayerX() - 1), (p.getPosPlayerY())).equals("D")) {
							diamondTaked ++;
						}
						
						if(Map.getMap((p.getPosPlayerX() - 1), (p.getPosPlayerY())).equals("R")) {
							if(Map.getMap(nextCaseX, nextCaseY).equals("T")) {
							
								Map.setMap((p.getPosPlayerX() - 1), (p.getPosPlayerY()), "T");
								Map.setMap((p.getPosPlayerX() - 2), (p.getPosPlayerY()), "R");
						}
										
						}
						if(!Map.getMap(p.getPosPlayerX() - 1, p.getPosPlayerY()).equals("R")){
						p.move(-1, 0);
						previousCaseX = p.getPosPlayerX();
						previousCaseY = p.getPosPlayerY();
						p.p=3;
						}
					}
				}
				/**
				 * Transform physic push into virtual push when the user push left on the keyboard the character move right  and he is blocked buy the wall and stone with sprite character left and move the character
				 */
				else if(keycode == KeyEvent.VK_RIGHT){
					if(!Map.getMap(p.getPosPlayerX() + 1, p.getPosPlayerY()).equals("C") && endGame != 0 && die != 0){
						
						nextCaseX = (p.getPosPlayerX() + 2);
						nextCaseY = (p.getPosPlayerY());

						if(Map.getMap((p.getPosPlayerX() + 1), (p.getPosPlayerY())).equals("D")) {
							diamondTaked ++;
						}
						
						if(Map.getMap((p.getPosPlayerX() + 1), (p.getPosPlayerY())).equals("R")) {
							if(Map.getMap(nextCaseX, nextCaseY).equals("T")) {
							
								Map.setMap((p.getPosPlayerX() + 1), (p.getPosPlayerY()), "T");
								Map.setMap((p.getPosPlayerX() + 2), (p.getPosPlayerY()), "R");
						}}
						
						if(!Map.getMap(p.getPosPlayerX() + 1, p.getPosPlayerY()).equals("R")){
						p.move(1, 0);
						previousCaseX = p.getPosPlayerX();
						previousCaseY = p.getPosPlayerY();
						p.p=4;
						}

					}
				}
			}	
		}
}
