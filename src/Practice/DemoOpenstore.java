package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOpenstore {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement Username=driver.findElement(By.xpath("//input[@name='username']"));
		Username.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("admin123");
		Thread.sleep(2000);
		WebElement Login=driver.findElement(By.xpath("//button[@type='submit']"));
		Login.click();
		Thread.sleep(2000);
		WebElement Admin=driver.findElement(By.xpath("//span[text()='Admin']"));
		Admin.click();
		WebElement Search=driver.findElement(By.xpath("(//input[contains(@class,'oxd-input')])[2]"));
		Search.sendKeys("admin");


	}

}
