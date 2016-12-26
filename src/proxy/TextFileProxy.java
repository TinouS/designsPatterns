package proxy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TextFileProxy extends TextFile{

	private String fileNameWithPath;
	RealTextFile realFile = null;
	
	public TextFileProxy(String fileNameWithPath) {
		super();
		this.fileNameWithPath = fileNameWithPath;
	}

	@Override
	public String getNameWithPath() {
		return this.fileNameWithPath;
	}

	/**
	 * instance a RealTextFile.
	 */
	@Override
	public FileInputStream getFileContents() throws FileNotFoundException {
		this.realFile = new RealTextFile(this.fileNameWithPath);
		return realFile.getFileContents();
	}
	
	

}
