package projectCode20280;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedStackTest {

	@Test
	void testSize() {
		LinkedStack<Integer> s = new LinkedStack<>();
		for(int i = 0; i < 10; ++i)
			s.push(i);
		assertEquals(10, s.size());
	}

	@Test
	void testIsEmpty() {
		LinkedStack<Integer> s = new LinkedStack<>();
		for(int i = 0; i < 10; ++i)
			s.push(i);
		for(int i = 0; i < 10; ++i) {
			s.pop();
		}
		assertEquals(true, s.isEmpty());
	}

	@Test
	void testPush() {
		LinkedStack<Integer> s = new LinkedStack<>();
		for(int i = 0; i < 10; ++i)
			s.push(i);
		assertEquals(10, s.size());
		assertEquals("[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]", s.toString());
	}

	@Test
	void testTop() {
		LinkedStack<Integer> s = new LinkedStack<>();
		for(int i = 0; i < 10; ++i)
			s.push(i);
		assertEquals(9, s.top());
	}

	@Test
	void testPop() {
		LinkedStack<Integer> s = new LinkedStack<>();
		for(int i = 0; i < 10; ++i)
			s.push(i);
		assertEquals(9, s.pop());
		assertEquals(9, s.size());
	}

	@Test
	void testToString() {
		LinkedStack<Integer> s = new LinkedStack<>();
		for(int i = 0; i < 10; ++i)
			s.push(i);
		assertEquals("[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]", s.toString());
	}
}
