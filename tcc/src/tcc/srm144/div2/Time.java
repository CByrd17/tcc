/**
 * 
 */
package tcc.srm144.div2;

/**
 * @author cbyrd17
 *
 */
public class Time { // No PMD

	/**
	 * @param seconds
	 *            number of seconds to parse
	 * @return String formatted as "<H>:<M>:<S> where <H> represents the number
	 *         of complete hours since midnight, <M> represents the number of
	 *         complete minutes since the last complete hour ended, and
	 *         <S> represents the number of seconds since the last complete
	 *         minute ended.
	 */
	public final String whatTime(final int seconds) {

		String s = howManyHours(seconds) + ":" + howManyMinutes(seconds) + ":"
				+ howManySeconds(seconds);

		return s;
	}

	public final int howManyHours(final int seconds) {
		int hours = seconds / (60 * 60);

		return hours;
	}

	public final int howManyMinutes(final int seconds) {
		int removeHours = seconds - 60 * 60 * howManyHours(seconds);
		int minutes = removeHours / 60;
		return minutes;
	}

	public int howManySeconds(int i) {
		int seconds = i % 60;
		return seconds;
	}

	/**
	 * @param args
	 *            arguments passed on the command line
	 */
	public static void main(final String... args) {
		Time t = new Time();
		System.out.println(t.whatTime(0));
		System.out.println(t.whatTime(1));
		int seconds = 60 * 60 + 2;
		System.out.println(t.howManyHours(seconds));
		System.out.println(
				t.howManyMinutes(seconds - 60 * 60 * t.howManyHours(seconds)));

	}

}
