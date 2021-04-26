package c.a.s;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountTest {

	@Test
	void test() {
		JunitTesting cttest = new JunitTesting();
		int output=cttest.countA("alphabet");
		assertEquals(2,output);
	}

}
