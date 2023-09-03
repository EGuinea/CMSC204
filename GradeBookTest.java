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
		g1.addScore(87);
		g1.addScore(98);
		g1.addScore(67);
		g1.addScore(75);
		g2 = new GradeBook(5);
		g2.addScore(75);
		g2.addScore(45);
		g2.addScore(88);
		g2.addScore(78);
	}
	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}
	@Test
	void testAddScore() {
		assertEquals("87.0 98.0 67.0 75.0 0.0 ", g1.toString());

        g1.addScore(78);
        assertEquals("87.0 98.0 67.0 75.0 78.0 ", g1.toString());
	}

	@Test
	void testSum() {
		assertEquals(327.0, g1.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(67.0, g1.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(260.0, g1.finalScore());

	}

}
