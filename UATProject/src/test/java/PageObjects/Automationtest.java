package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pojo.Automate;

public class Automationtest {
	WebDriver driver;
	public Automationtest(WebDriver mainDriver){
		this.driver = mainDriver;
	}
	

    @FindBy(css = "input[name=firstName]")
     WebElement firstName;
    @FindBy(css = "input[name=lastName]")
     WebElement lastName;

    @FindBy(css = "input[name=email]")
  WebElement email;
    @FindBy(css = "input[name=password]")
     WebElement password;
    @FindBy(css = "input[name=confirmPassword]")
     WebElement confirmPassword;
    @FindBy(xpath = "//button[text()='Next']")
     WebElement submit;
    @FindBy(xpath = "//a[text()='Cancel']")
    private WebElement cancel;
    @FindBy(xpath="(//div[@class='card-deck mb-3 text-center']//div//form//button[@name='_eventId_submit'])[1]")WebElement plan;
    @FindBy(xpath="//input[@name='addressLine1']")WebElement Street;
    @FindBy(xpath="//input[@name='addressLine2']")WebElement Street1;
    @FindBy(xpath="//input[@name='city']")WebElement city;
    @FindBy(xpath="//input[@name='state']")WebElement state;
    @FindBy(xpath="//input[@name='postalCode']")WebElement postalCode;
    @FindBy(xpath="//input[@name='cardnumber']")WebElement cardnumber;
    @FindBy(xpath="//button[@name='submit']")WebElement creatAcc;
    
    public void signup(String fname,String lname,String Email,String Password,String ConfirmPassword,String street,String street1,String City,String State,String postalcode,String cardNumber){
    	firstName.sendKeys(fname);
    	lastName.sendKeys(lname);
    	email.sendKeys(Email);
    	password.sendKeys(Password);
    	confirmPassword.sendKeys(ConfirmPassword);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();", submit);
		js.executeScript("arguments[0].click();", plan);
		Street.sendKeys(street);
		Street1.sendKeys(street1);
		city.sendKeys(City);
		state.sendKeys(State);
		postalCode.sendKeys(postalcode);
		cardnumber.sendKeys(cardNumber);
		js.executeScript("arguments[0].click();", creatAcc);
    	

}
}
