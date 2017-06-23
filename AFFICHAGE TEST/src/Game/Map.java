package Game;
import java.awt.*;
import java.io.File;
import java.util.*;

import javax.swing.ImageIcon;
/**
 * @author dimitri,anthony,alexis,florian
 *
 */
public class Map {
	/**
	 * Private attribute scanner for look the map with the differents sprite
	 */
	private Scanner m;
	/**
	 * Private attribute type String Dimension of the map
	 */
	private String Map[] = new String[30];
	
	/**
	 * Private Attribute type Image for the different element
	 */
	private Image terre,
				  mur,
				  diamant,
				  dirt,
				  bolder;
	/**
	 * Double entry table with the colums 30 and lines 30
	 */
	static String table[][] = new String [30][30];
	/**
	 * Constructor
	 */
	public Map(){
		
		 /**
		 * Write the way for open the sprite for the element
		 */
		 
		ImageIcon img = new ImageIcon("C://Users//Asus//Documents//A1 Bis//Projet//ProjetJava//Sand.png");
		terre = img.getImage();
		/**
		 * Write the way for open the sprite for the element 
		 */
		img = new ImageIcon("C://Users//Asus//Documents//A1 Bis//Projet//ProjetJava//Mur.png");
		mur = img.getImage();
		/**
		 * Write the way for open the sprite for the element
		 */
		img = new ImageIcon("C://Users//Asus//Documents//A1 Bis//Projet//ProjetJava//Diamand.png");
		diamant = img.getImage();
		/**
		 * Write the way for open the sprite for the element
		 */
		img = new ImageIcon("C://Users//Asus//Documents//A1 Bis//Projet//ProjetJava//Rocher.png");
		bolder = img.getImage();
		/**
		 * Write the way for open the sprite for the element
		 */
		img = new ImageIcon("C://Users//Asus//Documents//A1 Bis//Projet//ProjetJava//Dirt.png");
		dirt = img.getImage();
		
		/**
		 * File
		 */
		openFile();
		readFile();
		closeFile();
	
	}

	
	/**
	 * Getter for show the dirt
	 * @return dirt
	 */
	public Image getTerre(){
		return terre;
	}
	/**
	 * Getter for show the wall
	 * @return wall
	 */
	public Image getMur(){
		return mur;
	}
	/**
	 * Getter for show the Diamond
	 * @return diamant
	 */
	public Image getDiam(){
		return diamant;
	}
	/**
	 * Getter for show the bolder
	 * @return bolder
	 */
	public Image getBol(){
		return bolder;
	}
	/**
	 * Getter for show the Dirt
	 * @return Dirt
	 */
	public Image getDirt(){
		return dirt;
	}
	
	public String getMap(int x, int y){
		String index = table[x][y];  
		return index;
	}
	
	public static void setMap(int x, int y, String s) {
		table[x][y] = s; 
	}

	/**
	 * Method for open the file and scan  and write if the loading fail 
	 */
	public void openFile(){
		
		try{
		m = new Scanner(new File("C://Users//Asus//Documents//A1 Bis//Projet//ProjetJava//Map + legend//Maptest.txt"));
		}catch(Exception e){
			System.out.println("error loading map");
		}
	}
/**
 * Read the file text 
 */
	public void readFile(){
		while(m.hasNext()){
			for(int i = 0;i < 30; i++){
				Map[i] = m.next();
			}}
				for(int x = 0; x < 30; x++){		
					for(int y = 0; y < 30; y++){						
					table[x][y] = Map[y].substring(x, x+1);}}
			}
			
		
	/**
	 * Close the file text
	 */
	public void closeFile(){
		
	}
}


