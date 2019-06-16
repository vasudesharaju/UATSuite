package helper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	// This Lib will wait for specified amount of time
	public static void sleep(int second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {

		}
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
	
	public static void takeScreenshot(){
		
	}

}
