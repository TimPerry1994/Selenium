import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Main {
	
	WebDriver driver;
	String baseUrl, nodeUrl;
	
	@BeforeTest
	public void setUp() throws MalformedURLException{
		baseUrl = "http://newtours.demoaut.com";
		nodeUrl = "http://http://52.212.136.82:5557/wf/hub";
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.LINUX);

		driver = new RemoteWebDriver(new URL(nodeUrl), capability);
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
	@Test
	public void simpleTest() {
		driver.get(baseUrl);
		Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());
	}
}
