package proxy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 
 * @author Tinoudi Mohammed
 *
 * subject 
 */
public abstract class TextFile {
	
	public abstract String getNameWithPath();
	public abstract FileInputStream getFileContents() throws FileNotFoundException;
	public static TextFile getTextInstance(String fileNameWithPath){
		return new TextFileProxy(fileNameWithPath) ;
	}
	
}
