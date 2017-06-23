package model;

public abstract class Enemy extends Elements implements KillSomeone, DropDiamond{
	
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
		public void Kill(){
			
		}
		@Override 
		public void ToDie(){
			
		}
		public int DropDiamonds(){
			return 5;
		}

}
