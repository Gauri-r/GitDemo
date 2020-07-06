package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By userName = By.xpath("//input[@id='user_email']");
	By password = By.xpath("//input[@id='user_password']");
	By submit = By.xpath("//input[@name='commit']");
	
	
	public WebElement UserNameLoginPage() 
	{
		return(driver.findElement(userName));
	}
	
	public WebElement PasswordLoginPage() 
	{
		return(driver.findElement(password));	
	}
	public WebElement SubmitLoginPage() 
	{
		return(driver.findElement(submit));
		
	}

}
