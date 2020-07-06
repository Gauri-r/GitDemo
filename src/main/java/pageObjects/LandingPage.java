package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	WebDriver driver;
	
	By login = By.xpath("//span[contains(text(),'Login')]");
	By title = By.xpath("//h2[contains(text(),'Featured Courses')]");
	By navBar = By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	
	public LandingPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement Login() 
	{
	
		return (driver.findElement(login));
		
	}
	
	public WebElement getTitle() 
	{
		return(driver.findElement(title));	
	}
	
	public WebElement getNavigationBar()
	{
		return(driver.findElement(navBar));	
	}
}
