package spotivityAgencyTestcases;

import java.util.Properties;

import org.openqa.selenium.grid.config.Config;
import org.testng.ReporterConfig.Property;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class loginTestcase extends driverInvocationTestcase
{ 	
@Test(priority = 2)
  public void loginPage() throws Exception
  {
	ExtentTest logger=extent.createTest("login");
	logger.log(Status.INFO, "Enter Email");
	lgn.emailTextField(prop.getProperty("emailid"));
	logger.log(Status.INFO, "Enter password");
	lgn.passwordTextField(prop.getProperty("password"));
	logger.log(Status.INFO, "click submit button");
	lgn.signInButton();
//	extent.flush();
}
}
