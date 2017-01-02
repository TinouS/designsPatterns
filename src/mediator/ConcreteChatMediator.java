package mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteChatMediator implements ChatMediator {

	private List<User> list;

	public ConcreteChatMediator() {
		list = new ArrayList<>();
	}

	@Override
	public void sendMessage(User user, String msg) {
		for (User value : list) {
			if (user != value)
				value.receive(msg);
		}
	}

	@Override
	public void addUser(User user) {
		list.add(user);
	}

}
