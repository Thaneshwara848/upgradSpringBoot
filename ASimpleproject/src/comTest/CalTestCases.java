package comTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import com.Cal;

class CalTestCases {

	@Test
	void add() {
		Cal c = new Cal();
		assertEquals(300, c.add(100, 200));
	}
	
	
	@Test
	@Ignore
	void sub() {
		Cal c = new Cal();
		assertEquals(100, c.sub(200, 100));
	}
	@Test
	void mul() {
		Cal c = new Cal();
		assertEquals(200, c.mul(20, 10));
	}

	@Test
	void div() {
		Cal c = new Cal();
		assertEquals(2, c.div(200, 100));
	}
}
