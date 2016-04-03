/**
 * 
 */
package test.srm144.div2;

import static org.junit.Assert.assertEquals;

import java.util.List;

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
		final int[] ductLengthSeed = { 10 };
		final int[] toJunctionSeed = { 1 };

		final int expected = 10;

		final int result = powerOutage.estimateTimeOut(fromJunctionSeed,
				toJunctionSeed, ductLengthSeed);

		assertEquals(expected, result);
	}

	@Test
	public final void testEstimateTimeOut1() {
		PowerOutage powerOutage = new PowerOutage();

		final int[] fromJunctionSeed = { 0, 1, 0 };
		final int[] ductLengthSeed = { 10, 10, 10 };
		final int[] toJunctionSeed = { 1, 2, 3 };

		final int expected = 40;

		final int result = powerOutage.estimateTimeOut(fromJunctionSeed,
				toJunctionSeed, ductLengthSeed);

		assertEquals(expected, result);
	}

	@Test
	public final void testEstimateTimeOut2() {
		PowerOutage powerOutage = new PowerOutage();

		final int[] fromJunctionSeed = { 0, 0, 0, 1, 4 };
		final int[] ductLengthSeed = { 10, 10, 100, 10, 5 };
		final int[] toJunctionSeed = { 1, 3, 4, 2, 5 };

		final int expected = 165;

		final int result = powerOutage.estimateTimeOut(fromJunctionSeed,
				toJunctionSeed, ductLengthSeed);

		assertEquals(expected, result);
	}

	@Test
	public final void testEstimateTimeOut3() {
		PowerOutage powerOutage = new PowerOutage();

		final int[] fromJunctionSeed = { 0, 0, 0, 1, 4, 4, 6, 7, 7, 7, 20 };
		final int[] ductLengthSeed = { 10, 10, 100, 10, 5, 1, 1, 100, 1, 1,
				5 };
		final int[] toJunctionSeed = { 1, 3, 4, 2, 5, 6, 7, 20, 9, 10, 31 };

		final int expected = 281;

		final int result = powerOutage.estimateTimeOut(fromJunctionSeed,
				toJunctionSeed, ductLengthSeed);

		assertEquals(expected, result);
	}

	@Test
	public final void testEstimateTimeOut4() {
		PowerOutage powerOutage = new PowerOutage();

		final int[] fromJunctionSeed = { 0, 0, 0, 0, 0 };
		final int[] ductLengthSeed = { 100, 200, 300, 400, 500 };
		final int[] toJunctionSeed = { 1, 2, 3, 4, 5 };

		final int expected = 2500;

		final int result = powerOutage.estimateTimeOut(fromJunctionSeed,
				toJunctionSeed, ductLengthSeed);

		assertEquals(expected, result);
	}

}