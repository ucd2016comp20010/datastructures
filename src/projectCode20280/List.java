package projectCode20280;

import java.util.Iterator;

public interface List<E> extends Iterable<E> {
	
	int size();
	
	boolean isEmpty();
	
	E get(int i, E e);
	
	void add(int i, E e);
	
	E remove(int i);
	
	Iterator<E> iterator();
}
