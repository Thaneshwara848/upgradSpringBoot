package comTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.AddSub;

class MulDiv {
AddSub a = new AddSub();
	
	@Test
	void mul() {	
		assertEquals(200, a.mul(10, 20));		//200
	}
	@Test
	void div() {	
		assertEquals(2, a.div(200, 100));		//2
	}

}
