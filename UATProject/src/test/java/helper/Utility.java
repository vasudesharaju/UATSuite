package helper;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Utility {

	public void dummyMethodForGit() {
		System.out.println("Github test");
	}

	// This Lib will wait for specified amount of time
	public static void sleep(int second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {

		}
	}

	public static void syncWebElement(WebDriver driver, WebElement element, int time) {

		WebDriverWait wait= new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		
	}
	//this is highlight the element
	public static void highLightElement(WebDriver driver,WebElement element){
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
	//	js.executeScript("arguments[0].setAttribute('style',border: 2px solid white;');", element);
	}
	
	//final lib for waiting and highlight
    public static WebElement waitforWebElement(WebDriver driver,WebElement element,int time){
    	syncWebElement(driver,element,time);
    	highLightElement(driver,element);
    	return element;
    }
    
    public static String captureScreenshot(WebDriver driver){
    	TakesScreenshot ts=(TakesScreenshot)driver;
    	File src=ts.getScreenshotAs(OutputType.FILE);
    	String dest =System.getProperty("user.dir")+"/Screenshots/"+System.currentTimeMillis()+".png";
    	try {
			FileUtils.copyFile(src,new File(dest));
					} catch (IOException e) {
			System.out.println("Not able to capture screenshot"+e.getMessage());
		}
    	return dest;
    	
    }
    
    public static String getCurrentDateTime(){
    	DateFormat dateFormat=new SimpleDateFormat("MM-dd-yyyy-HH-mm-ss");
    	Date date=new Date();
    	String currentDate=dateFormat.format(date);
    	return currentDate;
    	
    }
    public void waitForTitle(WebDriver driver,String title,int time){
    	WebDriverWait wait=new WebDriverWait(driver,time);
    	wait.until(ExpectedConditions.titleIs(title));
    	Assert.assertEquals(driver.getTitle(), title);
    }
    public void waitForTitleContains(WebDriver driver,String title,int time){
    	WebDriverWait wait=new WebDriverWait(driver,time);
    	wait.until(ExpectedConditions.titleContains(title));
    	Assert.assertTrue(driver.getTitle().contains(title));
    }
	public static String getAlertText(WebDriver driver) {
		Alert alt = new WebDriverWait(driver, 30).until(ExpectedConditions.alertIsPresent());
		return alt.getText();
	}
      
	public static void acceptAlert(WebDriver driver) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.alertIsPresent()).accept();
	}

	public static void dismissAlert(WebDriver driver) {
		Alert alt = new WebDriverWait(driver, 30).until(ExpectedConditions.alertIsPresent());
		alt.dismiss();
	}

	public static void switchToFrameUsingIndex(WebDriver driver, int index) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	}

	public static void switchToFrameUsingIdAndName(WebDriver driver, String IdAndName) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(IdAndName));
	}

	public static void switchToFrameUsingIdAndName(WebDriver driver, WebElement searchbox) {
		// TODO Auto-generated method stub
		new WebDriverWait(driver, 30).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(searchbox));
	}

	public static void takeScreenshot() {

	}

}
