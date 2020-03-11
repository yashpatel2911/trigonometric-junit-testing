/**
 * 
 * Testing File
 * This class is for teating trigonometric functions such as sin, cos, and tan
 * using taylor series.
 * 
 * @author ASE Group 6
 * Dhrumil shah 	( 110024036 )
 * Raj Patel 		( 110020706 )
 * Sunny Patel 		( 110010345 )
 * Yash Patel 		( 110011738 )
 * 
 * @version 1.0.0
 * 
 */

package group6.taylortrigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrigonometricFunctionsTest
{
	double decimalpoints = 0.0000001;

	@Test
	void testSin1()
	{
		// this test is used for checking sin(x) value compare to Math.sin(x)
		assertEquals(Math.sin(2), TrigonometricFunctions.sin(2), decimalpoints);
	}

	@Test
	void testCos1()
	{
		// this test is used for checking cos(x) value compare to Math.cos(x)
		assertEquals(Math.cos(2), TrigonometricFunctions.cos(2), decimalpoints);
	}

	@Test
	void testTan1()
	{
		// this test is used for checking tan(x) value compare to Math.tan(x)
		assertEquals(Math.tan(2), TrigonometricFunctions.tan(2), decimalpoints);
	}
	
	@Test
	void testSin2()
	{
		// this test is used for finding value for Degree
		assertEquals(0.8660, TrigonometricFunctions.sin(60), "Failed in Degree!");
	}

	@Test
	void testCos2()
	{
		// this test is used for finding value for Degree
		assertEquals(0.5, TrigonometricFunctions.cos(2), "Failed in Degree!");
	}

	@Test
	void testTan2()
	{
		// this test is used for finding value for Degree
		assertEquals(1.7320, TrigonometricFunctions.tan(2), "Failed in Degree!");
	}

	@Test
	void testSin3()
	{
		// this test is used for finding that the function will generate accurate value
				// or not
		assertEquals(Math.sin(20), TrigonometricFunctions.sin(20), "Value beyond 2PI");
	}

	@Test
	void testCos3()
	{
		// this test is used for finding that the function will generate accurate value
				// or not
		assertEquals(Math.cos(20), TrigonometricFunctions.cos(20), "Value beyond 2PI");
	}

	@Test
	void testTan3()
	{
		// this test is used for finding that the function will generate accurate value
				// or not
		assertEquals(Math.tan(20), TrigonometricFunctions.tan(20), "Value beyond 2PI");
	}


}
