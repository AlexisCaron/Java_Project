package model;

public interface DropDiamond extends Die{
	public default int DropDiamonds(){
		return 5;
		
	}
	@Override 
	public default void ToDie(){
		
	}

}
