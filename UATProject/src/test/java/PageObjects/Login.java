package PageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import helper.Utility;
import pojo.Users;

public class Login {

	WebDriver driver;

	public Login(WebDriver mainDriver) {

		this.driver = mainDriver;

	}

	@FindBy(xpath = "//input[@id='username']")
	WebElement userName;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passWord;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement Login;
	@FindBy(xpath = "//div[@title='Change Account']")
	WebElement clickOnSubaccount;
	@FindBy(xpath = "//iframe[@id='accountSelectorFrame']")
	WebElement swithToiframe;
	@FindBy(xpath = "(//a[@title='Events'])[2]")
	WebElement clickonEvents;

	public void loginToApp(Users loginUser) {
		Actions actions = new Actions(driver);
		Utility.waitforWebElement(driver, userName, 20).sendKeys(loginUser.getUserName());
	//	userName.sendKeys(loginUser.getUserName());
		Utility.waitforWebElement(driver, passWord, 20).sendKeys(loginUser.getPassword());
	//	passWord.sendKeys(loginUser.getPassword());
		Utility.waitforWebElement(driver, Login, 20).click();
	//	Login.click();
	/*	SoftAssert assertion = new SoftAssert();
		System.out.println("Started");
		assertion.assertTrue(!driver.getPageSource().contains("The username or password provided are invalid. Please try again"));
		System.out.println("Completed");
		assertion.assertAll(); */
		Assert.assertEquals(driver.getTitle(),"Certain: Dashboard");

	}

}
