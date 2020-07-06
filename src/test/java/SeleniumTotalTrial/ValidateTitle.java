package SeleniumTotalTrial;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.DriverBaseClass;
import junit.framework.Assert;
import pageObjects.LandingPage;
//import pageObjects.LoginPage;

public class ValidateTitle extends DriverBaseClass {
	public static Logger log=LogManager.getLogger(HomePage.class.getName());

	@BeforeTest
	public void initialization() throws IOException
	{
		driver = initializeDriver();
		log.info("Browser Driver got Initialized for ValidateTitle");
		driver.get(prop.getProperty("url"));
		log.info("url Fetched Successfully for ValidateTitle");
			
	}
	
	@Test
	public void basePageNavigation() throws IOException {

		
		LandingPage landPage=new LandingPage(driver);
		
		
		
		//Assert.assertEquals("Featured Courses", landPage.getTitle().getText());
		
	Assert.assertEquals("FEATURED COURSES", landPage.getTitle().getText());
	log.info("Validation Successful for Name FEATURED COURSES");
	
	
	
	}
	@AfterTest
	public void tearDown()
	{
	driver.close();	
	}
	
}
