package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Player;

public class PlayerTest {

	private Player player;
	
	@Before
	public void setUp() throws Exception {
		this.player = new Player();
	}

	@Test
	public void testMove() {
		this.player.move(1, 0);
		assertSame(2,this.player.getPosPlayerX());
	}

}
