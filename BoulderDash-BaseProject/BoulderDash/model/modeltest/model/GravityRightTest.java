package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GravityRightTest {

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
	public void GravityRight() {
		final int expected1 = 1; //Position X
		final int expected2 = -1; //Position Y
		assertEquals(expected1, model.Gravity.getPositionX());
		assertEquals(expected1, model.Gravity.getPositionY());
	}

}
