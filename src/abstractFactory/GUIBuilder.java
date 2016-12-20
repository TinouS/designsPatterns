package abstractFactory;

/**
 * 
 * @author Tinoudi Mohammed
 *
 * ---- Producer ---
 */
public class GUIBuilder {
	
	public static AbstractWidgetFactory builderWindow(String choice) throws ClassCastException{
		if (choice == "mac") {
			return new MacOSxWidgetFactory();
		} else if (choice == "windows") {
			return new MSWindowsWidgetFactory();
		}else{
			throw new ClassCastException("Cast probleme !!! - The given object name is incorrect ! ");
		}
	}
}
