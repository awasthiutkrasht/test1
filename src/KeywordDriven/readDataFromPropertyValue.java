package KeywordDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class readDataFromPropertyValue {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis = new FileInputStream("./data/config.propertise");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty("username", "Incorrect Key");
		System.out.println(value);

		
	}

}
