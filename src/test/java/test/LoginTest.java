package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Dashboard;
import page.LonginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	
		
	@Test
		public void validUserShouldBeAbleTOLogin() {
			
		 driver = BrowserFactory.inti();
		
		 LonginPage loginPage = PageFactory.initElements(driver, LonginPage.class);
		 loginPage.enterUserName("demo@techfios.com");
		 loginPage.enterPassword("abc123");
		 loginPage.clickSigninButton();
		 
		 Dashboard dashboard =PageFactory.initElements(driver, Dashboard.class);
		 dashboard.validateDashbordPage();
		 
		 BrowserFactory.tearDown();
		 
		 
		
		}
}
