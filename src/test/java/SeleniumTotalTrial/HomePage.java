package SeleniumTotalTrial;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.DriverBaseClass;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePage extends DriverBaseClass
{

	public static Logger log=LogManager.getLogger(HomePage.class.getName());
	
	@BeforeTest
	public void initialization() throws IOException
	{
		driver = initializeDriver();
		
		log.info("Browser Driver got Initialized for HomePage ");
			
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String userName, String password) throws IOException 
	{

		driver.get(prop.getProperty("url"));
		log.info("url Fetched Successfully for HomePage");
		
		LandingPage landPage=new LandingPage(driver);
		landPage.Login().click();
		log.info("Login Link Clicked");
		
		LoginPage login = new LoginPage(driver);
		login.UserNameLoginPage().sendKeys(userName);
		login.PasswordLoginPage().sendKeys(password);
		login.SubmitLoginPage().click();
		//log.info("Login Attempt Made");

	}
	
	@AfterTest
	public void tearDown()
	{
	driver.close();	
	}
	
	@DataProvider
	public Object[][] getData() 
	{
	
		Object[][] data=new Object[2][2];
		data[0][0]="abcd@gmail.com";
		data[0][1]="abcs12345";
		
		data[1][0]="ghij@rediffmail.com";
		data[1][1]="12345";
		return data;
	}

	
}
