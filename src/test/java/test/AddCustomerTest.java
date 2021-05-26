package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.Dashboard;
import page.LonginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;
	
	@Test
	public void validUserShouldBEAbleToAddCustomer() throws InterruptedException {
		driver = BrowserFactory.inti();
		
		 LonginPage loginPage = PageFactory.initElements(driver, LonginPage.class);
		 loginPage.enterUserName("demo@techfios.com");
		 loginPage.enterPassword("abc123");
		 loginPage.clickSigninButton();
		 
		 Dashboard dashboard =PageFactory.initElements(driver, Dashboard.class);
		 dashboard.validateDashbordPage();
		 Thread.sleep(3000);
		 dashboard.clickCustomerButton();
		 Thread.sleep(3000);

		 dashboard.clickAddCustomerButton();
		 
		 AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		 addCustomerPage.insertFullName("Selenium");
		 addCustomerPage.insertCompanye("Techfios");
		 addCustomerPage.insertEmail("abc456@techfios.com");
		 addCustomerPage.insertPhone("254-456-8527");
		 addCustomerPage.insertAddress("1256 glean dr.");
		 addCustomerPage.insertCountry("United States");
		 
		 
	}
}
	

