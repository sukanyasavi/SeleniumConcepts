package c.a.s;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void test() {
		JunitTesting sqtest = new JunitTesting();
		int output=sqtest.square(5);
		assertEquals(10,output);
		 
		
	}
	

}
