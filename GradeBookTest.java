import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook g1;
	GradeBook g2;
	@BeforeEach
	void setUp() throws Exception {
		 g1 = new GradeBook(5);
		 g2 = new GradeBook(5);
		 
		 g1.addScore(33);
		 g1.addScore(90);
		 
		 g2.addScore(44);
		 g2.addScore(9);

	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.addScore(23));
		assertTrue(g1.addScore(30));
		
		
		assertTrue(g2.addScore(23));
		assertTrue(g2.addScore(78));
		assertTrue(g2.addScore(5));
		assertTrue(!g2.addScore(56));
		


	}
	
	@Test
	void testSum() {
		assertEquals(g2.sum(), 53);
		assertEquals(g1.sum(),123);
		
	}
	
	@Test
	void testMinimum() {
		assertEquals(g1.minimum(), 33);
		assertEquals(g2.minimum(), 9);
	}
	
	@Test
	void testFinalScore( ) {
		assertEquals(g1.finalScore(), 90);
		assertEquals(g2.finalScore(), 44);
		
	}
	
	@Test
	void testGetScoreSize() {
		assertEquals(g1.getScoreSize(), 2);
		assertEquals(g2.getScoreSize(), 2);
	}
	
	@Test
	void testToString() {
		assertTrue(g1.toString().contains("33.0"));
		assertTrue(g1.toString().contains("90.0"));
		assertTrue(g2.toString().contains("44.0"));
		assertTrue(g2.toString().contains("9.0"));

	}
}
