package model;

import model.dao.AbstractDAO;

public class Image extends AbstractDAO{
	
	private int Id;
	public String Image;
	private Elements element;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public void ReadSprite(){
		
	}
	public Elements CreateElement(){
		return element;
		
	}
	

}
