package model;

public interface MoveCharacter {
	public default boolean MoveUp(){
		return (true);
	}

	public default boolean MoveDown(){
		return (true);
	}
	public default boolean MoveLeft(){
		return (true);
	}
	public default boolean MoveRight(){
		return (true);
	}
}
