package projectCode20280;

/**
 * An interface for a binary tree, in which each node has at most two children.
 *
 */
public interface BinaryTree<E> extends Tree<E> {

  /**
   * Returns the Position of p's left child (or null if no child exists).
   *
   * @param p A valid Position within the tree
   * @return the Position of the left child (or null if no child exists)
   * @throws IllegalArgumentException if p is not a valid Position for this tree
   */
  Position<E> left(Position<E> p) throws IllegalArgumentException;

  /**
   * Returns the Position of p's right child (or null if no child exists).
   *
   * @param p A valid Position within the tree
   * @return the Position of the right child (or null if no child exists)
   * @throws IllegalArgumentException if p is not a valid Position for this tree
   */
  Position<E> right(Position<E> p) throws IllegalArgumentException;

  /**
   * Returns the Position of p's sibling (or null if no sibling exists).
   *
   * @param p A valid Position within the tree
   * @return the Position of the sibling (or null if no sibling exists)
   * @throws IllegalArgumentException if p is not a valid Position for this tree
   */
  Position<E> sibling(Position<E> p) throws IllegalArgumentException;
}