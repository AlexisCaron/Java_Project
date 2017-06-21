package model;

public interface LoseLifePoints {

	int LifePoints = 3;
	static int LosedLifePoints = 1;
	
	
	
	public static int getLifePoints() {
		return LifePoints;
	}
	
	public static int LosedLifePoints() {
		
		
		return LosedLifePoints;
	}
	
	public static void EndGame() {
		
	}
}
