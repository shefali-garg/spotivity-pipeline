package CommonLibs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonLibsInterface.IFrameHandling;

public class frameHandling implements IFrameHandling 
{ 
	private WebDriver driver;
    public frameHandling(WebDriver driver)
     {
	   this.driver=driver;
     }
	public void switchToFrame(String frameId) throws Exception
	 {
	   driver.switchTo().frame(frameId);
	 }
	public void switchToFrame(WebElement element) throws Exception
	 {    
		 driver.switchTo().frame(element);
	 }
	public void switchToFrame(int index) throws Exception
	 {
		 driver.switchTo().frame(index);
	 }
	public void switchToDefaultContent() throws Exception 
	 {
		 driver.switchTo().defaultContent();
	 }

}
