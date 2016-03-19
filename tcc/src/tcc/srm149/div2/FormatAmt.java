/**
 * 
 */
package tcc.srm149.div2;

/**
 * @author cbyrd17
 *
 */
public class FormatAmt {

	public final String amount(int dollars, int cents) {
		final StringBuffer amount = new StringBuffer("$");
		
		if(dollars < 0) {
			amount.append("0");
		} else {
			String dollar = String.valueOf(dollars);
			int initialSet = dollar.length() % 3;
			boolean initialSetComplete = false;
			int count = 1;
			for(char digit : dollar.toCharArray()) {
				if(!initialSetComplete && count++ <= initialSet) {
					amount.append(digit);
				} else {
					amount.append()
				}
			}
		}
		

		return "$123,456.00";
	}

}
