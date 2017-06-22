package model;

public class Stone extends Elements implements Impenetrable, KillSomeone, Gravity{
	/**
	 * Method Override because it's inheritance with class Abstract Element 
	 */
	@Override
	public void getSprite(){
			
		}
	/**
	 * @see Elements
	 * Method for the positionX
	 * @return PositionX of the stone
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
	     * @return PositionX of the stone
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
		@Override
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
			/**
			 * Method for block 
			 */
		}
		/**
		 * @see Impenetrable
		 */
		@Override
		public void Blocked(){
			
		}
}
