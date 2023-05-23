package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;


public class GoogleSearchSteps {
	
	
	WebDriver driver = null ;


	@Given("browser is open")
	public void browser_is_open() {

		System.out.println("Inside Step- browser is open");
		System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		//driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//driver.navigate().to("https://google.com");

		//driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside Step- user is on google search page");
		driver.navigate().to("https://google.com");
	}

	@When("user enter text in search box")
	public void user_enter_text_in_search_box() {
		System.out.println("Inside Step- user enter text in search box");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");;
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("Inside Step-hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
		System.out.println("Inside Step- user is navigated to search result");
		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();
	}

}
