package spotivityAgency;



import org.testng.annotations.Test;


	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import CommonLibs.CommonDriver;
	import CommonLibs.textBox;
	import CommonLibs.webElementControls;
	import spotivityAgencyTestcases.driverInvocationTestcase;

	public class signUp
	{
		 public signUp (WebDriver driver)
		 {
		
			 webElement = new webElementControls();
			PageFactory.initElements(driver,this);
			
		 }

	 
	 @FindBy(className="m--img-rounded m--marginless m--img-centered")
	 private WebElement dropdownButton;
	
	 
	 private webElementControls webElement;
	  
	 
	 public void dropdownButton() throws Exception
	 {
		
		 webElement.click(dropdownButton);
	 }



  }

