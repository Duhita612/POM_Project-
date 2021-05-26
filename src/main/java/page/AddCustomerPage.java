package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
		
	}
	// Element Liberary

	@FindBy(how = How.XPATH, using = "//*[@id='account']") WebElement FULL_NAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id='cid']") WebElement COMPANY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id='email']") WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id='phone']") WebElement PHONE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id='address']") WebElement ADDRESS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id='select2-country-container']") WebElement COUNTRY_FIELD_LOCATOR;
	
		//Interative Methods
	public void insertFullName(String fullName) {
		FULL_NAME_FIELD_LOCATOR.sendKeys(fullName + generateNumber(999));
	}
	public void insertCompanye(String company) {
		selectDropdown(COMPANY_FIELD_LOCATOR, company);
	}
	public void insertEmail(String email) {
		EMAIL_FIELD_LOCATOR.sendKeys(generateNumber(999) + email);
	}
	public void insertPhone(String phone) {
		PHONE_FIELD_LOCATOR.sendKeys(phone);
	}
	public void insertAddress(String address) {
		ADDRESS_FIELD_LOCATOR.sendKeys(address);
	}
	public void insertCountry(String country) {
		selectDropdown (COUNTRY_FIELD_LOCATOR, country);
	}
	public void selectDropdown(WebElement cOUNTRY_FIELD_LOCATOR2, String country) {
			
	}
}
