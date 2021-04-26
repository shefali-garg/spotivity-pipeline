package CommonLibs;
import org.openqa.selenium.WebElement;

import commonLibsInterface.IWebElement;

public class webElementControls implements IWebElement
{

	public void click(WebElement element) throws Exception
	{
		element.click();
	}

	public String getText(WebElement element) throws Exception
	{
		return element.getText();
	}

	public String getAttribute(WebElement element, String attribute) throws Exception
	{
		return element.getAttribute(attribute);
	}

	public String getCSSValue(WebElement element, String cssPropertyName) throws Exception
	{
		return element.getCssValue(cssPropertyName);
	}

	public boolean isElementEnabled(WebElement element) throws Exception 
	{
	    return element.isEnabled();
	}

	public boolean isElementVisible(WebElement element) throws Exception
	{
		return element.isDisplayed();
	}

	public boolean isElementSelected(WebElement element) throws Exception
	{
		return element.isSelected();
	}

}
