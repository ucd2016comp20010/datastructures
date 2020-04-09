package projectCode20280;

import java.util.Comparator;

/**
 * An abstract base class to ease the implementation of the SortedMap interface.
 *
 * The base class provides four means of support: 1) It defines a PQEntry class
 * as a concrete implementation of the entry interface 2) It provides an
 * instance variable for a general Comparator and protected methods, compare(a,
 * b), that can compare either two entries or two keys using the comparator. 3)
 * It provides a boolean checkKey method that verifies that a given key is
 * appropriate for use with the comparator
 *
 */
public abstract class AbstractSortedMap<K, V> extends AbstractMap<K, V> implements SortedMap<K, V> {

	// instance variable for an AbstractSortedMap
	/** The comparator defining the ordering of keys in the map. */
	private Comparator<K> comp;

	/**
	 * Initializes the comparator for the map.
	 * 
	 * @param c comparator defining the order of keys in the map
	 */
	protected AbstractSortedMap(Comparator<K> c) {
		comp = c;
	}

	/** Initializes the map with a default comparator. */
	protected AbstractSortedMap() {
		this(new DefaultComparator<K>()); // default comparator uses natural ordering
	}

	/** Method for comparing two entries according to key */
	protected int compare(Entry<K, V> a, Entry<K, V> b) {
		return comp.compare(a.getKey(), b.getKey());
	}

	/** Method for comparing a key and an entry's key */
	protected int compare(K a, Entry<K, V> b) {
		return comp.compare(a, b.getKey());
	}

	/** Method for comparing a key and an entry's key */
	protected int compare(Entry<K, V> a, K b) {
		return comp.compare(a.getKey(), b);
	}

	/** Method for comparing two keys */
	protected int compare(K a, K b) {
		return comp.compare(a, b);
	}

	/** Determines whether a key is valid. */
	protected boolean checkKey(K key) throws IllegalArgumentException {
		try {
			return (comp.compare(key, key) == 0); // see if key can be compared to itself
		} catch (ClassCastException e) {
			throw new IllegalArgumentException("Incompatible key");
		}
	}
}
