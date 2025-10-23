package comTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.AddSub;

public class AddationSubstration {
	AddSub a = new AddSub();
	@Test
	void add() {	
		assertEquals(300, a.add(100, 200));		//300
	}
	@Test
	void sub() {	
		assertEquals(100, a.sub(200, 100));		//100
	}
}
