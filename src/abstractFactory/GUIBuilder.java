package abstractFactory;

/**
 * 
 * @author Tinoudi Mohammed
 *
 * ---- Producer ---
 */
public class GUIBuilder {
	
	public static AbstractWidgetFactory builderWindow(String choice){
		if (choice == "mac") {
			return new MacOSxWidgetFactory();
		} else if (choice == "windows") {
			return new MSWindowsWidgetFactory();
		}
		return null;
	}
}
