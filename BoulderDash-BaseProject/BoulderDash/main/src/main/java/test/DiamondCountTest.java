package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.Pannel;

public class DiamondCountTest {

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

	/**
	 * 	this test allows us to see if the getters and the setters of the diamonds taked by the character are functional	
	 */
	
	@Test
	public void testDiamond() {
		Pannel.setDiamondTaked(2);
		assertSame(2,Pannel.getDiamondTaked());
	}
	
	/**
	 *   this test allows us to see if the getters and the setters the diamonds remaining on the map are functional
	 */
	
	@Test
	public void testDiamondRemaining() {
		Pannel.setDiamondRemaining(8);
		assertSame(8,Pannel.getDiamondRemaining());
	}

}
