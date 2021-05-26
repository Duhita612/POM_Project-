package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LonginPage {
	
	WebDriver driver;
	
	public LonginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	//Element Liberary
//	WebElement element = driver.findElement(By.xpath("//*[@id="username"]"));
//	By Locator = By.xpath("//*[@id="username"]");
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"username\"]") WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using ="//*[@id=\"password\"]") WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using ="/html/body/div/div/div/form/div[3]/button") WebElement SIGNIN_FIELD;
	
	//Interactive Methods
	//Technique individual methods
	public void enterUserName(String userName) {
		USERNAME_FIELD.sendKeys(userName);
	}

	public void enterPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
		
	}
	
	public void clickSigninButton() {
		SIGNIN_FIELD.click();
	}

	//Technique combined method
	
	public void testLogin (String userName, String password) {
		USERNAME_FIELD.sendKeys(userName);
		PASSWORD_FIELD.sendKeys(password);
		SIGNIN_FIELD.click();
	}
	
	
	}
	
	

