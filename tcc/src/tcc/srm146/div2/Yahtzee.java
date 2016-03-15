/**
 * 
 */
package tcc.srm146.div2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author cbyrd17
 *
 */
public class Yahtzee {

	/**
	 * @param toss
	 *            each element represents the upward face of a die
	 * @return the maximum possible score with these values.
	 */
	public final int maxPoints(final int[] toss) {
		final Map<Integer, Integer> points = new ConcurrentHashMap<Integer, Integer>();

		Integer key;
		for (final int i : toss) {
			key = Integer.valueOf(i);
			if (points.containsKey(key)) {
				points.replace(key, points.get(key) + key);
			} else {
				points.put(key, key);
			}
		}
		
		

		return 5;
	}

}
