package model;
/**
 * 
 * @author dimitri,anthony,alexis,florian
 *
 */
public class Wall extends Elements implements Impenetrable{
	
	/**
	 * @see Impenetrable
	 */
	@Override
	public void Blocked(){
		}
	/**
	 * Method Override because it's inheritance with class Abstract Element 
	 */
	@Override
	public void getSprite(){
			
		}
	/**
	 * Method for the positionX
	 * @return PositionX of the Wall
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
		 * Method for the positionX
		 * @return PositionY of the Wall
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

}
