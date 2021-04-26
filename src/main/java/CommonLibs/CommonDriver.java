package CommonLibs;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import commonLibsInterface.IDriver;

public class CommonDriver implements IDriver

{
 static public  WebDriver driver;
  private long pageLoadTimeout;
  private long elementDetectionTimeout;
  public CommonDriver(String browserType )throws Exception
     {
	   pageLoadTimeout=301;
	   elementDetectionTimeout=101;	
	   browserType=browserType.trim(); //Remove the white spaces
	   switch(browserType.toLowerCase())
	    {
	     case "chrome":
	     System.setProperty("webdriver.firefox.driver", "arg1");
	     driver=new ChromeDriver();
	     break;
	     
	     case "firefox":
		 System.setProperty("webdriver.gecko.driver", "C://Users/anmolg/Downloads/selenium/geckodriver.exe");
		 driver=new FirefoxDriver();
		 break;
		 
		 default:
	     throw new Exception("Invalid Browser type"+ browserType);
	   }
     }
  
  public WebDriver getdriver()
  {
	  return driver;
  }
  public void openbrowser(String url) throws Exception
	{
	url=url.trim();
	  if(url.isEmpty())
	   {
		url="spotivity";
	   }
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(pageLoadTimeout,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(elementDetectionTimeout,TimeUnit.SECONDS);
	driver.get(url);
	}

  public void closeBrowser() throws Exception
    {
	 
		driver.quit();
		driver=null;

    }

  public void closeAllBrowser() throws Exception
    {
		// TODO Auto-generated method stub
		
	}

   public void setPageLoadTimeout(long pageLoadTimeout) throws Exception 
	{
		this.pageLoadTimeout =pageLoadTimeout;
	}

	public void setElementDetectionTimeout(long elementDetectionTimeout) throws Exception 
	 {
	this.elementDetectionTimeout=elementDetectionTimeout;
		
	 }


	public String getTitle() throws Exception 
	 {
		
		return driver.getTitle();
	 }

   public String getPageSource() throws Exception
	 {
		return driver.getPageSource();
	 }

   public String getCurrentUrl() throws Exception
     {
		return driver.getCurrentUrl();
	 }


	public void navigateTo(String url) throws Exception 
	 {
		driver.navigate().to(url);
	 }

   public void navigateRefresh() throws Exception 
	{
		 driver.navigate().refresh();
	}

	public void navigateForword() throws Exception
	{
		driver.navigate().forward();
	}

	
	public void navigateBack() throws Exception
	{
		driver.navigate().back();	
	}


}
