package main;
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
	 * Private attribute scanner for look the map with the different sprites
	 */
	private Scanner scan;
	/**
	 * Private attribute type String Dimension of the map
	 */
	private String Map[] = new String[30];
	/**
	 * Private Attribute type Image for the different element
	 */
	private Image sand,
				  wall,
				  diamond,
				  dirt,
				  rock;
	/**
	 * Double entry table with the colums 30 and lines 30
	 */
	static String table[][] = new String [30][30];
	
	/**
	 * Constructor
	 */
	public Map(){
		 /**
		 * Write the way to open the sprite for the element Sand
		 */
		ImageIcon picture = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Sand.png");
		sand = picture.getImage();
		/**
		 * Write the way for open the sprite for the element Wall
		 */
		picture = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Wall.png");
		wall = picture.getImage();
		/**
		 * Write the way for open the sprite for the element Diamond
		 */
		picture = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Diamond.png");
		diamond = picture.getImage();
		/**
		 * Write the way for open the sprite for the element Dirt
		 */
		picture = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Dirt.png");
		dirt = picture.getImage();
		/**
		 * Write the way for open the sprite for the element Rock
		 */
		picture = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Stone.png");
		rock = picture.getImage();
		
		/**
		 *Fonction for  Open and Read the file .txt
		 */
		openFile();
		readFile();
	
	}

	
	/**
	 * Getter to show the Sand
	 * @return sand 
	 */
	public Image getSand(){
		return sand;
	}
	/**
	 * Getter to show the Wall
	 * @return wall
	 */
	public Image getWall(){
		return wall;
	}
	/**
	 * Getter to show the Diamond
	 * @return diamond 
	 */
	public Image getDiam(){
		return diamond;
	}
	/**
	 * Getter to show the Rock
	 * @return rock
	 */
	public Image getRock(){
		return rock;
	}
	/**
	 * Getter to show the Dirt
	 * @return dirt
	 */
	public Image getDirt(){
		return dirt;
	}
	/**
	 * Method static GetMap
	 * @param x lines
	 * @param y columns
	 * @return intialize of the map
	 */
	
	public static String getMap(int x, int y){
		String initMap = table[x][y];  
		return initMap;
	}
	/**
	 * Method Static SetMap
	 * @param x position on the map
	 * @param y position on the map
	 * @param sprite picture of element
	 */
	public static void setMap(int x, int y, String sprite) {
		table[x][y] = sprite; 
	}
	/**
	 * Method to open and scan the file and show an error message if the loading is failed
	 */
	public void openFile(){
		
		try{
		scan = new Scanner(new File("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//map2ok.txt"));
		}catch(Exception e){
			System.out.println("error loading map");
		}
	}
	/**
	 *Method to generate the double dimension table
	 */
	public void readFile(){
		while(scan.hasNext()){
			for(int i = 0;i < 30; i++){
				Map[i] = scan.next();
			}}
				for(int x = 0; x < 30; x++){		
					for(int y = 0; y < 30; y++){						
					table[x][y] = Map[y].substring(x, x+1);}}
			}
}


