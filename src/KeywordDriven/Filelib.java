package KeywordDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Filelib {
	
	public String getPropKeyValue(String path, String key) throws Throwable {
		
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
	    prop.load(fis);
	    String py = prop.getProperty(key, "Incorrect Key");
		return py;
	    
		
	}

}
