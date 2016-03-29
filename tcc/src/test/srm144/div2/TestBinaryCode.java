package test.srm144.div2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tcc.srm144.div2.BinaryCode;

/**
 * @author cbyrd17
 *
 */
public class TestBinaryCode {

	/**
	 * 
	 */
	@Test
	public final void testDecode0() {
		final BinaryCode binaryCode = new BinaryCode();

		final String seed = "123210122";

		final String[] expected = { "011100011", "NONE" };
		final String[] result = binaryCode.decode(seed);

		assertArrayEquals(expected, result);
	}

	/**
	 * 
	 */
	@Test
	public final void testDecodeAssumeZero0() {
		final BinaryCode binaryCode = new BinaryCode();

		final String seed = "123210122";

		final String expected = "011100011";
		final String result = binaryCode.decodeAssumeZero(seed);

		assertEquals(expected, result);
	}

	/**
	 * 
	 */
	@Test
	public final void testDecodeAssumeOne0() {
		final BinaryCode binaryCode = new BinaryCode();

		final String seed = "123210122";

		final String expected = "NONE";
		final String result = binaryCode.decodeAssumeOne(seed);

		assertEquals(expected, result);
	}

	/**
	 * 
	 */
	@Test
	public final void testDecode1() {
		final BinaryCode binaryCode = new BinaryCode();

		final String seed = "11";

		final String[] expected = { "01", "10" };
		final String[] result = binaryCode.decode(seed);

		assertArrayEquals(expected, result);
	}

	/**
	 * 
	 */
	@Test
	public final void testDecodeAssumeZero1() {
		final BinaryCode binaryCode = new BinaryCode();

		final String seed = "11";

		final String expected = "01";
		final String result = binaryCode.decodeAssumeZero(seed);

		assertEquals(expected, result);
	}

	/**
	 * 
	 */
	@Test
	public final void testDecode2() {
		final BinaryCode binaryCode = new BinaryCode();

		final String seed = "22111";

		final String[] expected = { "NONE", "11001" };
		final String[] result = binaryCode.decode(seed);

		assertArrayEquals(expected, result);
	}

	/**
	 * 
	 */
	@Test
	public final void testDecode3() {
		final BinaryCode binaryCode = new BinaryCode();

		final String seed = "123210120";

		final String[] expected = { "NONE", "NONE" };
		final String[] result = binaryCode.decode(seed);

		assertArrayEquals(expected, result);
	}

}
