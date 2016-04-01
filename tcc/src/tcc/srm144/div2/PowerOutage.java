/**
 * 
 */
package tcc.srm144.div2;

import java.util.ArrayList;
import java.util.List;

import tcc.srm144.div2.PowerOutage.Node;

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

		Node(final T nameToUse, final Node<T> parentToUse,
				final int distance) {
			name = nameToUse;
			parent = parentToUse;
			distanceFromParent = distance;
			children = new ArrayList<Node<T>>();
		}

		public Node<T> find(T nameToFind) {
			Node<T> found = null;
			if (name.equals(nameToFind)) {
				found = this;
			} else {
				for (Node<T> child : children) {
					Node<T> foundOne = child.find(nameToFind);
					if (foundOne != null) {
						found = foundOne;
						break;
					}
				}
			}
			return found;
		}

		public void addChild(Node<T> nodeToAdd) {
			children.add(nodeToAdd);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		public String toString() {
			return this.toString(0);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		public String toString(int depth) {
			StringBuffer sb = new StringBuffer(name.toString());

			boolean moreChildren = true;

			for (int i = 0; i < children.size(); i++) {
				Node<T> child = children.get(i);
				sb.append("--- " + child.distanceFromParent + " --->"
						+ child.toString(depth + 1));
				if (i == children.size() - 1) {
					moreChildren = false;
				}
				if (moreChildren) {
					sb.append(System.lineSeparator());
					for (int j = 0; j < depth; j++) {
						sb.append("           ");
					}
					sb.append('|');
					sb.append(System.lineSeparator() + ' ');
					for (int j = 0; j < depth; j++) {
						sb.append("           ");
					}
				}
			}

			return sb.toString();

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
		Node<Integer> root = new Node<Integer>(0, null, 0);
		for (int current = 0; current < fromJunction.length; current++) {
			Node<Integer> parent = root.find(fromJunction[current]);
			Node<Integer> child = new Node<Integer>(toJunction[current],
					parent, ductLength[current]);
			parent.addChild(child);
		}

		System.out.println(root.toString(0));

		return 10;
	}

}
