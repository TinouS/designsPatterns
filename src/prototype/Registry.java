package prototype;

import java.util.Hashtable;

public class Registry {

	private Hashtable<String, Prototype> map = new Hashtable<>();

	public Registry() {
		load();
	}

	private void load() {
		Book book = new Book();
		book.setTitle("Design pattern");
		book.setPrice(49.90);
		map.put("book", book);
	}

	public Prototype createBasicProto(String type) {
		return map.get(type).clone();
	}

}