package CommonLibs;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import commonLibsInterface.IDropdownControls;

public class dropdownControls implements IDropdownControls
{

	public void selectViaVisibleText(WebElement element, String visibleText) throws Exception 
	{
	   Select select = new Select(element);
	   select.selectByVisibleText(visibleText);
	}

	public void selectViaVisibleValue(WebElement element, String value) throws Exception
	{
		 Select select = new Select(element);
		 select.selectByValue(value);
	}
	public void selectviavisibleIndex(WebElement element, int index) throws Exception
	{
		 Select select = new Select(element);
		 select.selectByIndex(index);
	}
	public boolean isMultiple(WebElement element) throws Exception 
	{
		 Select select = new Select(element);
		 return select.isMultiple();
	}
	public List<WebElement> getAllOptions(WebElement element) throws Exception 
	{
		 Select select = new Select(element);
		 return select.getOptions();
	}
	public List<WebElement> getAllSelectedOptions(WebElement element) throws Exception
	{
		 Select select = new Select(element);
		 return select.getAllSelectedOptions();
	}
	public WebElement getFirstSelectedOption(WebElement element) throws Exception
	{ 
		Select select = new Select(element);
		return select.getFirstSelectedOption();
	}

}
