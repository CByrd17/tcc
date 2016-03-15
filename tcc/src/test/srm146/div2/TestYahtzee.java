/**
 * 
 */
package test.srm146.div2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tcc.srm146.div2.Yahtzee;

/**
 * @author cbyrd17
 *
 */
public class TestYahtzee {

	@Test
	public void testMaxPoints0() {
		Yahtzee y = new Yahtzee();

		int[] seed = { 2, 2, 3, 5, 4 };

		int expected = 5;
		int result = y.maxPoints(seed);

		assertEquals(expected, result);
	}

	@Test
	public void testMaxPoints1() {
		Yahtzee y = new Yahtzee();

		int[] seed = { 6, 4, 1, 1, 3 };

		int expected = 6;
		int result = y.maxPoints(seed);

		assertEquals(expected, result);
	}

}
