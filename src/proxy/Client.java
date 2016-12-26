package proxy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Client {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		int content;
		
		/**
		 *  getTextInstance return a TextFileProxy
		 */
		TextFile textFile = TextFile.getTextInstance("file path here"); 
		System.out.println("Text File name with path " + textFile.getNameWithPath());
		try {
			System.out.println("TextFile's content");
			fis = textFile.getFileContents();
			while ((content = fis.read()) != -1) {
				System.out.print((char) content);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
