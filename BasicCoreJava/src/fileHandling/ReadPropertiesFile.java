package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Step 1: File Path

		String filepath = "D:\\AutomationBaseCode\\BasicCoreJava\\src\\fileHandling\\Users.properties";

		// Step 2:
		FileInputStream file = new FileInputStream(filepath);
		Properties or = new Properties();
		or.load(file);
		
		System.out.println(or.get("surname"));

	}

}
