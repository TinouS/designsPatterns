package iterator;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		ListSequence<Integer> list = new ListSequence<>();
		list.setList(Arrays.asList(1, 7, 9, 6, 10));
		ListSequenceIterator<Integer> listSequenceIterator = (ListSequenceIterator<Integer>) list
				.createSequenceIterator();
		System.out.println(listSequenceIterator.getCurrentItem());
		System.out.println("----------------------------------------");
		LinkedListSequence<String> linkedList = new LinkedListSequence<>();
		linkedList.setList(Arrays.asList("red", "green", "black", "white"));
		LinkedListSequenceIterator<String> linkedListSequenceIterator = (LinkedListSequenceIterator<String>) linkedList
				.createSequenceIterator();

		while (!linkedListSequenceIterator.isOver()) {
			System.out.println(linkedListSequenceIterator.getCurrentItem());
			linkedListSequenceIterator.nextItem();
		}

	}

}
