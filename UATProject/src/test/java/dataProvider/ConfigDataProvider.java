package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;

	public ConfigDataProvider() {

		try {
			File src = new File("./ConfigFiles/ConfigFiles.properties");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Not Able to load Properties file, Please check logs " + e.getMessage());

		}

	}

	public String getBrowser() {
		return pro.getProperty("browser");
	}

	public String getSpeakerPortalURL() {
		return pro.getProperty("SpeakerPortalURL");
	}

	public String getStagingURL() {
		return pro.getProperty("StagingURL");
	}

	public String getValueFromConfig(String key) {
		return pro.getProperty(key);
		
			}
	public String getAutoURL(){
		
		return pro.getProperty("AutoURL");
	}

}
