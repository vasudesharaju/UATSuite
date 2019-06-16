package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOut {

	WebDriver driver;
	
	public void LogOut(WebDriver mainDriver) {
		
		this.driver=mainDriver;
	}
	
	@FindBy(xpath="(//html//body/div[@id='wrapper']//nav[@class='nav navbar-default']//ul[@class='nav navbar-top-links navbar-right pull-right']//li[5])[3]//i[@class='fa fa-caret-down']")WebElement dropdownOpen;
	@FindBy(xpath="//a[@title='Logout']")WebElement LogOut;
	
	
	public void LogOutOfApp() {
		dropdownOpen.click();
		LogOut.click();
		
	}
	
}
