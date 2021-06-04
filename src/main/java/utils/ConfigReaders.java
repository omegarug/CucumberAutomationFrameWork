package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReaders {

private Properties prop;
	
// this class will be reading properties file//

	public Properties init_prop() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("C:\\study-java\\CucumberAutomationFrameWork\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}

}
