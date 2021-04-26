package CommonLibs;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import commonLibsInterface.IWindowHandle;

public class windowHandle implements IWindowHandle
{

	private WebDriver driver;
	public windowHandle(WebDriver driver)
	{
		this.driver=driver;
	}
	public void switchToChildWindow() throws Exception {
		driver.switchTo().parentFrame();
		
	}
	public void switchToParentWindow() throws Exception
	{
		driver.switchTo().parentFrame();
	}
	public String getWindowHandle() throws Exception
	{
		String getwindow=driver.getWindowHandle();
		return getwindow;
	}
	public Set<String> getWindowHandles() throws Exception
	{
		return null;
	}
}
