package model;

public class Diamond extends Elements implements KillSomeone, Gravity{

	public int DiamondsRemaining;

	public int getDiamondsRemaining() {
		return DiamondsRemaining;
	}

	public void setDiamondsRemaining(int diamondsRemaining) {
		DiamondsRemaining = diamondsRemaining;
	}
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
}
