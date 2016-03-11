package test.srm144.div2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import tcc.srm144.div2.Time;

/**
 * @author cbyrd17
 *
 */
public class TestTime {

	@Test
	public void testWhatTime() {
		Time t = new Time();

		int seed = 0;

		String expected = "0:0:0";
		String result = t.whatTime(seed);

		assertEquals(expected, result);
	}

	@Test
	public void testWhatTime2() {
		Time t = new Time();

		int seed = 3661;

		String expected = "1:1:1";
		String result = t.whatTime(seed);

		assertEquals(expected, result);
	}

	@Test
	public void testWhatTime3() {
		Time t = new Time();

		int seed = 5436;

		String expected = "1:30:36";
		String result = t.whatTime(seed);

		assertEquals(expected, result);
	}

	@Test
	public void testWhatTime4() {
		Time t = new Time();

		int seed = 86399;

		String expected = "23:59:59";
		String result = t.whatTime(seed);

		assertEquals(expected, result);
	}

	@Test
	public void testHowManyHoursZero() {
		Time t = new Time();

		int expected = 0;
		int result = t.howManyHours(expected * 60 * 60);

		assertEquals(expected, result);
	}

	@Test
	public void testHowManyHoursOne() {
		Time t = new Time();

		int expected = 1;
		int result = t.howManyHours(expected * 60 * 60);

		assertEquals(expected, result);
	}

	@Test
	public void testHowManyHoursOnePlus() {
		Time t = new Time();

		int expected = 1;
		int result = t.howManyHours(expected * 60 * 60 + 3);

		assertEquals(expected, result);
	}

	@Test
	public void testHowManyMinutesZero() {
		Time t = new Time();

		int expected = 0;
		int result = t.howManyMinutes(expected * 60);

		assertEquals(expected, result);
	}

	@Test
	public void testHowManyMinutesOne() {
		Time t = new Time();

		int expected = 1;
		int result = t.howManyMinutes(expected * 60);

		assertEquals(expected, result);
	}

	@Test
	public void testHowManyMinutesOnePlus() {
		Time t = new Time();

		int expected = 1;
		int result = t.howManyMinutes(expected * 60 + 3);

		assertEquals(expected, result);
	}

	@Test
	public void testHowManyMinutes1Hour1Minute1Second() {
		Time t = new Time();

		int seed = 3661;

		int expected = 1;
		int result = t.howManyMinutes(seed);

		assertEquals(expected, result);
	}

	@Test
	public void testHowManySecondsZero() {
		Time t = new Time();

		int expected = 0;
		int result = t.howManySeconds(expected);

		assertEquals(expected, result);
	}

	@Test
	public void testHowManySecondsOne() {
		Time t = new Time();

		int expected = 1;
		int result = t.howManySeconds(expected);

		assertEquals(expected, result);
	}

	@Test
	public void testHowManySecondsThree() {
		Time t = new Time();

		int expected = 3;
		int result = t.howManySeconds(expected);

		assertEquals(expected, result);
	}

	@Test
	public void testHowManySecondsMinute() {
		Time t = new Time();

		int expected = 3;
		int result = t.howManySeconds(60 + expected);

		assertEquals(expected, result);
	}

	@Test
	public void testHowManySeconds2Minute() {
		Time t = new Time();

		int expected = 3;
		int result = t.howManySeconds(60 * 2 + expected);

		assertEquals(expected, result);
	}

	@Test
	public void testHowManySecondsHour() {
		Time t = new Time();

		int expected = 3;
		int result = t.howManySeconds(60 * 60 + expected);

		assertEquals(expected, result);
	}

	@Test
	public void testHowManySeconds2Hour() {
		Time t = new Time();

		int expected = 3;
		int result = t.howManySeconds(60 * 60 * 2 + expected);

		assertEquals(expected, result);
	}

	@Test
	public void testHowManySecondsHourAndMinute() {
		Time t = new Time();

		int expected = 3;
		int result = t.howManySeconds(60 * 60 + 60 + expected);

		assertEquals(expected, result);
	}

	@Test
	public void testHowManySeconds2HourAnd2Minute() {
		Time t = new Time();

		int expected = 3;
		int result = t.howManySeconds(60 * 60 * 2 + 60 * 2 + expected);

		assertEquals(expected, result);
	}

	@Test
	public void testHowManySeconds1Hour1Minute1Second() {
		Time t = new Time();

		int seed = 3661;

		int expected = 1;
		int result = t.howManySeconds(seed);

		assertEquals(expected, result);
	}

}
