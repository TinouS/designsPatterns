package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Tinoudi
 *
 *         Concrete aggregate
 */
public class ListSequence<T> implements Sequence<T> {

	private List<T> list = new ArrayList<T>();

	@Override
	public SequenceIterator<T> createSequenceIterator() {
		return new ListSequenceIterator<T>(this);
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
