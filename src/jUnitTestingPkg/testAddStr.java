package jUnitTestingPkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStr {

	@Test
	void test() {
		jUnitFunc obj = new jUnitFunc();
		String result = obj.addStr("s1", "s2");
		assertEquals("s1s2", result);
	}

}
