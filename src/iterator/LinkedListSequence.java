package iterator;

import java.util.LinkedList;
import java.util.List;

public class LinkedListSequence<T> implements Sequence<T> {

	private List<T> list = new LinkedList<T>();

	@Override
	public SequenceIterator<T> createSequenceIterator() {
		return new LinkedListSequenceIterator<T>(this);
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	
}
