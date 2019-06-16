package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjects.AddEvent;
import PageObjects.AddSession;
import PageObjects.BaseClass;
import PageObjects.EnableSessionModule;
import PageObjects.Login;
import dataProvider.ExcelDataProvider;
import pojo.Users;

public class LoginToApplication extends BaseClass {

	@Test

	public void LoginToApplication() {
		// Pages

		Login login = PageFactory.initElements(driver, Login.class);
		AddEvent addEvent=PageFactory.initElements(driver,AddEvent.class);
		EnableSessionModule enableModule=PageFactory.initElements(driver, EnableSessionModule.class);
		AddSession addSession=PageFactory.initElements(driver,AddSession.class);

		// Data
		ExcelDataProvider dataProvider = new ExcelDataProvider();

		String id = dataProvider.getStringData("Login", 1, 0);
		String pwd = dataProvider.getStringData("Login", 1, 1);
		Users user1 = new Users(id, pwd);
		login.loginToApp(user1);
	//	addEvent.addEvent();
		String eventName = "UC event";
		
		System.out.println("Name is " +eventName);
	  addEvent.selectEvent(eventName);
		enableModule.enableModule();
		String sText ="Keynotes";
		addSession.addSession(sText);
		
		
	}

}
