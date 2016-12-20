package abstractFactory;

public class Main {
	private Main() {
	}

	public static void main(String[] args) {
		AbstractWidgetFactory widgetFactory;
		try {
			widgetFactory = GUIBuilder.builderWindow("windows");
			Window window = widgetFactory.createWindow();
			System.out.println(window.getTitle());

		} catch (NullPointerException | ClassCastException e) {
			System.err.print(e.getMessage());
		}
	}
}