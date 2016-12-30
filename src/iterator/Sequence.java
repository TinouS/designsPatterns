package iterator;

/**
 * 
 * @author Tinoudi
 *
 * Aggregate
 */
public interface Sequence<T> {

	public SequenceIterator<T> createSequenceIterator();

}
