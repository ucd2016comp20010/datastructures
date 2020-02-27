package projectCode20280;

/**
 * An interface for a position which is an abstraction for the
 * location at which a single element is stored in a positional
 * container.
 */
public interface Position<E> {
  /**
   * Returns the element stored at this position.
   *
   * @return the stored element
   * @throws IllegalStateException if position no longer valid
   */
  E getElement() throws IllegalStateException;
}
