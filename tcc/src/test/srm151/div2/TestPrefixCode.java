/**
 * 
 */
package test.srm151.div2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tcc.srm151.div2.PrefixCode;

/**
 * @author CByrd17
 *
 */
public class TestPrefixCode {
	/**
	 * 
	 */
	@Test
	public final void testIsOne0() {
		PrefixCode prefixCode = new PrefixCode();

		final String[] seed = { "trivial" };

		final String expected = "Yes";
		final String result = prefixCode.isOne(seed);

		assertEquals(expected, result);
	}

	/**
	 * 
	 */
	@Test
	public final void testIsOne1() {
		PrefixCode prefixCode = new PrefixCode();

		final String[] seed = { "10001", "011", "100", "001", "10" };

		final String expected = "No, 2";
		final String result = prefixCode.isOne(seed);

		assertEquals(expected, result);
	}

	/**
	 * 
	 */
	@Test
	public final void testIsOne2() {
		PrefixCode prefixCode = new PrefixCode();

		final String[] seed = { "no", "nosy", "neighbors", "needed" };

		final String expected = "No, 0";
		final String result = prefixCode.isOne(seed);

		assertEquals(expected, result);
	}

	/**
	 * 
	 */
	@Test
	public final void testIsOne3() {
		PrefixCode prefixCode = new PrefixCode();

		final String[] seed = { "1010", "11", "100", "0", "1011" };

		final String expected = "Yes";
		final String result = prefixCode.isOne(seed);

		assertEquals(expected, result);
	}

	/**
	 * 
	 */
	@Test
	public final void testIsOne4() {
		PrefixCode prefixCode = new PrefixCode();

		final String[] seed = { "No", "not" };

		final String expected = "Yes";
		final String result = prefixCode.isOne(seed);

		assertEquals(expected, result);
	}
}
