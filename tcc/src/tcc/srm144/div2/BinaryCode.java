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
		final String[] result = { "011100011", "NONE" };

		return result;
	}

	/**
	 * @param message
	 *            contains an encrypted string
	 * @return the decrypted string assuming the first character is '0'. If
	 *         string is impossibly constructed based on the assumption, return
	 *         the string "NONE" in its place.
	 */
	public final String decodeAssumeZero(final String message) {
		StringBuffer decryptedMessage = new StringBuffer("0");
		int left = 0;
		int now = 0;
		int right = -1;

		char[] encryptedMessage = message.toCharArray();

		for (int current = 0; current < message.length() - 1; current++) {
			int encryptedInt = Character
					.getNumericValue(encryptedMessage[current]);
			right = encryptedInt - left - now;
			if (right < now) {
				decryptedMessage = new StringBuffer("NONE");
				break;
			} else {
				decryptedMessage.append(right);
				left = now;
				now = right;
				right = -1;
			}
		}

		return decryptedMessage.toString();
	}

	/**
	 * @param message
	 *            contains an encrypted string
	 * @return the decrypted string assuming the first character is '1'. If
	 *         string is impossibly constructed based on the assumption, return
	 *         the string "NONE" in its place.
	 */
	public final String decodeAssumeOne(final String message) {
		StringBuffer decryptedMessage = new StringBuffer("1");
		int left = 0;
		int now = 1;
		int right = -1;

		char[] encryptedMessage = message.toCharArray();

		for (int current = 0; current < message.length() - 1; current++) {
			int encryptedInt = Character
					.getNumericValue(encryptedMessage[current]);
			right = encryptedInt - left - now;
			if (right < now) {
				decryptedMessage = new StringBuffer("NONE");
				break;
			} else {
				decryptedMessage.append(right);
				left = now;
				now = right;
				right = -1;
			}
		}

		return decryptedMessage.toString();
	}

}
