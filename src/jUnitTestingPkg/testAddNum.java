package jUnitTestingPkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNum {

	@Test
	void test() {
		jUnitFunc obj = new jUnitFunc();
		int result = obj.addNum(10, 20);
		assertEquals(30, result);
	}

}
