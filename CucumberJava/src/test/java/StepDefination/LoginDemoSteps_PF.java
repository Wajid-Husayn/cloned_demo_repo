package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

public class LoginDemoSteps_PF {
	
	
	  WebDriver driver = null;
	  LoginPage_PF login;
	  HomePage_PF home;
	  
	@Given("browser is opened")
	public void browser_is_opened() {
		System.out.println("Inside Step- browser is open=== PF");
		System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//driver.navigate().to("https://google.com");

		driver.manage().window().maximize();
	}

	@And("user is on login paged")
	public void user_is_on_login_paged() {

		driver.navigate().to("https://example.testproject.io/web");
	}

	@When("^user entered (.*) and (.*)$")
	public void user_entered_username_and_password(String username, String password) throws InterruptedException {
		
		login = new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		//driver.findElement(By.id("name")).sendKeys(username);
		//driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(5000);
		
	
	}

	@Then("user is navigated to homepages")
	public void user_is_navigated_to_homepages() {
	  
		login.clickOnLogin();
	//	driver.findElement(By.id("login")).click();
	  home = new HomePage_PF(driver);
	  home.checkLogoutisDisplayed();
	 //driver.findElement(By.id("logout")).click();
	



		
	
		driver.close();
		driver.quit();
	}

}
