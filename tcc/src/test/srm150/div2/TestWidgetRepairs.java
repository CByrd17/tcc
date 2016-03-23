/**
 * 
 */
package test.srm150.div2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tcc.srm150.div2.WidgetRepairs;

/**
 * @author CByrd17
 *
 */
public final class TestWidgetRepairs {

	/**
	 * 
	 */
	@Test
	public void testDays0() {
		WidgetRepairs widgetRepairs = new WidgetRepairs();

		final int[] arrivalsSeed = { 10, 0, 0, 4, 20 };

		final int numPerDaySeed = 8;

		final int expected = 6;
		int result = widgetRepairs.days(arrivalsSeed, numPerDaySeed);

		assertEquals(expected, result);
	}

	/**
	 * 
	 */
	@Test
	public void testDays1() {
		WidgetRepairs widgetRepairs = new WidgetRepairs();

		final int[] arrivalsSeed = { 0, 0, 0 };

		final int numPerDaySeed = 10;

		final int expected = 0;
		int result = widgetRepairs.days(arrivalsSeed, numPerDaySeed);

		assertEquals(expected, result);
	}

	/**
	 * 
	 */
	@Test
	public void testDays2() {
		WidgetRepairs widgetRepairs = new WidgetRepairs();

		final int[] arrivalsSeed = { 100, 100 };

		final int numPerDaySeed = 10;

		final int expected = 20;
		int result = widgetRepairs.days(arrivalsSeed, numPerDaySeed);

		assertEquals(expected, result);
	}

	/**
	 * 
	 */
	@Test
	public void testDays3() {
		WidgetRepairs widgetRepairs = new WidgetRepairs();

		final int[] arrivalsSeed = { 27, 0, 0, 0, 0, 9 };

		final int numPerDaySeed = 9;

		final int expected = 4;
		int result = widgetRepairs.days(arrivalsSeed, numPerDaySeed);

		assertEquals(expected, result);
	}

	/**
	 * 
	 */
	@Test
	public void testDays4() {
		WidgetRepairs widgetRepairs = new WidgetRepairs();

		final int[] arrivalsSeed = { 6, 5, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4, 5,
				6 };

		final int numPerDaySeed = 3;

		final int expected = 15;
		int result = widgetRepairs.days(arrivalsSeed, numPerDaySeed);

		assertEquals(expected, result);
	}
}
