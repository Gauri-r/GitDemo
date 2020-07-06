package Resources;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverBaseClass {
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException {
		 prop = new Properties();
		FileInputStream fis=new FileInputStream("F:\\Gauri\\EclipseOxygen\\EndToEndProject\\src\\main\\java\\Resources\\Data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("Browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Destiny\\Downloads\\ChromeDriver\\chromedriver_win32 (1) version83\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if (browserName=="firefox")
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Destiny\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if (browserName=="IE") 
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\Destiny\\Downloads\\IEDriverServer_x64_2.39.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();	
		}
		return driver;
	}
}
