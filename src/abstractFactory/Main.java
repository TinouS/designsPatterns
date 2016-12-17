package abstractFactory;

public class Main {

	public static void main(String[] args) {
		AbstractWidgetFactory widgetFactory = GUIBuilder.builderWindow("mac");
		Window window = widgetFactory.createWindow();
		System.out.println(window.getTitle());
	}

}
