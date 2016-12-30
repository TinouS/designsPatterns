package iterator;

public class ListSequenceIterator<T> implements SequenceIterator<T> {

	private ListSequence<T> list;
	private int currentItem = 0;

	public ListSequenceIterator(ListSequence<T> list) {
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
