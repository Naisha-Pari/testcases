package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCompare {

	@Test
	public void testfindMax() {
		//testcase1 obj = new testcase1();
		assertEquals(3,testcase1.findMax(new int[]{1,2,3}));
	}
	@Test
	public void testfindMax1() {
		//testcase1 obj = new testcase1();
		assertEquals(3,testcase1.findMax1(new float[]{1,2,3}),0.0001);
	}
	@Test
	public void testfindMaxString() {
		//testcase1 obj = new testcase1();
		assertEquals(-9,testcase1.findMaxString());
	}
}
