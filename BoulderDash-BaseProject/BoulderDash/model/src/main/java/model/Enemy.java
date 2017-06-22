package model;
/**
 * 
 * @author dimitri,anthony,alexis,florian
 *
 */
public abstract class Enemy extends Elements implements KillSomeone, DropDiamond{
	
	@Override
	public void getSprite(){
			
		}
	/**
	 * @see Elements
	 * Method for the positionX
     * @return PositionX of the Enemy
	 */
		@Override
		public int getPositionX() {
			return PositionX;
		}
		/**
		 * @see Elements
		 * Method modify the positionX
		 */
		public void setPositionX(int positionX) {
			PositionX = positionX;
		}
		/**
		 * @see Elements
		 * Method for the positionY
	     * @return PositionX of the Element
		 */
		@Override
		public int getPositionY() {
			return PositionY;
		}
		/**
		 * @see Elements
		 * Method modify the positionX
		 */
		public void setPositionY(int positionY) {
			PositionY = positionY;
		}
		/**
		 * @see KillSomeone
		 */
		@Override 
		public void Kill(){
			
		}
		/**
		 * @see Die
		 */
		@Override 
		public void ToDie(){
			
		}
		/**
		 * @see DropDiamond
		 * Enemy drop 5 Diamonds
		 */
		public int DropDiamonds(){
			return 5;
		}

}
