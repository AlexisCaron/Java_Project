package model;
/**
 * @author dimitri,anthony,alexis,florian
 */

public abstract class Elements extends Image {
	/**
	 * Public attribute 
	 */
	public int PositionX;
	public int PositionY;
	 
	public void getSprite(){
		
	}
	/**
	 * Method for the positionY
     * @return PositionX of the Element
	 */
	public int getPositionX() {
		return PositionX;
	}
	/**
	 * Method modify the positionX
	 * @param positionX position 
	 */
	public void setPositionX(int positionX) {
		PositionX = positionX;
	}
	/**
	 * Method for the positionY
     * @return PositionY of the Element
	 */
	public int getPositionY() {
		return PositionY;
	}
	/**
	 * Method modify the positionY
	 *  @param positionY position
	 */
	public void setPositionY(int positionY) {
		PositionY = positionY;
	}

}
