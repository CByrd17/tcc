package tcc.srm145.div2;

/**
 * @author cbyrd17
 *
 */
public class ImageDithering {

	/**
	 * @param dithered
	 *            color to find
	 * @param screen
	 *            where to look for the color
	 * @return how many pixels are on the screen making the dithered color
	 */
	public final int count(final String dithered, final String... screen) {

		int count = 0;
		for (final String s : screen) {
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < dithered.length(); j++) {
					if (dithered.charAt(j) == s.charAt(i)) {
						count++;
					}
				}
			}
		}

		return count;
	}

}
