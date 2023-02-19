package steps;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.BasePage;
import pages.Database;
import pages.LoginPage;

public class LoginStepDefinition extends BasePage{

	LoginPage loginPage;
	Database database;
	
    @Before
    public void setUp() {		
    	init();
    	loginPage = PageFactory.initElements(driver, LoginPage.class);
    	database = new Database();
    }
	
	@Given ("^User is on techfios login page$")
	public void user_is_on_techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=admin/");
		takeScreenshot(driver);
	}
	
	@When ("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {
		loginPage.inserUserName(username);
	}
	
	@When ("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		loginPage.inserPassword(password);
	}
	

	@When ("^User clicks on signin button$")
	public void user_clicks_on_signin_button() {
		loginPage.clickSignIn();	
	}
	
	@Then ("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() {
		Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle());
		takeScreenshot(driver);
	}
	@When("^User enters username from database$")
	public void user_enters_username_from_database() throws ClassNotFoundException, SQLException {
		System.out.println("Username from DB:" + database.getDataFromDB("username"));
		loginPage.inserUserName(database.getDataFromDB("username"));
	}

	@When("^User enters password from database$")
	public void user_enters_password_from_database() throws ClassNotFoundException, SQLException {
		System.out.println("Password from DB:" + database.getDataFromDB("password"));
		loginPage.inserPassword(database.getDataFromDB("password"));
	}
	
 	@After
 	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
