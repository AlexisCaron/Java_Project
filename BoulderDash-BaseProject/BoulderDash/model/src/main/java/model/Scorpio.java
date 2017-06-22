package model;
/**
 * 
 * @author dimitri,anthony,alexis,florian
 *
 */
public class Scorpio extends Enemy implements MoveScorpio{
	/**
	 * Method Override because it's inheritance with enemy
	 *  
	 */
	@Override
	public void getSprite(){
			
		}
	/**
	 * Method for the positionX
	 * @return PositionX of the scorpio
	 */
		@Override
		public int getPositionX() {
			return PositionX;
		}
		/**
		 * Method inheritance of class abstract Enemy and modify the positionX
		 * 
		 */
		public void setPositionX(int positionX) {
			PositionX = positionX;
		}
		/**
		 * Method for the positionY
		 * @return PositionY of the scorpio
		 */
		@Override
		public int getPositionY() {
			return PositionY;
		}
		/**
		 * Method inheritance of class abstract Enemy and modify the positionY
		 * 
		 */
		public void setPositionY(int positionY) {
			PositionY = positionY;
		}
		/**
		 * 	Method for kill the hero 
		 */
		@Override 
		public void Kill(){
			
		}
		/**
		 * Method for kill hero 
		 */
		@Override 
		public void ToDie(){	
		}
		/**
		 * Method when the scorpio drop diamond after die
		 * @return diamond 
		 */
		public int DropDiamonds(){
			return 5;
		}
		/**
		 *  Override method because inheritance with interface
		 */
		@Override
		public void BehaviourScorpio(){
			
		}

}
