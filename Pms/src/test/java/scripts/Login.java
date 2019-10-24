package scripts;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import drivers.PMSDriver;


public class Login extends PMSDriver {
  
	//To test the Login button using javascript (to make this code Object Oriented)
	By LoginButton = By.xpath("//*[@id='BuyerLoginName']");
	WebElement loginB;
	
	
	@Test
	public void login() {

		pmsDriver.get("https://stage.proactismanagedservices.com");
		//pmsDriver.get("https://secureqc.perfect.com/Website/Login/login.aspx?&customerid=bpsEMGR");
		
		  WebElement login_txt = pmsDriver.findElement(By.xpath("//*[@id=\'txtUsername\']"));
		  login_txt.sendKeys("jennie.jornales@proactis.com");
			  
		  WebElement password_txt = pmsDriver.findElement(By.xpath("//*[@id=\'txtPassword\']"));
		  password_txt.sendKeys("Welcome1!");
		 			  
		 WebElement login_btn = pmsDriver.findElement(By.xpath("//*[@id=\'loginButton\']"));
		 login_btn.click();
		  
		//To test the Login button using javascript
		  //loginB = pmsDriver.findElement(LoginButton);
		  //JavascriptExecutor js = (JavascriptExecutor)pmsDriver;
		  //js.executeScript("arguments[0].click()", loginB);
}

}