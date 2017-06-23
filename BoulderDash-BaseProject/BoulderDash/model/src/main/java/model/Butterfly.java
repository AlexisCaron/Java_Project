package model;

public class Butterfly extends Enemy implements MoveButterfly{
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
		@Override
		public void BehaviourButterfly(){
			
		}

}
