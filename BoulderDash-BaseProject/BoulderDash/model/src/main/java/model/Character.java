package model;

public class Character implements LoseLifePoints{
	

	public static int getLifePoints() {
		return Character.LifePoints;
	}
	
	public void setLifePoints (int LifePoints) {
		LoseLifePoints.LifePoints = LifePoints;
	}
}
