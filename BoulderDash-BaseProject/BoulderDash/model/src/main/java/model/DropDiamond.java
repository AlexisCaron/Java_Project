package model;
/**
 * 
 * @author dimitri,anthony,alexis,florian
 *
 */
public interface DropDiamond extends Die{
	/**
	 * Method
	 * @return 5 diamonds 
	 */
	public default int DropDiamonds(){
		return 5;
	}
	/**
	 * @see Die
	 */
	@Override 
	public  void ToDie();

}
