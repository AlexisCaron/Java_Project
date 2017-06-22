package controller;


/** 
 * 
 * @author dimitri, antohny, alexis, florian
 */
public class UserOrder implements IUserOrder{
	/**
	 * Private attribute of the class with type integer and Order
	 */
	private int player;
	private Order order;
	/**
	 * Builder of the class
	 * @param player class UserOrder
	 * @param order class UserOrder
	 */
	public UserOrder(final int player, final Order order) {
		this.player = player;
		this.order = order;
	}
	/**
	 * Override method because inheritance with interface
	 * @return null 
	 */
@Override
	public Order getOrder(){
		return null ;

}
@Override
	public int getPlayer() {
		return player;
	}
}
