package PageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AddSession {
	WebDriver driver;
	public AddSession(WebDriver mainDriver){
		this.driver = mainDriver;
	}
	//Setup
	@FindBy(xpath="//a[@title='Manage your event.']")WebElement Manage;
	@FindBy(xpath="(//a[@title='Setup'])[2]")WebElement setUp;
	@FindBy(xpath="//div[@class='sidebar-body']//a[@title='Session Layout']")WebElement sessionLayout;
	//@FindBy(xpath="//strong[text()='Conference Sessions']")WebElement confSessions;
	@FindBy(xpath="(//div[@class='col-sm-6'])[2]")WebElement confSessions;
	@FindBy(xpath="//button[@x-ng-click='saveSessionLayout()']")WebElement Submit;
	//Location
	@FindBy(xpath="(//a[@title='Locations'])[2]")WebElement location;
	@FindBy(xpath="//button[@ng-click='addLocation()']")WebElement addNewLoc;
	@FindBy(xpath="//input[@x-ng-model='location.name']")WebElement lName;
	@FindBy(xpath="//input[@x-ng-model='location.locationCode']")WebElement lCode;
	@FindBy(xpath="(//button[@id='dLabel'])[1]")WebElement lType;
	@FindBy(xpath="(//span[text()='Meeting Room'])[2]")WebElement locType;
	@FindBy(xpath="//input[@x-ng-model='location.capacity']")WebElement capacity;
	@FindBy(xpath="//button[@x-ng-click='createLocation()']")WebElement createLocation;
	//Session
	@FindBy(xpath="//div[@class='sidebar-body']//a[@title='Sessions']")WebElement Sessions;
	@FindBy(xpath="//button[text()='Add New']")WebElement addSession;
	@FindBy(xpath="//input[@x-ng-model='session.name']")WebElement sName;
	@FindBy(xpath="//label[text()='Session Type']/..//following-sibling::div/button[@id='dLabel']")WebElement clickStype;
	@FindBy(xpath="")List<WebElement> selectStype;
	@FindBy(xpath="//input[@x-ng-model='session.sessionCode']")WebElement sCode;
	@FindBy(xpath="//button[@x-ng-click='saveSession(session)']")WebElement saveSession;
/*	@FindBy(xpath="")WebElement
	@FindBy(xpath="")WebElement
	@FindBy(xpath="")WebElement
	@FindBy(xpath="")WebElement
	@FindBy(xpath="")WebElement
	@FindBy(xpath="")WebElement
	@FindBy(xpath="")WebElement
	@FindBy(xpath="")WebElement */
	
	
	
	public void addSession(String searchText){
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// setup
		js.executeScript("arguments[0].click();", Manage);
		js.executeScript("arguments[0].click();", setUp);
		js.executeScript("arguments[0].click();", sessionLayout);
		js.executeScript("arguments[0].click();", confSessions);
		confSessions.click();
		js.executeScript("arguments[0].click();", Submit);
		Assert.assertEquals(driver.getTitle(), "Certain: Session Layout");
		//Create Location
		js.executeScript("arguments[0].click();", location);
		js.executeScript("arguments[0].click();", addNewLoc);
		lName.sendKeys("loc1");
		lCode.sendKeys("loc1");
		js.executeScript("arguments[0].click();", lType);
		js.executeScript("arguments[0].click();", locType);
		capacity.sendKeys("10");
		js.executeScript("arguments[0].click();", createLocation);
		Assert.assertEquals(driver.getTitle(), "Certain: Locations");
		//Add session
		js.executeScript("arguments[0].click();", Sessions);
		js.executeScript("arguments[0].click();", addSession);
		sName.sendKeys("Rockwell Event");
		sCode.sendKeys("rec");
		js.executeScript("arguments[0].click();", clickStype);
		
		for (WebElement e : selectStype) {
			String actualValue = e.getText().trim();
			if (actualValue.equalsIgnoreCase(searchText)) {
				e.click();
				break;
			}
		}
		
		js.executeScript("arguments[0].click();", saveSession);
	}

}
