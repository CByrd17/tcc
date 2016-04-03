/**
 * 
 */
package tcc.srm144.div2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cbyrd17
 *
 */
public class PowerOutage {

	public class Node<T> {
		private T name;
		private int distanceFromParent;
		private Node<T> parent;
		private List<Node<T>> children;
		private boolean checked = false;

		Node(final T nameToUse, final Node<T> parentToUse,
				final int distance) {
			name = nameToUse;
			parent = parentToUse;
			distanceFromParent = distance;
			children = new ArrayList<>();
		}

		public Node<T> find(final T nameToFind) {
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
				if (found == null && this.parent != null) {
					found = parent.find(nameToFind);
				}
			}
			return found;
		}

		public List<Node<T>> route(final T nameToFind) {
			List<Node<T>> route = new ArrayList<>();
			List<Node<T>> potentialRoute = new ArrayList<>();
			if (!name.equals(nameToFind)) {
				for (Node<T> child : children) {
					if (!child.checked) {
						potentialRoute = child.route(nameToFind);
						if (!potentialRoute.isEmpty()) {
							route.add(this);
							route.addAll(potentialRoute);
							break;
						} else {
							child.checked = true;
						}
					}
				}
				if (potentialRoute.isEmpty() && this.parent != null) {
					potentialRoute = parent.route(nameToFind);
					if (!potentialRoute.isEmpty()) {
						route.add(this);
						route.addAll(potentialRoute);
					}
				}
			} else {
				route.add(this);
			}
			return route;
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
			StringBuilder sb = new StringBuilder(name.toString());

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
		Node<Integer> root = new Node<>(0, null, 0);
		for (int current = 0; current < fromJunction.length; current++) {
			Node<Integer> parent = root.find(fromJunction[current]);
			Node<Integer> child = new Node<>(toJunction[current], parent,
					ductLength[current]);
			parent.addChild(child);
		}

		System.out.println(root.toString(0));
		final int routeFrom = 2;
		final int routeTo = 0;
		final Node<Integer> start = root.find(routeFrom);
		final List<Node<Integer>> route = start.route(routeTo);
		System.out.print("Route from " + routeFrom + " to " + routeTo + ": ");
		for (Node<Integer> current : route) {
			System.out.print(current.name + ",");
		}
		System.out.println();

		return 10;
	}

}
