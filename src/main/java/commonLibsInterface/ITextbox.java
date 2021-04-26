package commonLibsInterface;

import org.openqa.selenium.WebElement;

public interface ITextbox 
{

	public void setText(WebElement element, String Text) throws Exception;
	
	public void clearText(WebElement element) throws Exception;
	
	
}
