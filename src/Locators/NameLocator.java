package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("Test@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(2000);
		driver.close();


	}

}
