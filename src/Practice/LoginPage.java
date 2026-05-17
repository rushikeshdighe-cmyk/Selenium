package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(2000);
		WebElement Username=driver.findElement(By.xpath("//input[@id='username']"));
		Username.sendKeys("student");
		Thread.sleep(2000);
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("Password123");
		Thread.sleep(2000);
		WebElement Login=driver.findElement(By.xpath("//input[@id='submit']"));
		Login.click();
		driver.close();
	}

}
