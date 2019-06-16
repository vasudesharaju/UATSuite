package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpForm {
	WebDriver driver;

	public SignUpForm(WebDriver mainDriver) {
		this.driver = mainDriver;
	}
	@FindBy(xpath="")WebElement firstName;
	@FindBy(xpath="//input[@placeholder='First']")WebElement lastName;
	@FindBy(xpath="//input[@name='lastName']")WebElement Email;
	@FindBy(xpath="//input[@name='email']")WebElement password;
	@FindBy(xpath="//input[@name='password']")WebElement Phone;
	@FindBy(xpath="//input[@name='address']")WebElement Address;
	@FindBy(xpath="//input[@name='city']")WebElement City;
	@FindBy(xpath="//input[@name='state']")WebElement State;
	@FindBy(xpath="//input[@name='zip']")WebElement zip;
	@FindBy(xpath="//button[text()='Submit']")WebElement Submit;
	
	public void signUp() throws InterruptedException{
		firstName.sendKeys("Vasu");
		lastName.sendKeys("Desha");
		Email.sendKeys("vasudharaju@gmail.com");
		password.sendKeys("1234");
		Phone.sendKeys("2341231234");
		Address.sendKeys("New test lane");
		City.sendKeys("San Francisco");
		State.sendKeys("California");
		zip.sendKeys("95104");
		Submit.click();
	}

}
