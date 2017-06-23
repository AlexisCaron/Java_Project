package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Player;

public class PlayerTest {
	
	

	private Player player;
	
	/**
	 * we instantiate a new player
	 * @throws Exception
	 */
	
	@Before
	public void setUp() throws Exception {
		this.player = new Player();
	}
	
	/**
	 *   This test allows us to see if the character can move
	 */

	@Test
	public void testMove() {
		this.player.move(1, 0);
		assertSame(2,this.player.getPosPlayerX());
	}

}
