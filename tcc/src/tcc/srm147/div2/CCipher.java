/**
 * 
 */
package tcc.srm147.div2;

/**
 * @author CByrd17
 *
 */
public class CCipher {

	/**
	 * @param cipherChar
	 *            an uppercase letter 'A'-'Z'
	 * @param shift
	 *            a number between 0 and 25 inclusive
	 * @return an uppercase letter advanced in the alphabet by the value of
	 *         shift, wrapping from Z to A if necessary
	 */
	public final char decodeALetter(final char cipherChar, final int shift) {
		int decoded = (cipherChar - shift);
		if (decoded < 'A') {
			decoded = 'A' - decoded;
			decoded = ('Z' - decoded + 1);
		}
		return (char) decoded;
	}

	/**
	 * @param cipherText
	 *            a collection of 0 to 50 characters where each character is an
	 *            uppercase letter 'A'-'Z'
	 * @param shift
	 *            a number between 0 and 25 inclusive
	 * @return a String of uppercase letters each advanced in the alphabet by
	 *         the value of shift, wrapping from Z to A if necessary
	 */
	public final String decode(final String cipherText, final int shift) {
		final StringBuffer decoded = new StringBuffer("");

		for (final char c : cipherText.toCharArray()) {
			decoded.append(decodeALetter(c, shift));
		}

		return decoded.toString();
	}
}
