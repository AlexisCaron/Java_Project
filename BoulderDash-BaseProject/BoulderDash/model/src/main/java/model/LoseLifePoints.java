package model;
/**
 * 
 * @author dimitri,anthony,alexis,florian
 *
 */
public interface LoseLifePoints extends Die {

	/**
	 * Method 
	 * @return Number of life
	 */
	public  int LosedLifePoints();
	
	/**
	 * Method
	 * @return now life point
	 */
	public int setLifePoints();
	/**
	 * Method
	 * @return life point
	 */
	public int getLifePoints();
}

