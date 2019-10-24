package testcase;

import org.testng.annotations.Test;
import drivers.PMSDriver;
import scripts.Login;

public class TC001 extends PMSDriver {
	@Test
	public void login() {
		Login lm = new Login();
		lm.login();
		}
}
