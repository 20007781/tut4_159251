package tut4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest extends Calc {

	@Test
	void testAdd() {
		int a = 5 ;
		int b = 7 ;
		assertEquals( add(a,b),a+b );
	}

}
