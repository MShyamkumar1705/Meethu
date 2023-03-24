package GitPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlipkartLogin {

	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		Reporter.log("login sucessfull flipkaert=================================================================================================");
		driver.findElement(By.name("q")).sendKeys("iphone");
		Reporter.log("Add Tow Statements");
		driver.close();
	}
}
