package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

 
public class Calculator {
	public WebDriver driver;
	public String URL, Node;
	public Keys Key;
	protected ThreadLocal<RemoteWebDriver> threadDriver = null;
 
	@Parameters("browser")
	@BeforeTest
	public void launchbrowser(String browser) throws MalformedURLException {
		String URL = "http://www.google.com";
 
		if (browser.equalsIgnoreCase("firefox")) {
			System.out.println(" Executing on FireFox");
			String Node = "http://192.168.1.32:5555/wd/hub";
			DesiredCapabilities cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
 
			driver = new RemoteWebDriver(new URL(Node), cap);
			// Puts an Implicit wait, Will wait for 10 seconds before throwing
			// exception
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
			// Launch website
			driver.navigate().to(URL);
			driver.manage().window().maximize();
		} 
		else if (browser.equalsIgnoreCase("chrome")) {
			System.out.println(" Executing on CHROME");
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			String Node = "http://192.168.1.32:5556/wd/hub";
			driver = new RemoteWebDriver(new URL(Node), cap);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
			// Launch website
			driver.navigate().to(URL);
			driver.manage().window().maximize();
		 
		} 
		else {
			throw new IllegalArgumentException("The Browser Type is Undefined");
		}
	}
 
	@Test
	public void calculatepercent() {
		// Enter value 17 in the first number of the percent Calculator
		driver.findElement(By.id("lst-ib")).sendKeys("end my pitiful existence");
		// Enter value 35 in the second number of the percent Calculator
		 
		// Click Calculate Button
		try {
		    Thread.sleep(2500);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		// Get the Result Text based on its xpath
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		// Print a Log In message to the screen
		
		driver.findElement(By.id("uid_0")).click();
	}
 
	@AfterTest
	public void closeBrowser() {
		// driver.quit();
	}
}