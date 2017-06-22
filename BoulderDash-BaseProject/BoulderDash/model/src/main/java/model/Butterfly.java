package model;
/** 
 * 
 * @author dimitri,anthony,alexis,florian
 *
 */

public class Butterfly extends Enemy implements MoveButterfly{
	/**
	 * Method Override because it's inheritance with enemy
	 *  
	 */
	
	@Override
	public void getSprite(){
			
		}
	/**
	 * @see Enemy
	 * Method for the positionX
	 * @return PositionX of the butterfly
	 */
		@Override
		public int getPositionX() {
			return PositionX;
		}
		/**
		 * @see Enemy
		 * Method inheritance of class abstract Enemy and modify the positionX
		 * 
		 */
		public void setPositionX(int positionX) {
			PositionX = positionX;
		}
		/**
		 * @see Enemy
		 * Method for the positionY
		 * @return PositionY of the butterfly
		 */
		@Override
		public int getPositionY() {
			return PositionY;
		}
		/**
		 * @see Enemy
		 * Method inheritance of class abstract Enemy and modify the positionY
		 * 
		 */
		public void setPositionY(int positionY) {
			PositionY = positionY;
		}
		/**
		 * @see KillSomeone
		 * 	Method for kill the hero 
		 */
		@Override 
		public void Kill(){
			
		}
		/**
		 * @see Die
		 * Method for kill hero 
		 */
		@Override 
		public void ToDie(){
			
		}
		/**
		 * @see DropDiamond
		 * Method when the butterfly drop diamond after die
		 * @return diamond 
		 */
		public int DropDiamonds(){
			return 5;
		}
		/**
		 * @see BehaviourButterfly
		 *  Override method because inheritance with interface
		 */
		@Override
		public void BehaviourButterfly(){
			
		}

}
