package model;
/**
 * 
 * @author dimitri,anthony,alexis,florian
 *
 */
public class Character extends Elements implements Push, Take , MoveCharacter,LoseLifePoints{

	/**
	 * @see MoveCharacter
	 * Method 
	 * @return boolean true or false 
	 */
	@Override
	public  boolean MoveUp(){
		return (true);
	}
	/**
	 * @see MoveCharacter
	 * Method 
	 * @return boolean true or false 
	 */
	@Override
	public boolean MoveDown(){
		return (true);
	}
	/**
	 * @see MoveCharacter
	 * Method 
	 * @return boolean true or false 
	 */
	@Override
	public  boolean MoveLeft(){
		return (true);
	}
	/**
	 * @see MoveCharacter
	 * Method 
	 * @return boolean true or false 
	 */
	@Override
	public boolean MoveRight(){
		return (true);
	}
	/**
	 * @see DropDiamond
	 * Method for drop diamond
	 */
	@Override
	public void TakeDiamond(){
		
	}
	/**
	 * @see Push
	 * Method for push an element
	 */
	@Override
	public  void ToPush(){	
	}
	/**
	 * @see LoseLifePoints
	 * Method 
	 * @return Number of life
	 */
	@Override
	public int LosedLifePoints(){
		return 0;
	}
	
	/**
	 *  @see LoseLifePoints
	 * Method
	 * @return now life point
	 */
	
@Override
	public int setLifePoints() {
		return 0;
	}
	/**
	 *  @see LoseLifePoints
	 * Method
	 * @return life point
	 */
@Override
	public int getLifePoints() {
		return 0;
	}
	/**
	 * @see Elements
	 * Method Override because it's inheritance with class Abstract Element 
	 */
	@Override
public void getSprite(){
		
	}
	/**
	 *  @see Elements
	 * Method for the positionY
     * @return PositionX of the Element
	 */
	@Override
	public int getPositionX() {
		return PositionX;
	}
	/**
	 * @see Elements
	 * Method modify the positionX
	 * @param positionX position 
	 */
	@Override
	public void setPositionX(int positionX) {
		PositionX = positionX;
	}
	/**
	 * @see Elements
	 * Method for the positionY
     * @return PositionY of the Element
	 */
	@Override
	public int getPositionY() {
		return PositionY;
	}
	/**
	 * @see Elements
	 * Method modify the positionY
	 *  @param positionY position
	 */
	@Override
	public void setPositionY(int positionY) {
		PositionY = positionY;
	}
/**
 * @see Die
 */
	public void ToDie() {
	}

}


