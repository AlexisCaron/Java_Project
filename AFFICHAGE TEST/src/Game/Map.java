package Game;
import java.awt.*;
import java.io.File;
import java.util.*;

import javax.swing.ImageIcon;

public class Map {
	
	private Scanner m;
	private String Map[] = new String[30];
	
	private Image terre,
				  mur,
				  diamant,
				  dirt,
				  bolder;
	
	static String table[][] = new String [30][30];
	
	public Map(){
		
		ImageIcon img = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Sand.png");
		terre = img.getImage();
		img = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Wall.png");
		mur = img.getImage();
		img = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Diamond.png");
		diamant = img.getImage();
		img = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Stone.png");
		bolder = img.getImage();
		img = new ImageIcon("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//Dirt.png");
		dirt = img.getImage();
		
		
		openFile();
		readFile();
		closeFile();
	
	}

	
	
	public Image getTerre(){
		return terre;
	}
	
	public Image getMur(){
		return mur;
	}
	
	public Image getDiam(){
		return diamant;
	}
	public Image getBol(){
		return bolder;
	}
	public Image getDirt(){
		return dirt;
	}
	
	public String getMap(int x, int y){
		String index = table[x][y];          //----------------------------------------------------------------------------------
		return index;
	}
	
	public static void setMap(int x, int y, String s) {
		table[x][y] = s; 
	}

	public void openFile(){
		
		try{
		m = new Scanner(new File("C://Users//flori//Desktop//CESI eXia//Projet Java//Affichage//mapd.txt"));
		}catch(Exception e){
			System.out.println("error loading map");
		}
	}

	public void readFile(){
		while(m.hasNext()){
			for(int i = 0;i < 30; i++){
				Map[i] = m.next();
			}}
				for(int x = 0; x < 30; x++){		
					for(int y = 0; y < 30; y++){						
					table[x][y] = Map[y].substring(x, x+1);}}
			}
			
		
	
	public void closeFile(){
		
	}
}


