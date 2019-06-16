package PageObjects;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import dataProvider.ConfigDataProvider;
import factory.BrowserFactory;

public class BaseClass {

	public WebDriver driver;
	String browser;
	String url;
	public ExtentReports reports;
	public ExtentTest logger;
	
	@BeforeSuite
	public void setUpReport(){
		reports=new ExtentReports("./Reports/test.html");
	}
	
    @AfterSuite
	public void tearDownReport(){
    	reports.flush();
		
	}


	@BeforeClass
	public void setupApplication() {
		ConfigDataProvider config = new ConfigDataProvider();

		browser = config.getBrowser();

		url = config.getStagingURL();
		// url=config.getSpeakerPortalURL();
		//url= config.getAutoURL();

		driver = BrowserFactory.startApplication(browser, url);
	}

	
	/*  @AfterClass
	  public void tearDownApplication() {
	  BrowserFactory.closeBrowser(driver); }
	  */
	  	  
	 

	public void clickByJavaScript(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public void sendKeysBYJavaScript(WebElement ele, String text) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + text + "')", ele);
	}

	public String genarateRandom() {
		// return new String("" + (int)(Math.random() * 200 + 1));

		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 10;
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(targetStringLength);
		for (int i = 0; i < targetStringLength; i++) {
			int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
			buffer.append((char) randomLimitedInt);
		}

		return buffer.toString();
	}
	

}
