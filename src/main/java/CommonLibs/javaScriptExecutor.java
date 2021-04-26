package CommonLibs;

import org.openqa.selenium.WebDriver;

import commonLibsInterface.IJavaScriptExecutor;
public class javaScriptExecutor implements IJavaScriptExecutor
{
	private WebDriver driver;
    public javaScriptExecutor(WebDriver driver)
     {
	   this.driver=driver;
     }
	public void executeJavaScript(String scriptToExecute) throws Exception
	{
	   javaScriptExecutor je= (javaScriptExecutor) driver;
	   je.executeJavaScript(scriptToExecute);
	}
	public void scrollDown(int x, int y) throws Exception
	{
		javaScriptExecutor je= (javaScriptExecutor) driver;
		String jscommand=String.format("window.scrollBy(%d,%d)",x,y);
		je.executeJavaScript(jscommand);
	}
	public String executeJavaScriptWithReturnValue(String scriptToExecute) throws Exception
	{
		javaScriptExecutor je= (javaScriptExecutor) driver;
		return je.executeJavaScriptWithReturnValue(scriptToExecute).toString();
	}
   public void executeAsyncJavaScript(String scriptToExecute, Object[] args) throws Exception 
   {
	   javaScriptExecutor je= (javaScriptExecutor) driver;
	   if(args==null)
	   {
		  je.executeJavaScript(scriptToExecute); 
	   }
	   else
	   {
		  je.executeAsyncJavaScript(scriptToExecute, args);  
	   }
	  
	}

}
