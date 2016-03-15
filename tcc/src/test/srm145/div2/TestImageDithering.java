package test.srm145.div2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tcc.srm145.div2.ImageDithering;

public class TestImageDithering {
	@Test
	public void testCount0() {
		ImageDithering dc = new ImageDithering();

		String ditheredSeed = "BW";

		String[] screenSeed = { "AAAAAAAA", "ABWBWBWA", "AWBWBWBA", "ABWBWBWA",
				"AWBWBWBA", "AAAAAAAA" };

		int expected = 24;
		int result = dc.count(ditheredSeed, screenSeed);

		assertEquals(expected, result);
	}

	@Test
	public void testCount1() {
		ImageDithering dc = new ImageDithering();

		String ditheredSeed = "BW";

		String[] screenSeed = { "BBBBBBBB", "BBWBWBWB", "BWBWBWBB", "BBWBWBWB",
				"BWBWBWBB", "BBBBBBBB" };

		int expected = 48;
		int result = dc.count(ditheredSeed, screenSeed);

		assertEquals(expected, result);
	}

	@Test
	public void testCount2() {
		ImageDithering dc = new ImageDithering();

		String ditheredSeed = "ACEGIKMOQSUWY";

		String[] screenSeed = {
				"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX" };

		int expected = 150;
		int result = dc.count(ditheredSeed, screenSeed);

		assertEquals(expected, result);
	}

	@Test
	public void testCount3() {
		ImageDithering dc = new ImageDithering();

		String ditheredSeed = "CA";

		String[] screenSeed = { "BBBBBBB", "BBBBBBB", "BBBBBBB" };

		int expected = 0;
		int result = dc.count(ditheredSeed, screenSeed);

		assertEquals(expected, result);
	}

	@Test
	public void testCount4() {
		ImageDithering dc = new ImageDithering();

		String ditheredSeed = "DCBA";

		String[] screenSeed = { "ACBD" };

		int expected = 4;
		int result = dc.count(ditheredSeed, screenSeed);

		assertEquals(expected, result);
	}
}
