package CommonLibs;

import org.openqa.selenium.WebDriver;

import commonLibsInterface.IAlert;

public class alerts implements IAlert
{

	private WebDriver driver;
	public alerts()
	{
		this.driver=driver;
	}
	public void acceptAlert() throws Exception 
	{ 
		driver.switchTo().alert().accept();
	}
	public void rejectAlert() throws Exception
	{
		driver.switchTo().alert().dismiss();
	}
    public String getMessageFromAlert() throws Exception 
	{
		return driver.switchTo().alert().getText();
	}
	public String isAlertPresent() throws Exception {
		return driver.switchTo().alert().getText();
	}

}
