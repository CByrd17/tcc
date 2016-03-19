/**
 * 
 */
package tcc.srm149.div2;

/**
 * @author cbyrd17
 *
 */
public class FormatAmt {

	/**
	 *
	 */
	private static final int MIN_CENT_VALUE_NOT_REQUIRING_LEADING_ZERO = 10;
	/**
	 *
	 */
	private static final int MAX_SIZE_COMMA_SEPARATED_GROUPINGS = 3;

	public final String amount(final int dollars, final int cents) {
		final StringBuilder amount = new StringBuilder("$");

		if (dollars < 0) {
			amount.append("0");
		} else {
			String dollar = String.valueOf(dollars);
			int initialSet = dollar.length()
					% MAX_SIZE_COMMA_SEPARATED_GROUPINGS;
			switch (initialSet) {
			case 1:
				amount.append(dollar.charAt(0));
				amount.append(",");
				break;
			case 2:
				amount.append(dollar.charAt(0));
				amount.append(dollar.charAt(1));
				amount.append(",");
				break;
			default:
				break;
			}

			boolean firstPass = true;
			int triple = 1;
			for (int i = initialSet; i < dollar.length(); i++, triple++) {
				amount.append(dollar.charAt(i));
				if (!firstPass
						&& triple == MAX_SIZE_COMMA_SEPARATED_GROUPINGS) {
					triple = 0;
					if (i + 1 != dollar.length()) {
						amount.append(",");
					}
				}
				firstPass = false;
			}
		}
		amount.append(".");
		if (cents < MIN_CENT_VALUE_NOT_REQUIRING_LEADING_ZERO) {
			amount.append(0);
		}
		amount.append(cents);

		return amount.toString();
	}

}
