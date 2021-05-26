package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomer {
	WebDriver driver;

	public AddCustomer(WebDriver driver) {
		this.driver = driver;
		
	}
	// Element Liberary
//	WebElement element = driver.findElement(By.xpath("//*[@id="username"]"));
//	By Locator = By.xpath("//*[@id="username"]");

	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")WebElement USERNAME_FIELD;
}
