/**
 * 
 */
package test.srm149.div2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tcc.srm149.div2.FormatAmt;

/**
 * @author cbyrd17
 *
 */
public class TestFormatAmt {

	@Test
	public final void testAmount0() {
		FormatAmt formatAmount = new FormatAmt();

		final int seedDollars = 123456;
		final int seedCents = 0;

		final String expected = "$123,456.00";
		final String result = formatAmount.amount(seedDollars, seedCents);

		assertEquals(expected, result);
	}

	@Test
	public final void testAmount1() {
		FormatAmt formatAmount = new FormatAmt();

		final int seedDollars = 49734321;
		final int seedCents = 9;

		final String expected = "$49,734,321.09";
		final String result = formatAmount.amount(seedDollars, seedCents);

		assertEquals(expected, result);
	}

}
