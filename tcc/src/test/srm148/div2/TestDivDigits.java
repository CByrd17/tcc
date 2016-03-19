/**
 * 
 */
package test.srm148.div2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tcc.srm148.div2.DivDigits;

/**
 * @author cbyrd17
 *
 */
public class TestDivDigits {

	/**
	 * 
	 */
	@Test
	public final void testHowMany0() {
		final DivDigits divDigits = new DivDigits();

		final int seed = 12345;

		final int expected = 3;
		final int result = divDigits.howMany(seed);

		assertEquals(expected, result);
	}

	/**
	 * 
	 */
	@Test
	public final void testHowMany1() {
		final DivDigits divDigits = new DivDigits();

		final int seed = 661232;

		final int expected = 3;
		final int result = divDigits.howMany(seed);

		assertEquals(expected, result);
	}

	/**
	 * 
	 */
	@Test
	public final void testHowMany2() {
		final DivDigits divDigits = new DivDigits();

		final int seed = 52527;

		final int expected = 0;
		final int result = divDigits.howMany(seed);

		assertEquals(expected, result);
	}
	
	/**
	 * 
	 */
	@Test
	public final void testHowMany3() {
		final DivDigits divDigits = new DivDigits();

		final int seed = 730000000;

		final int expected = 0;
		final int result = divDigits.howMany(seed);

		assertEquals(expected, result);
	}

}
