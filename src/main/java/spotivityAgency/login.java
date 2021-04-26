package spotivityAgency;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import CommonLibs.textBox;
import CommonLibs.webElementControls;


public class login 
{ 
	 public login(WebDriver driver)
	 {
		 textbox=new textBox();
		 webElement = new webElementControls();
		PageFactory.initElements(driver,this);
		
	 }

 @FindBy(id="mat-input-0")
 @CacheLookup
 private WebElement emailId;
 
 @FindBy(id="mat-input-1")
 private WebElement password;
 
 @FindBy(xpath="//button[@class=\"mat-raised-button mat-#ffffff\"]")
 private WebElement signInButton;
 
 private textBox textbox;
 
 private webElementControls webElement;
 public void emailTextField(String text) throws Exception
 {
	 
	 textbox.setText(emailId,text);
 }
 
 public void passwordTextField( String text) throws Exception
 {
	 textbox.setText(password,text);
 }
 
 public void signInButton() throws Exception
 {
	 webElement.click(signInButton);
 }
}

