/**
 * 
 */
package test.srm144.div2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tcc.srm144.div2.PowerOutage;
import tcc.srm145.div2.ImageDithering;

/**
 * @author cbyrd17
 *
 */
public class TestPowerOutage {

	@Test
	public final void testEstimateTimeOut0() {
		PowerOutage powerOutage = new PowerOutage();

		final int[] fromJunctionSeed = { 0 };
		final int[] toJunctionSeed = { 1 };
		final int[] ductLengthSeed = { 10 };

		final int expected = 10;

		final int result = powerOutage.estimateTimeOut(fromJunctionSeed,
				toJunctionSeed, ductLengthSeed);

		assertEquals(expected, result);
	}

	@Test
	public final void testEstimateTimeOut1() {
		PowerOutage powerOutage = new PowerOutage();

		final int[] fromJunctionSeed = { 0, 1, 0 };
		final int[] toJunctionSeed = { 1, 2, 3 };
		final int[] ductLengthSeed = { 10, 10, 10 };

		final int expected = 40;

		final int result = powerOutage.estimateTimeOut(fromJunctionSeed,
				toJunctionSeed, ductLengthSeed);

		assertEquals(expected, result);
	}

}