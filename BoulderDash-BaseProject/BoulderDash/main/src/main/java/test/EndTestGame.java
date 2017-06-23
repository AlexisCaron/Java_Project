package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EndTestGame {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		main.Pannel.diamondCount = 0;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	    final int expected = 0;
	    assertEquals(expected, main.Pannel.endGame);
	}

}
