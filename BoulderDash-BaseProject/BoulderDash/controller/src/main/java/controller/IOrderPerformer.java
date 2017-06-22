package controller;
/** 
 * 
 * @author dimitri,anthony,alexis,florian
 */

public interface IOrderPerformer {
	/**
	 * Method 
	 * @param userOrder class 
	 */
	public default void OrderPerformer (UserOrder userOrder) {
	}	

}
