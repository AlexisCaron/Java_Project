package main;
import java.awt.*;
import java.io.File;
import java.util.*;

import javax.swing.ImageIcon;

public class Map {
	
	private Scanner scan;
	private String Map[] = new String[30];
	
	private Image sand,
				  wall,
				  diamond,
				  dirt,
				  rock;
	
	static String table[][] = new String [30][30];
	
	public Map(){
		
		ImageIcon picture = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Sand.png");
		sand = picture.getImage();
		picture = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Wall.png");
		wall = picture.getImage();
		picture = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Diamond.png");
		diamond = picture.getImage();
		picture = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Dirt.png");
		dirt = picture.getImage();
		picture = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Stone.png");
		rock = picture.getImage();
		
		
		openFile();
		readFile();
	
	}

	
	
	public Image getSand(){
		return sand;
	}
	
	public Image getWall(){
		return wall;
	}
	
	public Image getDiam(){
		return diamond;
	}
	public Image getRock(){
		return rock;
	}
	public Image getDirt(){
		return dirt;
	}
	
	public static String getMap(int x, int y){
		String initMap = table[x][y];  
		return initMap;
	}
	
	public static void setMap(int x, int y, String sprite) {
		table[x][y] = sprite; 
	}

	public void openFile(){
		
		try{
		scan = new Scanner(new File("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//map2ok.txt"));
		}catch(Exception e){
			System.out.println("error loading map");
		}
	}

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


