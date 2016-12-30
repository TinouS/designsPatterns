package iterator;
/**
 * 
 * @author Tinoudi
 *
 *  Concrete Iterator
 */
public class LinkedListSequenceIterator<T> implements SequenceIterator<T> {

	private LinkedListSequence<T> list = null;
	private int currentItem = 0;

	public LinkedListSequenceIterator(LinkedListSequence<T> list) {
		this.list = list;
	}

	@Override
	public T getCurrentItem() {
		return list.getList().get(currentItem);
	}

	@Override
	public boolean isOver() {
		if (currentItem == list.getList().size())
			return true;
		else
			return false;
	}

	@Override
	public void nextItem() {
		this.currentItem++;
	}

	@Override
	public void firstItem() {
		this.currentItem = 0;

	}

}
