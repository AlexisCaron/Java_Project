package model;


public abstract class Elements extends Image {
	public int PositionX;
	public int PositionY;
	
	public void getSprite(){
		
	}
	public int getPositionX() {
		return PositionX;
	}
	public void setPositionX(int positionX) {
		PositionX = positionX;
	}
	public int getPositionY() {
		return PositionY;
	}
	public void setPositionY(int positionY) {
		PositionY = positionY;
	}

}
