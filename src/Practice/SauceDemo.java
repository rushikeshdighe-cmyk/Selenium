package Practice;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SauceDemo {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement Username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='user-name']")));
		Username.sendKeys("standard_user");
		WebElement Password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
		Password.sendKeys("secret_sauce");
		WebElement Login=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login-button']")));
		Login.click();
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		


	}

}
