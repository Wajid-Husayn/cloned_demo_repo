package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {
	
//	  WebDriver driver = null;
//	@Given("browser is opened")
//	public void browser_is_opened() {
//		System.out.println("Inside Step- browser is open");
//		System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		
//		driver = new ChromeDriver(options);
//		//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//		//driver.navigate().to("https://google.com");
//
//		driver.manage().window().maximize();
//	}
//
//	@And("user is on login paged")
//	public void user_is_on_login_paged() {
//
//		driver.navigate().to("https://example.testproject.io/web");
//	}
//
//	@When("^user entered (.*) and (.*)$")
//	public void user_entered_username_and_password(String username, String password) {
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		
//	
//	}
//
//	@Then("user is navigated to homepages")
//	public void user_is_navigated_to_homepages() throws InterruptedException {
//	  driver.findElement(By.id("login")).click();
//	  
//	  Thread.sleep(2000);
//	  
//	 driver.findElement(By.id("logout")).click();
//	
//
//
//
//		
//		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
//	}

}
