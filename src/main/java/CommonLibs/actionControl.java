package CommonLibs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonLibsInterface.IActionControl;

public class actionControl implements IActionControl
{
   private WebDriver driver;
   public actionControl(WebDriver driver)
   {
	   this.driver=driver;
   }

	public void dragAndDrop(WebElement e1, WebElement e2) throws Exception
	{
		Actions action =new Actions(driver);
		action.dragAndDrop(e1,e2).build().perform();
	}
	public void moveToElement(WebElement e1) throws Exception 
	{
		Actions action =new Actions(driver);
		action.moveToElement(e1).build().perform();
	}
    public void rightClick(WebElement e1) throws Exception 
    {
    	Actions action =new Actions(driver);
		action.contextClick().build().perform();
	}
	public void doubleClick(WebElement e1) throws Exception
	{
		Actions action =new Actions(driver);
		action.doubleClick().build().perform();
	}
	public void moveToElementAndClick(WebElement e1) throws Exception
	{
		Actions action =new Actions(driver);
		action.moveToElement(e1).click().build().perform();
	}

}
