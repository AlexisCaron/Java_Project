package model;
/**
 * 
 * @author dimitri,anthony,alexis,florian
 *
 */
public class Sand extends Elements implements Change{

	/**
	 * Method Override because it's inheritance with class Abstract Element 
	 */
	@Override
	public void getSprite(){
			
		}
	/**
	 * Method for the positionX
	 * @return PositionX of the sand
	 */
		@Override
		public int getPositionX() {
			return PositionX;
		}
		/**
		 * Method  modify the positionX
		 * 
		 */
		public void setPositionX(int positionX) {
			PositionX = positionX;
		}
		/**
		 * Method for the positionY
	     * @return PositionX of the sand
		 */
		@Override
		public int getPositionY() {
			return PositionY;
		}
		/**
		 * Method  modify the positionY
		 * 
		 */
		public void setPositionY(int positionY) {
			PositionY = positionY;
		}
		/**
		 * @see Change
		 */
		@Override
		public void Changer(){
			
		}
}
