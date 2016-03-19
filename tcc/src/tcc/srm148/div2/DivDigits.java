/**
 * 
 */
package tcc.srm148.div2;

/**
 * @author cbyrd17
 *
 */
public class DivDigits {

	/**
	 * @param number
	 *            between 10000 and 999999999, inclusive (between 5 and 9
	 *            digits, inclusive).
	 * @return how many digits in the number that the number itself is divisible
	 *         by
	 */
	public final int howMany(final int number) {
		int count = 0;
		final String digits = String.valueOf(number);
		for (final char digit : digits.toCharArray()) {
			int intDigit = Character.getNumericValue(digit);
			if (intDigit != 0 && number % intDigit == 0) {
				count++;
			}
		}

		return count;
	}

}
