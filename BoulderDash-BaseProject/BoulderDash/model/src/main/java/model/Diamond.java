package model;
/**
 * 
 * @author dimitri,anthony,alexis,florian
 *
 */
public class Diamond extends Elements implements KillSomeone, Gravity{
/**
 * Public attribute type integer
 */
	public int DiamondsRemaining;
/**
 * Method
 * @return The number of remaining diamonds
 */
	public int getDiamondsRemaining() {
		return DiamondsRemaining;
	}
/**
 * Write the number of remaining diamonds
 * @param diamondsRemaining number of diamonds
 */
	public void setDiamondsRemaining(int diamondsRemaining) {
		DiamondsRemaining = diamondsRemaining;
	}
	/**
	 * @see Elements
	 * Method Override because it's inheritance with class Abstract Element 
	 */
	@Override
	public void getSprite(){
			
		}
	/**
	 * @see Elements
	 * Method for the positionX
	 * @return PositionX of the Diamonds
	 */
		@Override
		public int getPositionX() {
			return PositionX;
		}
		/**
		 * @see Elements
		 * Method  modify the positionX
		 * 
		 */
		public void setPositionX(int positionX) {
			PositionX = positionX;
		}
		/**
		 * @see Elements
		 * Method for the positionY
	     * @return PositionX of the Diamonds
		 */
		@Override
		public int getPositionY() {
			return PositionY;
		}
		/**
		 * @see Elements
		 * Method  modify the positionY
		 * 
		 */
		public void setPositionY(int positionY) {
			PositionY = positionY;
		}
		/**
		 * @see Gravity
		 *Method inheritance of Gravity
		 */
		@Override
		public void Fall(){
			
		}
		/**
		 * @see KillSomeone
		 * Method for kill the hero 
		 */
		@Override
		public void Kill(){
			
		}
}
