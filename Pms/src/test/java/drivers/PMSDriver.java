package drivers;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class PMSDriver {
  //@Test
  
	public static WebDriver pmsDriver;
	public DesiredCapabilities dc;

	@BeforeSuite (enabled = true)
	public void setupChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/chromedriver.exe");
		pmsDriver = new ChromeDriver();
		pmsDriver.manage().window().maximize();
		
	}
		
	@BeforeSuite (enabled = false)
	public void setup() throws FileNotFoundException, IOException {

		dc = DesiredCapabilities.internetExplorer();
		dc.setCapability("ie.ensureCleanSession", true);
		dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		dc.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);

		System.setProperty("webdriver.ie.driver", "src/ieDriverServer.exe");
		pmsDriver = new InternetExplorerDriver(dc);  
  
  
  
  
  //public void f() {
  }
}
