package command;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {

	private List<Command> list = new ArrayList<Command>();

	public void addCommand(Command c) {
		list.add(c);
	}

	public void executeCommands() {
		list.forEach(action -> action.execute());
	}

}
