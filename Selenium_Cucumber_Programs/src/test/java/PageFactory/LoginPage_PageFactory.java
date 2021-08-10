package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PageFactory {
	
	//locators
	@FindBy(id = "name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login")
	WebElement logIn;
	
	//constructor
	// create a constructor to get a driver instance 
	// and to initialize Elements using method initElements
	
	WebDriver driver;
	
	public LoginPage_PageFactory(WebDriver driver) {
		this.driver=driver;
		//we got the driver
		// now we need initialize the elements
		PageFactory.initElements(driver, this);
			//	whenever this wll be called all the elements in the webpage
			// will be initialized 
	}
	
	//actions
	public void enterUsername(String uname) {
		username.sendKeys(uname);
	}
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickLoginButton() {
		logIn.click();
	}
	
}
