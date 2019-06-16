package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjects.BaseClass;
import PageObjects.SignUpForm;

public class SignUpFormTest extends BaseClass {
	@Test
	public SignUpFormTest(){
		
		logger=reports.startTest("Login Success");
		
		SignUpForm signUp= PageFactory.initElements(driver,SignUpForm.class);
		try {
			signUp.signUp();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
