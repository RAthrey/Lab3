import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	private GradeBook g1;
	private GradeBook g2;
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
	    g2 = new GradeBook(5);
	    g1.addScore(50);
	    g1.addScore(75);
	    g2.addScore(60);
	    g2.addScore(85);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
	    g2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("50.0 75.0 "));
	    assertEquals(2, g1.getScoreSize());
	    assertTrue(g2.toString().equals("60.0 85.0 "));
	    assertEquals(2, g2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(125.0, g1.sum(), 0.0001);
	    assertEquals(145.0, g2.sum(), 0.0001);
	}

	@Test
	void testMinimum() {
		assertEquals(50.0, g1.minimum(), 0.0001);
	    assertEquals(60.0, g2.minimum(), 0.0001);
	}

	@Test
	void testFinalScore() {
		assertEquals(75.0, g1.finalScore(), 0.0001);
	    assertEquals(85.0, g2.finalScore(), 0.0001);
	}

}
