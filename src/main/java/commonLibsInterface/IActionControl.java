package commonLibsInterface;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public interface IActionControl 
{
	public void dragAndDrop(WebElement e1, WebElement e2) throws Exception;
	
	public void moveToElement(WebElement e1) throws Exception;
	
	public void rightClick(WebElement e1) throws Exception;
   
	public void doubleClick(WebElement e1) throws Exception;
	
	public void moveToElementAndClick(WebElement e1) throws Exception;
	
}
