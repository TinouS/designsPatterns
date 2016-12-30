package command;

public class DrawCircle implements Command{

	private ShapeDrafter shapeDrafter;

	public DrawCircle(ShapeDrafter shapeDrafter) {
		super();
		this.shapeDrafter = shapeDrafter;
	}

	@Override
	public void execute() {
		shapeDrafter.drawCircle();
	}

}
