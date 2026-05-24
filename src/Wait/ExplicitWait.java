package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Explicit Wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10) );
		WebElement Username= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
		Username.sendKeys("Test@gmail.com");
		WebElement Password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		Password.sendKeys("Test@123");
		driver.findElement(By.id("login-button"));
		driver.close();
	}

}
