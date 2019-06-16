package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import helper.Utility;

public class AddEvent {

	WebDriver driver;

	public AddEvent(WebDriver mainDriver) {
		this.driver = mainDriver;
	}

	@FindBy(xpath = "//a[@title='Add Event']")
	WebElement addEvent;
	@FindBy(xpath = "//input[@name='evt_name']")
	WebElement eventName;
	@FindBy(xpath = "//input[@id='evt_code']")
	WebElement eventCode;
	@FindBy(xpath = "//input[@id='evt_start_date']")
	WebElement startDate;
	@FindBy(xpath = "//label[text()='End Date']")
	WebElement endDate;
	@FindBy(xpath = "//input[@id='submitForm']")
	WebElement Save;
	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']//tr//td")
	List<WebElement> columns;
	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']//tr//td")
	List<WebElement> columns1;
	
	//Search event
	@FindBy(xpath = "(//a[@title='Events'])[2]")
	WebElement events;
	@FindBy(xpath = "(//table)[1]/tbody/tr")
	List<WebElement> eventList;

	public void addEvent() {
		
		//Add event
		addEvent.click();
		eventName.sendKeys("event2");
		eventCode.sendKeys("uceven22t2");
		startDate.click();
		for (WebElement e : columns) {
			if (e.getText().equals("17")) {
				e.click();
				System.out.println("test");
				break;
							}
		}
		endDate.click();
		
		for (WebElement e1 : columns1) {
			if (e1.getText().equals("31")) {
				e1.click();
				System.out.println("test1");
				break;

			}
		}

		Save.click(); 
	}
	public void selectEvent(String searchEvent) {
		
		//Search event
		events.click();
		Utility.sleep(5);
		
		System.out.println("event list size "+ eventList.size());
			 		
		for (WebElement e : eventList) {
			String actualvalue = e.getText().trim();
			System.out.println("event is "+ actualvalue);

			
			if (actualvalue.contains(searchEvent)) {
				System.out.println("event is "+ e.getText());
				/*((JavascriptExecutor) driver)
			     .executeScript("arguments[0].click();",e);*/
				e.click();
				Utility.sleep(2);
				break;
			}
		} 

	}


	}


