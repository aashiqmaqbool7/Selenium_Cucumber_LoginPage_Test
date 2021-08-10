package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PageFactory {

	@FindBy(id="logout")
	WebElement btn_logout;
	
	WebDriver driver;
	public HomePage_PageFactory(WebDriver driver) {
		this.driver=driver;
		//we got the driver
		// now we need initialize the elements
		PageFactory.initElements(driver, this);
			//	whenever this wll be called all the elements in the webpage
			// will be initialized
	}

	public void clickLogoutButton() {
		if(btn_logout.isDisplayed()) {
			btn_logout.click();
		}
		
	}
}
