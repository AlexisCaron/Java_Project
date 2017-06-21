package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EndGameTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void EndTest() {
    final int expected1 = 1;
    final int expected2 = 0;
    LosedLifePoints();
    LosedLifePoints();
    LosedLifePoints();
    assertEquals(expected2, model.LoseLifePoints.getLifePoints());
    assertEquals(expected1, model.LoseLifePoints.EndGame());
	}

}
