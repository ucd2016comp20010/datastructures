package projectCode20280;

import java.util.Comparator;

/**
 * Comparator based on the compareTo method of a Comparable element type.
 *
 */
public class DefaultComparator<E> implements Comparator<E> {

  /**
   * Compares two elements.
   *
   * @return a negative integer if <tt>a</tt> is less than <tt>b</tt>,
   * zero if <tt>a</tt> equals <tt>b</tt>, or a positive integer if
   * <tt>a</tt> is greater than <tt>b</tt>
   */
  @SuppressWarnings({"unchecked"})
  public int compare(E a, E b) throws ClassCastException {
    return ((Comparable<E>) a).compareTo(b);
  }
}