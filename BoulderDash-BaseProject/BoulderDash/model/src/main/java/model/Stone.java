package model;

public class Stone extends Elements implements Impenetrable, KillSomeone, Gravity{
	
	@Override
	public void getSprite(){
			
		}
		@Override
		public int getPositionX() {
			return PositionX;
		}
		public void setPositionX(int positionX) {
			PositionX = positionX;
		}
		@Override
		public int getPositionY() {
			return PositionY;
		}
		public void setPositionY(int positionY) {
			PositionY = positionY;
		}
		@Override 
		public void Fall(){
			
		}
		@Override 
		public void Kill(){
			
		}
		@Override
		public void Blocked(){
			
		}
}
