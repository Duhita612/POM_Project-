package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Dashboard {
	WebDriver driver;

	public Dashboard(WebDriver driver) {
		this.driver = driver;
		
	}
	// Element Liberary
//	WebElement element = driver.findElement(By.xpath("//*[@id="username"]"));
//	By Locator = By.xpath("//*[@id="username"]");


	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Dashboard')]") WebElement DASHBOARD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customer')]") WebElement CUSTOMER_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Add Customer')]") WebElement ADD_CUSTOMER_BUTTON_ELEMENT;
	
	
	
	//Interative Methods
	public void validateDashbordPage() {
		Assert.assertEquals(DASHBOARD_ELEMENT.getText(), "Dashboard", "Dashbord page not found");
	}
	
	public void clickCustomerButton(){
		CUSTOMER_BUTTON_ELEMENT.click();
	}
	public void clickAddCustomerButton(){
		ADD_CUSTOMER_BUTTON_ELEMENT.click();
	}
}
