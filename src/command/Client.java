package command;

public class Client {

	public static void main(String[] args) {
		
		ShapeDrafter shapeDrafter = new ShapeDrafter();
		
		Command cm1 = new DrawCircle(shapeDrafter);
		Command cm2 = new DrawRectangle(shapeDrafter);
		
		CommandInvoker commandInvoker = new CommandInvoker();
		commandInvoker.addCommand(cm1);
		commandInvoker.addCommand(cm2);
		
		commandInvoker.executeCommands();
	}

}
