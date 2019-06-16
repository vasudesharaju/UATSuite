package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjects.Automationtest;
import PageObjects.BaseClass;
import PageObjects.Login;
import pojo.Automate;

public class AutomateTestcase extends BaseClass {
	 
	@Test
	public void AutomateTestcase(){
		
       
		Automationtest personalPage = PageFactory.initElements(driver, Automationtest.class);
		String fname="vasnujkitu";
		String lname="ghj";
		String email="testtt@test.com";
		String password="1234";
		String confirmpassword="1234";
		String street="123 lane";
		String street1="xyztest";
		String city="SFO";
		String State="California";
		String postacode="12345";
		String card="0111 0111 1111 1111 1120 348";
		Automate auto=new Automate(fname, lname, email, password, confirmpassword,street,street1,city,State,postacode,card);
		
		personalPage.signup(fname, lname, email, password, confirmpassword,street,street1,city,State,postacode,card);
	}
}
				
				
				
	


