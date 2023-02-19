package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	 WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	// For POM defining element -> @FindBy(how = How. , using = "")
   //WebElement list
	//type name = value
	@FindBy(how = How.ID, using = "username")
	WebElement USER_ELEMENT;
	@FindBy(how = How.ID, using = "password")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.NAME, using = "login")
	WebElement SIGNIN_BUTTON_ELEMENT;

	//corresponding methods
	public void inserUserName(String userName) {
		USER_ELEMENT.sendKeys(userName);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void inserPassword(String passWord) {
		PASSWORD_ELEMENT.sendKeys(passWord);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void clickSignIn() {
		SIGNIN_BUTTON_ELEMENT.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	
}

