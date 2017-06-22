package model;
/**
 * @author dimitri,anthony,alexis,florian
 */
import model.dao.AbstractDAO;

public class Image extends AbstractDAO{
	/**
	 * Public and private attribute 
	 */
	private int Id;
	public String Image;
	private Elements element;
	
	/**
	 * Method for take the id
	 * @return Id image 
	 */
	public int getId() {
		return Id;
	}
	/**
	 * Method for modify the id
	 * @param id image
	 */
	public void setId(int id) {
		Id = id;
	}
	/**
	 * Method for read the sprite
	 */
	public void ReadSprite(){
		
	}
	/**
	 * Method element 
	 * @return element image 
	 */
	public Elements CreateElement(){
		return element;
		
	}
	

}
