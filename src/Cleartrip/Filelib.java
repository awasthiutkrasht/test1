package Cleartrip;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Filelib {

	public String getPropKey(String path , String key) throws Throwable {
		
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String property = prop.getProperty(key, "ïncorrect key");
		return property;
		}
}
