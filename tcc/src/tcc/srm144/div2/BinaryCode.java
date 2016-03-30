/**
 * 
 */
package tcc.srm144.div2;

/**
 * @author cbyrd17
 *
 */
public class BinaryCode {

	/**
	 * @param message
	 *            contains an encrypted string
	 * @return exactly two elements. The first element should contain the
	 *         decrypted string assuming the first character is '0'; the second
	 *         element should assume the first character is '1'. If either
	 *         string is impossibly constructed based on the assumption, return
	 *         the string "NONE" in its place.
	 */
	public final String[] decode(final String message) {
		final String[] result = new String[2];

		result[0] = decodeWithAssumption(message, "0");
		result[1] = decodeWithAssumption(message, "1");

		return result;
	}

	/**
	 * @param message
	 *            contains an encrypted string
	 * @param assumption
	 *            either "0" or "1"
	 * @return the decrypted string assuming the first character is as given. If
	 *         string is impossibly constructed based on the assumption, return
	 *         the string "NONE" in its place.
	 */
	public final String decodeWithAssumption(final String message,
			final String assumption) {
		final StringBuffer none = new StringBuffer("NONE");
		StringBuffer decryptedMessage = new StringBuffer(assumption);
		int left = 0;
		int now = Integer.parseInt(assumption);
		int right = -1;

		final char[] encryptedMessage = message.toCharArray();

		for (int current = 0; current < message.length(); current++) {
			final int encryptedInt = Character
					.getNumericValue(encryptedMessage[current]);
			right = encryptedInt - left - now;
			if (right < 0 || right > 1 || encryptedInt != left + right + now) {
				decryptedMessage = none;
				break;
			} else {
				if (current + 1 != message.length()) {
					decryptedMessage.append(right);
				}
				left = now;
				now = right;
				right = -1;
			}
		}

		return decryptedMessage.toString();
	}

}
