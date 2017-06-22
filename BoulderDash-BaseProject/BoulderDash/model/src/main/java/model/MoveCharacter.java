package model;
/**
 * 
 * @author dimitri,anthony,alexis,florian
 *
 */
public interface MoveCharacter {
	/**
	 * Method 
	 * @return boolean true or false 
	 */
	public default boolean MoveUp(){
		return (true);
	}
	/**
	 * Method 
	 * @return boolean true or false 
	 */
	public default boolean MoveDown(){
		return (true);
	}
	/**
	 * Method 
	 * @return boolean true or false 
	 */
	public default boolean MoveLeft(){
		return (true);
	}
	/**
	 * Method 
	 * @return boolean true or false 
	 */
	public default boolean MoveRight(){
		return (true);
	}
}
