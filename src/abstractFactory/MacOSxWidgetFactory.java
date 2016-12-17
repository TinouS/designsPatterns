package abstractFactory;
/**
 * 
 * @author Tinoudi Mohammed
 *
 * ---- Concrete Factory ----
 */
public class MacOSxWidgetFactory implements AbstractWidgetFactory{

	@Override
	public Window createWindow() {
		MacOSWindow window = new MacOSWindow();
		return window;
	}
}
