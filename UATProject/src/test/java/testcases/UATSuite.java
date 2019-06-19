package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.AddEvent;
import PageObjects.AddSession;
import PageObjects.BaseClass;
import PageObjects.EnableSessionModule;
import PageObjects.LogOut;
import PageObjects.Login;
import dataProvider.ExcelDataProvider;
import helper.Utility;
import pojo.Users;

public class UATSuite extends BaseClass{
	
	@Test
	public void UATSuite(){
		
		logger=reports.startTest("Login Success");
		
		Login login= PageFactory.initElements(driver,Login.class);
		AddEvent addEvent=PageFactory.initElements(driver,AddEvent.class);
	//	EnableSessionModule enableModule=PageFactory.initElements(driver, EnableSessionModule.class);
	//	AddSession addSession=PageFactory.initElements(driver,AddSession.class);
		LogOut logout=PageFactory.initElements(driver,LogOut.class);
		
		ExcelDataProvider dataProvider = new ExcelDataProvider();

		
		String id = dataProvider.getStringData("Login", 1, 0);
		String pwd = dataProvider.getStringData("Login", 1, 1);
		Users user1 = new Users(id, pwd);
		login.loginToApp(user1);
		logger.log(LogStatus.PASS, "User logged in and validation passed");
		 //addEvent.addEvent();
		 String eventName = "Qualifications event";
		
	//	System.out.println("Name is " +eventName);
		addEvent.selectEvent(eventName);
	//	enableModule.enableModule();
	/*	String sText ="Keynotes";
		addSession.addSession(sText); */
		logout.LogOutOfApp();
		reports.endTest(logger);
		
	}

}
