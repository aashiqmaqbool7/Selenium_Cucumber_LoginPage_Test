//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginSteps {
//	
//	WebDriver driver = null;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		String projectPath =System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		//driver.manage().window().maximize();
//		System.out.println("browser launched");
//	    System.out.println("Browser launched");
//	}
//	
//	@Given("user is on login page")
//	public void user_is_on_login_page() throws InterruptedException {
//		driver.navigate().to("https://example.testproject.io/web");
//		Thread.sleep(2000);
//		System.out.println("Inside-Login Page");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String uname, String pwd) throws InterruptedException {
//		driver.findElement(By.id("name")).sendKeys(uname);
//		Thread.sleep(2000);
//		driver.findElement(By.id("password")).sendKeys(pwd);
//		Thread.sleep(2000);
//	    System.out.println("username and password entered");
//	}
//
//	@When("user clicks on login button")
//	public void user_clicks_on_login_button() {
//		driver.findElement(By.id("login")).click();;
//	    System.out.println("login button clicked");
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//		driver.findElement(By.id("logout")).isDisplayed();
//		driver.findElement(By.id("logout")).click();
//	    System.out.println("navigated to login page");
//	}
//
//
//}
