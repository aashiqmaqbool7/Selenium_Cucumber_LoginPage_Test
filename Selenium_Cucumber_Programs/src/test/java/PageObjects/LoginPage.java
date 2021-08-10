package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	//constructor
			// receive the webdriver from step definition class
	public LoginPage(WebDriver driver) {
		//this is a constructor 
		//this constructor will be called everytime a instance or object is created for the login page class
		// like if LoginPage lp = new LoginPage() <--- if this created in step definition
		// this constructor will be called
		this.driver = driver;
		
		//checking if the driver is on correct webpage or not
		if(!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("This is not the expected page.. Current page is "
											+driver.getCurrentUrl());
		}
	}

	//locators
	By username = By.id("name");
	By password = By.id("password");
	By login = By.id("login");
	By logout = By.id("logout");
	
	//actions
	public void enterUsername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLogin() {
		driver.findElement(login).click();
	}
	
	public boolean isLogoutDisplayed() {
		return driver.findElement(logout).isDisplayed();
	}
	public void clickLogout() {
		driver.findElement(logout).click();
	}
	
	//all actions in single function
//	public void loginfunc(String uname, String pwd) {
//		driver.findElement(username).sendKeys(uname);
//		driver.findElement(password).sendKeys(pwd);
//		driver.findElement(login).click();
//	}
	
}
