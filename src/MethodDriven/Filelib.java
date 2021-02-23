package MethodDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Filelib {

	public String getPropertyKeyValue(String path , String key) throws Throwable {
		
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		
         String property = prop.getProperty(key, "invalid key");
		return property;
		
	}
}
