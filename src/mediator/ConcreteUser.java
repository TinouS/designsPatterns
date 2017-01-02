package mediator;

public class ConcreteUser extends User {

	public ConcreteUser(ChatMediator chatMediator, String name) {
		super(chatMediator, name);
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name + " sending message " + msg);
		chatMediator.sendMessage(this, msg);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name+" receiving message "+msg);
	}

}
