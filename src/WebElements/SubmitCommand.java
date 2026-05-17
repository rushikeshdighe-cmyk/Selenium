package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitCommand {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/facebook.html");
		Thread.sleep(2000);
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("Test@gmail.com");
		Thread.sleep(2000);
		WebElement Password=driver.findElement(By.xpath("//input[@id='pass']"));
		Password.sendKeys("1234567");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='u_0_b']")).submit();
		Thread.sleep(2000);
		driver.close();


	}

}
