/**
 * 
 */
package tcc.srm144.div2;

import java.util.List;

/**
 * @author cbyrd17
 *
 */
public class PowerOutage {

	class Node<T> {
		private T name;
		private int distanceFromParent;
		private Node<T> parent;
		private List<Node<T>> children;
		
		public Node (T nameToUse, Node<T> parentToUse) {
			name = nameToUse;
			parent = parentToUse;
			
		}
	}

	/**
	 * toJunction, fromJunction, and ductLength must all contain the same number
	 * of elements.
	 * 
	 * fromJunction[i] will be less than toJunction[i] for all valid values of
	 * i.
	 * 
	 * Every (fromJunction[i],toJunction[i]) pair will be unique for all valid
	 * values of i.
	 * 
	 * The graph represented by the set of edges (fromJunction[i],toJunction[i])
	 * will never contain a loop, and all junctions can be reached from junction
	 * 0.
	 * 
	 * @param fromJunction
	 *            will contain between 1 and 50 elements, inclusive. Every
	 *            element will be between 0 and 49 inclusive.
	 * @param toJunction
	 *            will contain between 1 and 50 elements, inclusive. Every
	 *            element will be between 1 and 49 inclusive.
	 * @param ductLength
	 *            will contain between 1 and 50 elements, inclusive. Every
	 *            element will be between 1 and 2000000 inclusive. Value is
	 *            equal to # of minutes to traverse from to to in the other two
	 *            arrays.
	 * @return minimum length in minutes
	 */
	public final int estimateTimeOut(final int[] fromJunction,
			final int[] toJunction, final int[] ductLength) {
		for (int current = 0; current < fromJunction.length; current++) {
			
		}

		return 10;
	}

}
