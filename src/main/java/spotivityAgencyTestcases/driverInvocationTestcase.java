package spotivityAgencyTestcases;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import CommonLibs.CommonDriver;
import spotivityAgency.login;
import spotivityAgency.signUp;
public class driverInvocationTestcase
{
 static CommonDriver cmDriver;
 login lgn;
 static signUp sign;
 public static Properties prop;
 public static ExtentHtmlReporter htmlReporter;
 public static ExtentReports extent;
 public ExtentTest logger;
  @BeforeSuite(alwaysRun = true)
  public void setUp()
  {
	  
	  try
	   {
		   prop=new Properties();
			try 
			{
				FileInputStream input=new FileInputStream("C:\\Users\\anmolg\\eclipse-workspace\\agnecy\\config.properties");
				prop.load(input);
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		cmDriver=new CommonDriver("firefox");
		lgn=new login(cmDriver.getdriver());
		sign=new signUp(cmDriver.getdriver());
		cmDriver.openbrowser(prop.getProperty("url"));
		} 
	  catch (Exception e)
	  {
		e.printStackTrace();
	  }  
      htmlReporter=new ExtentHtmlReporter("C:\\Users\\anmolg\\eclipse-workspace\\agnecy\\report\\myReport.html");//specify location of the report
	 // htmlReporter.loadXMLConfig(System.getProperty("C:\\Users\\anmolg\\eclipse-workspace\\agnecy\\extent-config.xml"));
	  
    extent=new ExtentReports();
	  
    extent.attachReporter(htmlReporter);
  } 

  @BeforeClass
  public static void startTest()
  {
	 
	   
  }
  
  @AfterClass
  public static void endTest()
  {
	extent.flush();
		 

  }
 @AfterSuite
public void closeBrowser() throws Exception
 {
	
//cmDriver.closeBrowser();
	// cmDriver.driver=null;
	 

 }
 
}
