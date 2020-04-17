package projectCode20280;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ChainHashMapTest {



	@Test
	void testSize() {
		ChainHashMap<Integer, String> map = new ChainHashMap<Integer, String>();

		int n = 10;
		for(int i = 0; i < n; ++i) {
			map.put(i, Integer.toString(i));
		}
		assertEquals(n, map.size());
	}

	@Test
	void testGet() {
		ChainHashMap<String, Integer> map = new ChainHashMap<String, Integer>();

		int n = 10;
		for(int i = 0; i < n; ++i) {
			map.put(Integer.toString(i), i);
		}
		assertEquals(5, map.get("5"));
		assertEquals(2, map.get("2"));
	}

	@Test
	void testRemove() {
		ChainHashMap<String, Integer> map = new ChainHashMap<String, Integer>();

		int n = 10;
		for(int i = 0; i < n; ++i) {
			map.put(Integer.toString(i), i);
		}
		assertEquals(5, map.remove("5"));
		assertEquals(n-1, map.size());
	}

	@Test
	void testPut() {
		ChainHashMap<String, Integer> map = new ChainHashMap<String, Integer>();

		int n = 10;
		for(int i = 0; i < n; ++i) {
			map.put(Integer.toString(i), i);
		}
		assertEquals(n, map.size());		
	}

	@Test
	void testIsEmpty() {
		ChainHashMap<String, Integer> map = new ChainHashMap<String, Integer>();

		assertEquals(true, map.isEmpty());
		
		int n = 10;
		for(int i = 0; i < n; ++i) {
			map.put(Integer.toString(i), i);
		}
		assertEquals(false, map.isEmpty());	
	}

	@Test
	void testKeySet() {
		ChainHashMap<String, Integer> map = new ChainHashMap<String, Integer>();

		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		ArrayList<String> buf = new ArrayList<>();
		for(String s : map.keySet()) buf.add(s);
		buf.sort(new DefaultComparator<String>());
		assertEquals("[one, three, two]", buf.toString());
	}

	@Test
	void testValues() {
		ChainHashMap<String, Integer> map = new ChainHashMap<String, Integer>();

		int n = 10;
		for(int i = 0; i < n; ++i) {
			map.put(Integer.toString(i), i);
		}
		ArrayList<Integer> buf = new ArrayList<>();
		for(Integer s : map.values()) buf.add(s);
		buf.sort(new DefaultComparator<Integer>());
		assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]", buf.toString());
	}

}
