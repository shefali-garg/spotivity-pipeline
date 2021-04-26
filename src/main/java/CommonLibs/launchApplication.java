package CommonLibs;

public class launchApplication
{
 public static void main(String[] args)
 {
	 try
	 {
		 CommonDriver Driver=new CommonDriver("firefox");
		 Driver.setPageLoadTimeout(401);
		 Driver.setElementDetectionTimeout(201);
		 Driver.openbrowser("https://stagdirector.spotivity.com/enrollment");
		 
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
 }
}
