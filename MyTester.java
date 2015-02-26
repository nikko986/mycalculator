import org.junit.Test;

import junit.framework.TestCase;

public class MyTester extends TestCase {

	@Test
	//test for addition
	public void testAdd() {
		MyCalculator mc = new MyCalculator();
		float actual = mc.add(5,5);
		assertEquals("5+5=10", 10, actual, 0.0);
		
	}

	@Test
	//test for subtraction
	public void testSubtract() {
		MyCalculator mc = new MyCalculator();
		float actual = mc.subtract(5,5);
		assertEquals("5-5=0", 0, actual, 0.0);
		
	}

	@Test
	//test for multiplication
	public void testMultiply() {
		MyCalculator mc = new MyCalculator();
		float actual = mc.multiply(5,5);
		assertEquals("5*5=25", 25, actual, 0.0);
		
	}

	@Test
	//test for division
	public void testDivide() {
		MyCalculator mc = new MyCalculator();
		float actual = mc.divide(5,5);
		assertEquals("5/5=1", 1, actual, 0.0);
		
	}

	@Test
	//test for square function
	public void testSquare() {
		MyCalculator mc = new MyCalculator();
		float actual = mc.square(5);
		assertEquals("5^5=25", 25, actual, 0.0);
		
	}

	@Test
	//test for cube
	public void testCube() {
		MyCalculator mc = new MyCalculator();
		float actual = mc.cube(5);
		assertEquals("5^3=8", 125, actual, 0.0);
		
	}

	@Test
	//test for nfactorial 
	public void testNfactorial() {
		MyCalculator mc = new MyCalculator();
		float actual = mc.nfactorial(3);
		assertEquals("3!=6", 6, actual, 0.0);
		
	}

	@Test
	//test for binary search
	public void testBinarySearch() {
		int a[] = {0,1,2,3,4,5}; 
		MyCalculator mc = new MyCalculator();
		float actual = mc.binarySearch(a,5);
		assertEquals("0,1,2,3,4,5=5", 5, actual, 0.0);
	
	}
}


