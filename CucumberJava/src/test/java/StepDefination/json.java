package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class json {


	@Test
	public void myTest() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
		driver.quit();
	}
}
