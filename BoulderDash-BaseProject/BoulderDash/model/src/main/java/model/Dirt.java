package model;
/**
 * 
 * @author dimitri,anthony,alexis,florian
 *
 */
public class Dirt extends Elements{
/**
 * Method Override because it's inheritance with class Abstract Element 
 */
	
	@Override
public void getSprite(){
		
	}
	/**
	 * Method for the positionX
	 * @return PositionX of the Dirt
	 */
	@Override
	public int getPositionX() {
		return PositionX;
	}
	/**
	 * Method inheritance of class abstract Enemy and modify the positionX
	 */
	 
	public void setPositionX(int positionX) {
		PositionX = positionX;
	}
	/** Method for the positionY
	 * @return PositionY of the Dirt
	 */
	@Override
	public int getPositionY() {
		return PositionY;
	}
	/**
	 * Method inheritance of class abstract Enemy and modify the positionY
	 */
	 
	public void setPositionY(int positionY) {
		PositionY = positionY;
	}
	
}
