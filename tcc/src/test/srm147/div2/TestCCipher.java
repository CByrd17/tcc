/**
 * 
 */
package test.srm147.div2;

import static org.junit.Assert.*;

import org.junit.Test;

import tcc.srm145.div2.ImageDithering;
import tcc.srm147.div2.CCipher;

/**
 * @author CByrd17
 *
 */
public class TestCCipher {

	public TestCCipher() {

	}

	@Test
	public final void testDecode0() {
		CCipher cc = new CCipher();

		String cipherSeed = "VQREQFGT";
		int shift = 2;

		String expected = "TOPCODER";
		String result = cc.decode(cipherSeed, shift);

		assertEquals(expected, result);
	}

	@Test
	public final void testDecode1() {
		CCipher cc = new CCipher();

		String cipherSeed = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int shift = 10;

		String expected = "QRSTUVWXYZABCDEFGHIJKLMNOP";
		String result = cc.decode(cipherSeed, shift);

		assertEquals(expected, result);
	}

	@Test
	public final void testDecode2() {
		CCipher cc = new CCipher();

		String cipherSeed = "TOPCODER";
		int shift = 0;

		String expected = "TOPCODER";
		String result = cc.decode(cipherSeed, shift);

		assertEquals(expected, result);
	}

	@Test
	public final void testDecode3() {
		CCipher cc = new CCipher();

		String cipherSeed = "ZWBGLZ";
		int shift = 25;

		String expected = "AXCHMA";
		String result = cc.decode(cipherSeed, shift);

		assertEquals(expected, result);
	}

	@Test
	public final void testDecode4() {
		CCipher cc = new CCipher();

		String cipherSeed = "DBNPCBQ";
		int shift = 1;

		String expected = "CAMOBAP";
		String result = cc.decode(cipherSeed, shift);

		assertEquals(expected, result);
	}

	@Test
	public final void testDecode5() {
		CCipher cc = new CCipher();

		String cipherSeed = "LIPPSASVPH";
		int shift = 4;

		String expected = "HELLOWORLD";
		String result = cc.decode(cipherSeed, shift);

		assertEquals(expected, result);
	}

	@Test
	public final void testDecodeALetterA() {
		CCipher cc = new CCipher();

		char codedSeed = 'A';
		int shift = 0;

		char expected = 'A';
		char result = cc.decodeALetter(codedSeed, shift);

		assertEquals(expected, result);
	}

	@Test
	public final void testDecodeALetterB() {
		CCipher cc = new CCipher();

		char codedSeed = 'B';
		int shift = 0;

		char expected = 'B';
		char result = cc.decodeALetter(codedSeed, shift);

		assertEquals(expected, result);
	}

	@Test
	public final void testDecodeALetterAShift() {
		CCipher cc = new CCipher();

		char codedSeed = 'A';
		int shift = 3;

		char expected = 'X';
		char result = cc.decodeALetter(codedSeed, shift);

		assertEquals(expected, result);
	}

	@Test
	public final void testDecodeALetterZShift() {
		CCipher cc = new CCipher();

		char codedSeed = 'A';
		int shift = 1;

		char expected = 'Z';
		char result = cc.decodeALetter(codedSeed, shift);

		assertEquals(expected, result);
	}
}
