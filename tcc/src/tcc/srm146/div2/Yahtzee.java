/**
 * 
 */
package tcc.srm146.div2;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
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

		for (final int i : toss) {
			final Integer key = Integer.valueOf(i);
			if (points.containsKey(key)) {
				points.replace(key, points.get(key) + key);
			} else {
				points.put(key, key);
			}
		}

		Iterator<Entry<Integer, Integer>> it = points.entrySet().iterator();
		int topScore = 0;
		int topValue = 0;
		while (it.hasNext()) {
			final Entry<Integer, Integer> pair = (Entry<Integer, Integer>) it
					.next();
			if (pair.getValue() > topScore) {
				topScore = pair.getValue();
				topValue = pair.getKey();
			}
		}

		return topValue;
	}

}
