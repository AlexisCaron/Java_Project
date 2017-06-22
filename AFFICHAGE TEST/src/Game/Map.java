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
	
	public Map(){
		
		ImageIcon img = new ImageIcon("D://Antho//Sand.png");
		terre = img.getImage();
		img = new ImageIcon("D://Antho//Wall.png");
		mur = img.getImage();
		img = new ImageIcon("D://Antho//Diamond.png");
		diamant = img.getImage();
		img = new ImageIcon("D://Antho//Stone.png");
		bolder = img.getImage();
		img = new ImageIcon("D://Antho//Dirt.png");
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
		String index = Map[y].substring(x, x+1);
		return index;
	}
	
	public void openFile(){
		
		try{
		m = new Scanner(new File("D://Antho//mapd.txt"));
		}catch(Exception e){
			System.out.println("error loading map");
		}
	}
	
	public void readFile(){
		while(m.hasNext()){
			for(int i = 0;i < 30; i++){
				Map[i] = m.next();
			}
			
		}
	}
	
	public void closeFile(){
		
	}
}
