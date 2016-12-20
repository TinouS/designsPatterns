package abstractFactory;

public class Main {
	private Main() {
	}

	public static void main(String[] args){
		AbstractWidgetFactory widgetFactory;
			widgetFactory = GUIBuilder.builderWindow("window");
			Window window = widgetFactory.createWindow();
			System.out.println(window.getTitle());
	}
}