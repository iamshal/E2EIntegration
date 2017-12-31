package testCases;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_001 {
	
	@Test
	public void testcase()
	{
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Executables\\chromedriver.exe");
				FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
	}

}
