/**
 * 
 */
package com.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author akash
 *
 */
class OperationServiceTest {

	/**
	 * Test method for {@link com.service.OperationService#add(int, int)}.
	 */
	@Test							// it is like a main method 
	void testAdd() {
		//fail("Not yet implemented");
		OperationService os = new OperationService();
		int result = os.add(100, 200);
		assertEquals(300, result);
	}
	@Test
	void testSub() {
		//fail("Not yet implemented");
		OperationService os = new OperationService();
		int result = os.sub(1000, 500);
		assertEquals(500, result);
	}
	@Test
	void testMul() {
		//fail("Not yet implemented");
		OperationService os = new OperationService();
		int result = os.mul(10, 2);
		assertEquals(20, result);
	}
	@Test
	void testDiv() {
		//fail("Not yet implemented");
		OperationService os = new OperationService();
		int result = os.div(1000, 200);
		assertEquals(5, result);
	}

}
