package spotivityAgencyTestcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import spotivityAgency.signUp;
import spotivityAgencyTestcases.driverInvocationTestcase;
  public class signUpTestcases extends driverInvocationTestcase
  { 	
	
  @Test(priority = 3)
    public void signUpPage() throws Exception
    {
	 Thread.sleep(1000);
		ExtentTest logger2=extent.createTest("Signup");
		logger2.log(Status.INFO, "Click dropdown button");
	 sign.dropdownButton();
	// extent.flush();
     }
 }
