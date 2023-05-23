package lambdaDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Dem {

	@Test
	public void myTest() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().setSize(new Dimension(1366,768));
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
	}
	
}
