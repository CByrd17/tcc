/**
 * 
 */
package tcc.srm150.div2;

/**
 * @author CByrd17
 *
 */
public class WidgetRepairs {

	/**
	 * @param arrivals
	 *            contains between 1 and 20 elements, inclusive. Each element of
	 *            arrivals is between 0 and 100, inclusive.
	 * @param numPerDay
	 *            is between 1 and 50, inclusive.
	 * @return the number of days of operation
	 */
	public final int days(final int[] arrivals, final int numPerDay) {

		int operating = 0;
		int inQueue = 0;
		for (int items : arrivals) {
			inQueue += items;
			if (inQueue > 0) {
				operating++;
			}
			if (inQueue > numPerDay) {
				inQueue -= numPerDay;
			} else {
				inQueue = 0;
			}
		}

		while (inQueue > 0) {
			operating++;
			inQueue -= numPerDay;
		}

		return operating;
	}
}
