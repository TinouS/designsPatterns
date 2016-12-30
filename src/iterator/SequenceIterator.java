package iterator;
/**
 * 
 * @author Tinoudi
 *
 * Iterator
 */
public interface SequenceIterator<T> {

	public T getCurrentItem();

	public boolean isOver();

	public void nextItem();

	public void firstItem();

}
