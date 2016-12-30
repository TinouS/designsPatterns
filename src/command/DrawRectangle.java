package command;

public class DrawRectangle implements Command {

	private ShapeDrafter shapeDrafter;

	public DrawRectangle(ShapeDrafter shapeDrafter) {
		super();
		this.shapeDrafter = shapeDrafter;
	}

	@Override
	public void execute() {
		shapeDrafter.drawRectangle();
	}

}
