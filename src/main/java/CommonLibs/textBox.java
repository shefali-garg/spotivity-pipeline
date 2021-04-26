package CommonLibs;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebElement;

import commonLibsInterface.ITextbox;

public class textBox implements ITextbox
{ 
	public void setText(WebElement element, String Text) throws Exception
	{
	  element.sendKeys(Text);
	}

	public void clearText(WebElement element) throws Exception
	{
		element.clear();
		
	}

}
