/**
 * 
 */
package tcc.srm151.div2;

/**
 * @author CByrd17
 *
 */
public class PrefixCode {

	/**
	 * @param words
	 *            contains between 1 and 50 elements, inclusive. Each element of
	 *            words contains between 1 and 50 characters, inclusive. Each
	 *            element of words consists only of characters '0'-'9', 'A'-'Z'
	 *            and 'a'-'z', inclusive. No two elements of words are equal (as
	 *            the input represents a set).
	 * @return the String "Yes" if that set of words is a prefix code or return
	 *         the String "No, i" if it is not, where i is replaced by the
	 *         lowest 0-based index of a String in words that is a prefix of
	 *         another String in words.
	 */
	public final String isOne(final String[] words) {
		int index = -1;
		for (int i = 0; i < words.length; i++) {
			String isAPrefix = words[i];
			for (int j = 0; j < words.length; j++) {
				String hasAPrefix = words[j];
				if (!isAPrefix.equals(hasAPrefix)
						&& hasAPrefix.startsWith(isAPrefix)) {
					index = i;
					break;
				}
			}
			if (index > -1) {
				break;
			}
		}
		String result;
		if (index > -1) {
			result = "No, " + index;
		} else {
			result = "Yes";
		}
		return result;
	}

}
