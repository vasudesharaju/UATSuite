package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class EnableSessionModule {

	WebDriver driver;

	public EnableSessionModule(WebDriver mainDriver) {
		this.driver = mainDriver;

	}

	@FindBy(xpath = "//a[@title='Plan your event.']")
	WebElement plan;
	@FindBy(xpath = "//a[@title='Enable modules, setup custom reg properties and other event options.']")
	WebElement Options;
	@FindBy(xpath = "//input[@id='Speaker and Session Management Module']")
	WebElement enableSmodule;
	@FindBy(xpath = "//strong[text()='Conference Sessions']/../input")
	WebElement conferenceSessions;
	@FindBy(xpath = "//input[@title='Submit this form and save any changes']")
	WebElement Save;

	public void enableModule() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", plan);
		//plan.click();
		js.executeScript("arguments[0].click();", Options);
		//Options.click();
		js.executeScript("arguments[0].click();", enableSmodule);
		js.executeScript("arguments[0].click();", conferenceSessions);
		js.executeScript("arguments[0].click();", Save);
		Assert.assertEquals(driver.getTitle(), "Certain: Event options");
		

	}

}
