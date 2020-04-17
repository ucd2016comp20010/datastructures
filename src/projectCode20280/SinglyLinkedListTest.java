package projectCode20280;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SinglyLinkedListTest {

	@Test
	void testSize() {
		SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();
		assertEquals(0, ll.size());
		ll.addFirst(0);
		assertEquals(1, ll.size());
	}

	@Test
	void testIsEmpty() {
		SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();
		assertEquals(true, ll.isEmpty());
		ll.addFirst(0);
		assertEquals(false, ll.isEmpty());
		ll.removeFirst();
		assertEquals(true, ll.isEmpty());
	}

	@Test
	void testFirst() {
		SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();
		ll.addFirst(-1);
		assertEquals(-1, ll.first());
		
		ll.removeFirst();
		assertEquals(null, ll.first());
		
		
	}

	@Test
	void testLast() {
		SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();
		ll.addFirst(-1);

		assertEquals(-1, ll.last());

		ll.addFirst(-2);
		assertEquals(-1, ll.last());
		
		ll.addLast(-3);
		assertEquals(-3, ll.last());
	}


	@Test
	void testRemoveLast() {
		SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();
		ll.addFirst(-1);
		ll.addFirst(-2);
		assertEquals(-1, ll.removeLast());
	}

	@Test
	void testGet() {
		SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();
		for(int i = 0; i < 5; ++i) ll.addLast(i);

		assertEquals(1, ll.get(1));
	}

	@Test
	void testRemove() {
		SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();
		for(int i = 0; i < 5; ++i) ll.addLast(i);

		ll.remove(1);
		assertEquals("[0, 2, 3, 4]", ll.toString());
	}

	@Test
	void testAdd() {
		SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();
		for(int i = 0; i < 5; ++i) ll.addLast(i);

		ll.add(2, -1);
		assertEquals("[0, 1, -1, 2, 3, 4]", ll.toString());
	}

	@Test
	void testToString() {
		SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();
		for(int i = 0; i < 5; ++i) ll.addLast(i);

		assertEquals("[0, 1, 2, 3, 4]", ll.toString());
	}

	@Test
	void testIterator() {
		SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();
		for(int i = 0; i < 5; ++i) ll.addLast(i);
		
		ArrayList<Integer> buf = new ArrayList<>();
		for(Integer i : ll) {
			buf.add(i);
		}
		assertEquals("[0, 1, 2, 3, 4]", buf.toString());
	}

}
