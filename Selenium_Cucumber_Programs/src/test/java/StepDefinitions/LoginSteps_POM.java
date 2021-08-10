//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import PageObjects.LoginPage;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginSteps_POM {
//	//pass this "driver" instance to the page class
//	// to maintain the session
//	WebDriver driver = null;
//	//Login Page instance defining and passing the driver when calling
//	LoginPage lp;
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
//
//		driver.navigate().to("https://example.testproject.io/web");
//		Thread.sleep(2000);
//		System.out.println("Inside-Login Page");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String uname, String pwd) throws InterruptedException {
//		lp = new LoginPage(driver);
//		lp.enterUsername(uname);
//		Thread.sleep(2000);
//		lp.enterPassword(pwd);
//		Thread.sleep(2000);
//	    System.out.println("username and password entered");
//	}
//
//	@When("user clicks on login button")
//	public void user_clicks_on_login_button() {
//		lp = new LoginPage(driver);
//		lp.clickLogin();
//	    System.out.println("login button clicked");
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//		lp = new LoginPage(driver);
//		if(lp.isLogoutDisplayed()) {
//			lp.clickLogout();
//		}
//	    System.out.println("navigated to login page");
//	}
//
//
//}
