package projectCode20280;

public interface Deque<E> {

	/**
	 * Returns the number of elements in the deque.
	 * 
	 * @return number of elements in the deque
	 */
	int size();

	/**
	 * Tests whether the deque is empty.
	 * 
	 * @return true if the deque is empty, false otherwise
	 */
	boolean isEmpty();

	/**
	 * Returns (but does not remove) the first element of the deque.
	 * 
	 * @return first element of the deque (or null if empty)
	 */
	E first();

	/**
	 * Returns (but does not remove) the last element of the deque.
	 * 
	 * @return last element of the deque (or null if empty)
	 */
	E last();

	/**
	 * Inserts an element at the front of the deque.
	 * 
	 * @param e the new element
	 */
	void addFirst(E e);

	/**
	 * Inserts an element at the back of the deque.
	 * 
	 * @param e the new element
	 */
	void addLast(E e);

	/**
	 * Removes and returns the first element of the deque.
	 * 
	 * @return element removed (or null if empty)
	 */
	E removeFirst();

	/**
	 * Removes and returns the last element of the deque.
	 * 
	 * @return element removed (or null if empty)
	 */
	E removeLast();
}
