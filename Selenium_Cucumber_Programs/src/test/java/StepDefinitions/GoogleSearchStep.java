package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchStep {
	
	WebDriver driver = null;

	@Given("Browser is open")
	public void browser_is_open() {
		String projectPath =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		System.out.println("browser launched");
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://www.google.com");
		System.out.println("user is on google search page");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Youtube");
		System.out.println("user entered text in search box");
		Thread.sleep(2000);
	}

	@When("hits enter")
	public void hits_enter() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("user hits enter");
		Thread.sleep(2000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		driver.getPageSource().contains("History");
	    System.out.println("user navigated to result page");
	}
}
