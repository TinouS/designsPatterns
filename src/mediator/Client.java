package mediator;

public class Client {

	public static void main(String[] args) {
		ChatMediator chatMediator = new ConcreteChatMediator();
		User user1 = new ConcreteUser(chatMediator, "Tinou");
		chatMediator.addUser(new ConcreteUser(chatMediator, "Alex"));
		chatMediator.addUser(new ConcreteUser(chatMediator, "Souf"));

		user1.send("hello ! ");

	}

}
