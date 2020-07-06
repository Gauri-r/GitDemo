package stepDefinations;


//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

import Resources.DriverBaseClass;
import SeleniumTotalTrial.HomePage;

@RunWith(Cucumber.class)
public class stepDefination extends DriverBaseClass {

	public static Logger log=LogManager.getLogger(HomePage.class.getName());
	
    @Given("^Initialize browser$")
    public void initialize_browser() throws Throwable {
    	driver = initializeDriver();
		
		log.info("Browser Driver got Initialized for HomePage ");
    }

    @When("^User login into application with (.+) and (.+)$")
    public void user_login_into_application_with_and(String username, String password) throws Throwable {
    	LoginPage login = new LoginPage(driver);
		login.UserNameLoginPage().sendKeys(username);
		login.PasswordLoginPage().sendKeys(password);
		login.SubmitLoginPage().click();
    }
    
    
    @Then("^Verify that user is successfully logged in$")
    public void verify_that_user_is_successfully_logged_in() throws Throwable {
     
    }

    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    	driver.get(strArg1);
		log.info("url Fetched Successfully for HomePage");
		
		
    }

    @And("^User click on SignIn button$")
    public void user_click_on_signin_button() throws Throwable {
    	LandingPage landPage=new LandingPage(driver);
		landPage.Login().click();
		log.info("Login Link Clicked");
    }

}