package abstractFactory;
/**
 * 
 * @author Tinoudi Mohammed
 *
 * ----- ConcreteFactory ----- 
 */
public class MSWindowsWidgetFactory implements AbstractWidgetFactory{

	@Override
	public Window createWindow() {
		MSWindows window = new MSWindows();
		return window;
	}
}
