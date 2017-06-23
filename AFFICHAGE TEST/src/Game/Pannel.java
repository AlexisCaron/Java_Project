package Game;
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;



public class Pannel extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Timer timer;
	
	private Map m;
	private Player p;
	private Scorpio s;
	private Butterfly b;
	
	static int diamondRemaining = 7;
	static int diamondTaked = 0;
	static int diamondCount;
	static int endGame = 1;
	public static int die = 1;
	
	public static int getDiamondTaked() {
		return diamondTaked;
	}



	public static void setDiamondTaked(int diamondTaked) {
		Pannel.diamondTaked = diamondTaked;
	}



	public static int getDiamondRemaining() {
		return diamondRemaining;
	}



	public static void setDiamondRemaining(int diamondRemaining) {
		Pannel.diamondRemaining = diamondRemaining;
	}

	String diamondMessage = "Diamonds Remaining :";
	String winMessage = "You have collected all the diamonds!";
	String looseMessage = "You are dead...";
	String diamondString;
	
	int previousCaseX;
	int previousCaseY;
	
	int nextCaseX;
	int nextCaseY;
	
	public Pannel(){
			
		m = new Map();
		p = new Player();
		s = new Scorpio();
		b = new Butterfly();
		
		addKeyListener(new Action());
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
						g.drawImage(m.getSand(), x * 32, y * 32,32,32, null);
					}
					if(Map.getMap(x, y).equals("C")){
						g.drawImage(m.getWall(), x * 32, y * 32,32,32, null);
					}
					if(Map.getMap(x, y).equals("D")){
						g.drawImage(m.getDiam(), x * 32, y * 32,32,32, null);
						if(Map.getMap(x, y+1).equals("T")){

	
							Map.setMap(x, y+1, "D");
							Map.setMap(x, y, "T");}
					}
					if(Map.getMap(x, y).equals("R")){
						g.drawImage(m.getRock(), x * 32, y * 32,32,32, null);
						
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
						
						previousCaseX = p.getPosPlayerX();
						previousCaseY = p.getPosPlayerY();
						
						Map.setMap(previousCaseX,previousCaseY,"T");
						
						Player.setMove(0);

				}
					if(Map.getMap(p.getPosPlayerX(), p.getPosPlayerY()).equals("R") || Map.getMap(p.getPosPlayerX(), p.getPosPlayerY()).equals("D")) {
						
						die = 0;
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
			
			if(die == 0){
				g.setFont(new Font("Calibri", Font.BOLD, 50));
				g.setColor(Color.WHITE);
				g.drawString(looseMessage, 330,  450);
			}
			
			g.drawImage(p.getPlayer(), p.getPosPlayerX() * 32, p.getPosPlayerY() * 32,32,32, null);
		
			g.drawImage(s.getMonster(), s.getCaseX() * 32, s.getCaseY() * 32,32,32, null);
			g.drawImage(b.getButterfly(), b.getCaseA() * 32, b.getCaseE() * 32,32,32, null);
			s.IA();
			b.IA();
			
		}
		
		public class Action extends KeyAdapter{
			public void keyPressed(KeyEvent e){
				int keycode = e.getKeyCode();
				
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
